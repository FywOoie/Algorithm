package com.zarwOo.leetcode.traversal;


import org.junit.Test;

public class LeetCode200 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int res = 0;
        for(int r = 0; r < grid.length; ++r){
            for(int c = 0; c < grid[0].length; ++c){
                if(grid[r][c] == '1'){
                    ++res;
                    dfs(grid, r, c);
//                    for(char[] temp : grid){
//                        System.out.println(Arrays.toString(temp));
//                    }
                }
            }
        }
        return res;
    }
    // 深度优先搜索
    private void dfs(char[][] grid, int r, int c){
        if(!inArea(grid, r, c) || grid[r][c] != '1') return ;
        grid[r][c] = '2'; // 做标记
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
    // 判断是否越界
    private boolean inArea(char[][] grid, int r, int c){
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }

    @Test
    public void testLeetCode200(){
        LeetCode200 solution = new LeetCode200();
        char[][] grid = {{'1','0','1'},{'0','1','0'},{'1','0','1'}};
        System.out.println(solution.numIslands(grid));
    }
}
