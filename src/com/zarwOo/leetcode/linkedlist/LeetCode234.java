package com.zarwOo.leetcode.linkedlist;

import com.zarwOo.leetcode.ListNode;

import java.util.List;
import java.util.ArrayList;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        List<Integer> nums = new ArrayList<Integer>(); // 将链表元素放到array中
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }

        // 双指针判断是否为回文数
        int end = nums.size() - 1;
        for(int i=0;i<=end/2;++i){
            if(nums.get(i) != nums.get(end-i)){
                return false;
            }
        }
        return true;
    }
}
