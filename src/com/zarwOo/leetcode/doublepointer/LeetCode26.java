package com.zarwOo.leetcode.doublepointer;

import java.util.HashSet;

// 返回新数组长度，并原地修改
import java.util.Set;
import java.util.HashSet;
public class LeetCode26{
    public int removeDuplicates(int[] nums) {
        Set<Integer> appearence = new HashSet<Integer>();
        int index = 0;
        int[] temp = nums;
        for(int i=0;i<temp.length;++i){
            if(appearence.contains(temp[i])){
                nums[index++] = temp[i];
            }else{
                appearence.add(temp[i]);
            }
        }
        return index;
    }
}