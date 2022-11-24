package com.zarwOo.leetcode.backtrace;
// 题目描述：给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合

import java.util.ArrayList;
import java.util.List;


public class LeetCode77 {
    private List<List<Integer>> res = new ArrayList<>(); // 储存结果
    private List<Integer> temp = new ArrayList<>();

    // 功能函数，返回组合
    public List<List<Integer>> combine(int n, int k) {
        if(n == 0)
            return res;
        backtrace(1, n, k);
        return res;
    }

    // 回溯算法获取结果
    private void backtrace(int index, int n, int k){
        if(temp.size() == k){
            res.add(temp); // 注意：这里要new ArrayList否则结果为空
            return;
        }
        // for循环
        for(int i = index; i <= n; ++i){
            temp.add(i);
            backtrace(i + 1, n, k); // 递归更新
            temp.remove(temp.size() - 1);
        }
    }

    // 主函数
    public static void main(String[] args){
        LeetCode77 l = new LeetCode77();
        
        System.out.println(l.combine(3, 2));
    }
}
