package com.zarwOo.leetcode.linkedlist;

import com.zarwOo.leetcode.ListNode;

class LeetCode2{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0); // 储存结果的节点
        ListNode temp = res; // 用做遍历节点
        int flag = 0;
        while((l1 != null) || (l2 != null)){
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            int sum = val1 + val2 + flag;
            if(sum >= 10){
                sum -= 10;
                flag = 1;
            }else{
                flag = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        if(flag == 1){
            // 最后一位还有进位
            temp.next = new ListNode(flag);
        }
        return res.next;
    }
}