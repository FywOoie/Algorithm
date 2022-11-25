package com.zarwOo.leetcode.linkedlist;

import com.zarwOo.leetcode.ListNode;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        // 方法一：哈希集合
        // Set<ListNode> visited = new HashSet<ListNode>();
        // while(head != null){
        //     if(visited.contains(head)){
        //         return true;
        //     }else{
        //         visited.add(head);
        //     }
        //     head = head.next;
        // }
        // return false;

        // 方法二：快慢指针
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast.next == null ||fast.next.next == null) // fast跑的快，如果fast遇到了null，说明没环
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true; // 慢指针追上了快指针
    }
}
