package com.zarwOo.leetcode.traversal;

import org.testng.annotations.Test;

public class LeetCode695 {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int res = 0;
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == 1){
                    res = Math.max(res, dfs(grid, i, j));
                }
            }
        }
        return res;
    }

    public int dfs(int[][] grid, int r, int c){
        if(!inArea(grid, r, c) || grid[r][c] != 1){
            return 0;
        }
        grid[r][c] = 2;
        // 1的含义为当前遍历到的格子算一个面积
        return 1 + dfs(grid, r - 1, c) + dfs(grid, r + 1, c)
                + dfs(grid, r, c - 1) + dfs(grid, r, c + 1);
    }

    public boolean inArea(int[][] grid, int r, int c){
        return 0 <= r && r < grid.length &&
                0 <= c && c < grid[0].length;
    }

    @Test
    public void testLeetCode695(){
        LeetCode695 solution = new LeetCode695();
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(solution.maxAreaOfIsland(grid));
    }
}
