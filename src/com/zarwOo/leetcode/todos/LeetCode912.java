package com.zarwOo.leetcode.todos;

import java.util.Random;

// 给你一个整数数组 nums，请你将该数组升序排列

public class LeetCode912 {

    public static void main(String[] args){
        LeetCode912 solution = new LeetCode912();
        int[] arr = {3,7,4,2,7,9};
        System.out.println(solution.sortArray(arr));
    }

    Random random = new Random();
    public int[] sortArray(int[] nums) {
        // 1.快速排序
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high){
        if(low < high){
            
        }
    }

    // 按两个元素索引 交换数组两个元素
    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
