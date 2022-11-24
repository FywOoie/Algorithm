package com.zarwOo.leetcode.els;
// 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，
// 计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案

public class LeetCode338 {
    public static void main(String[] args){
        LeetCode338 solution = new LeetCode338();
        int next = 3; // 测试用例
        System.out.println(solution.toBinary(next)[0]);
        System.out.println(solution.toBinary(next)[1]);
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1]; // 初始化结果
        for(int i=0;i<=n;++i){
            int[] binaryRes = toBinary(i); // 第i个数的二进制
            res[i] = binaryRes[1]; // 第i个结果
        }
        return res;
    }
    public int[] toBinary(int decimal){
        // 返回的第一个数为二进制数，第二个数为这个数中1的个数
        int[] res = {0, 0};
        int t = 0; // 位数
        int r = 0; // 余数
        while(decimal != 0){
            r = decimal % 2;
            if(r == 1)
                res[1]++;
            decimal = decimal / 2;
            res[0] += r * Math.pow(10, t);
            t++;
        }
        return res;
    }
}