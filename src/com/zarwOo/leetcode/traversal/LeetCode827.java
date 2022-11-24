package com.zarwOo.leetcode.traversal;
//给你一个大小为 n x n 二进制矩阵 grid 。最多 只能将一格 0 变成 1 。
//返回执行此操作后，grid 中最大的岛屿面积是多少

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode827 {
    private int N;
    private int islandIndex = 2; // 岛屿编号，从2开始
    // 两次遍历，第一次把不同的岛标不同的号，并将
    public int largestIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        N = grid.length;
        // 存放每个岛屿对应面积
        Map<Integer, Integer> islandToArea = new HashMap<>();

        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                if(grid[i][j] == 1){
                    islandToArea.put(this.islandIndex, dfs(grid, i, j));
                    ++this.islandIndex;
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : islandToArea.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 遍历海洋
        int res = 0;
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                if(grid[i][j] == 0){
                    Set<Integer> jointIslands = checkAfterJoin(grid, i, j);
                    int tempArea = 0;
                    for(Integer island : jointIslands){
                        tempArea += islandToArea.get(island);
                    }
                    res = Math.max(res, tempArea);
                }
            }
        }

        return res;
    }

    public int dfs(int[][] grid, int r, int c){
        if(!inArea(grid, r, c) || grid[r][c] != 1){
            return 0;
        }
        grid[r][c] = this.islandIndex;
        return 1 + dfs(grid, r, c) + dfs(grid, r, c)
                + dfs(grid, r, c) + dfs(grid, r, c);
    }

    public boolean inArea(int[][] grid, int r, int c){
        return 0 <= r && r < N &&
                0 <= c && c < N;
    }

    // 返回该格子周围大陆的编号
    public Set<Integer> checkAfterJoin(int[][] grid, int r, int c){
        Set<Integer> jointIslands = new HashSet<>();
        if(inArea(grid, r - 1, c) && grid[r - 1][c] != 0){
            jointIslands.add(grid[r - 1][c]);
        }
        if(inArea(grid, r + 1, c) && grid[r + 1][c] != 0){
            jointIslands.add(grid[r + 1][c]);
        }
        if(inArea(grid, r, c - 1) && grid[r][c - 1] != 0){
            jointIslands.add(grid[r][c - 1]);
        }
        if(inArea(grid, r, c + 1) && grid[r][c + 1] != 0){
            jointIslands.add(grid[r][c + 1]);
        }
        return jointIslands;
    }

    @Test
    public void testLeetCode827() {
        LeetCode827 solution = new LeetCode827();
        int[][] grid = {
                {1, 1},
                {1, 0}
        };

        System.out.println(solution.largestIsland(grid));
    }
}
