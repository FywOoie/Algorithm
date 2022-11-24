package com.zarwOo.leetcode.traversal;

public class LeetCode827 {
    public int largestIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int res = 0;
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }
    public int dfs(int[][] grid, int r, int c){

    }
    public boolean inArea(int[][] grid, int r, int c){
        return 0 <= r && r < grid.length &&
                0 <= c && c < grid[0].length;
    }
}
