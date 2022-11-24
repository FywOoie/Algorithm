package com.zarwOo.leetcode.els;

import java.util.HashMap;
import java.util.Map;
public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int flag = nums.length / 2; // 满足多数元素条件
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;++i){
            if(counter.containsKey(nums[i])){
                if((counter.get(nums[i]) + 1) > flag)
                    return nums[i];
                counter.put(nums[i], counter.get(nums[i]) + 1);
            }else{
                counter.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
