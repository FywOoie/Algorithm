package com.zarwOo.leetcode.dp;

// 一次走1步或者2步，走上n节台阶的方法
public class LeetCode70 {
    public int climbStairs(int n) {

        // 1. dp[i]代表上i个台阶的组合方法
        // 2. 因为只能上一步或者两步，dp[i] = dp[i-1] + dp[i-2]
        // 3. 初始状态dp[0] = 0, dp[1] = 1, dp[2] = 2
        // 4. 遍历顺序 从前往后
        // 5. 打印dp数组debug
        if(n < 3)   return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; ++i){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args){
        System.out.println("!2");
    }
}
