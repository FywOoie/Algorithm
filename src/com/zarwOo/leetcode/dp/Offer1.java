package com.zarwOo.leetcode.dp;// 斐波那契数列

public class Offer1 {
    public int fib(int n) {
        // 1 dp[i]代表第i个斐波那契数
        // 2 转移方程 dp[i] = dp[i-1] + dp[i-2]
        // 3 初始化 dp[0] = 1 dp[1] = 1
        // 4 遍历顺序 从前向后
        // 5 打印dp数组，用于debug
        if(n < 2)  return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;++i){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
