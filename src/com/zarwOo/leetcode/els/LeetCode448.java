package com.zarwOo.leetcode.els;

import java.util.ArrayList;
import java.util.List;

// 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。
// 请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        boolean[] isContained = new boolean[nums.length];
        for(int i=0;i<nums.length;++i){
            isContained[nums[i] - 1] = true;
        }

        for(int i=0;i<nums.length;++i){
            if(!isContained[i]){
                res.add(i + 1);
            }
        }
        return res;
    }
    
}
