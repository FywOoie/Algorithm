package com.zarwOo.leetcode.todos;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
// 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; ++i){
            // 这一层是固定第一个数
            for(int j = i + 1; j < n - 1; ++j){
                // 这一层是固定第二个数
                for(int k = j + 1; k < n; ++k){
                    // 这一层是递归第三个数寻找答案
                    List<Integer> pre = new ArrayList<>();
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        if((pre.size() != 0) && pre.get(0) == nums[i] && pre.get(1) == nums[j]){
                            res.add(tmp);
                            pre = res.get(res.size() - 1);
                        }
                        pre = tmp;
                    }
                }
            }
        }
        return res;
    }

    @Test
    void test(){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
