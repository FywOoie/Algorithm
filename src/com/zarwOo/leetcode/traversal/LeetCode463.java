package com.zarwOo.leetcode.traversal;

import org.testng.annotations.Test;

// 岛屿的周长
public class LeetCode463 {
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0)    return 0;
        int res = 0;
        for(int i = 0;i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == 1){
                    return dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    // 含义为当前格子的周长
    public int dfs(int[][] grid, int r, int c){
        // 若越界，说明有周长
        if(!inArea(grid, r, c)){
            return 1;
        }
        // 若旁边为海
        if(grid[r][c] == 0){
            return 1;
        }
        // 若遍历过，不算
        if(grid[r][c] == 2){
            return 0;
        }
        grid[r][c] = 2;
        return dfs(grid, r - 1, c) + dfs(grid, r +1, c)
                + dfs(grid, r, c - 1) + dfs(grid, r, c + 1);
    }

    public boolean inArea(int[][] grid, int r, int c){
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }

    @Test
    public void testLeetCode463(){
        LeetCode463 solution = new LeetCode463();
        int[][] grid = {{0,1,0},{1,1,1},{0,1,0}};
        System.out.println(solution.islandPerimeter(grid));
    }
}
