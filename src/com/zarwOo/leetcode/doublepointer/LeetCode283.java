package com.zarwOo.leetcode.doublepointer;
// 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序

import java.util.Arrays;

public class LeetCode283 {
    public int[] moveZeroes(int[] nums) {
        // 补0法
        int index = 0;
        // 去0
        for(int i=0;i<nums.length;++i){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        // 补0
        for(int j=index;j<nums.length;++j){
            nums[j] = 0;
        }
        return nums;
    }
    public static void main(String[] args){
        LeetCode283 solution = new LeetCode283();
        int[] in = {1,0,4,0,3,2}; // 测试用例
        System.out.println(Arrays.toString(solution.moveZeroes(in)));
    }
}
