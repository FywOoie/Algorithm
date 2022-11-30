package com.zarwOo.leetcode.linkedlist;

import com.zarwOo.Utils;
import com.zarwOo.leetcode.ListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        // 方法一：集合
        ListNode current = head;
        Set<ListNode> visited = new HashSet<>();
        while(current != null){
            if(visited.contains(current)){
                return current;
            }else{
                visited.add(current);
            }
            current = current.next;
        }
        return null;

//        // 双指针
//        if(head == null || head.next == null){
//            return null; // 不可能有环
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while(slow != fast){
//            if(fast.next == null || fast.next.next == null){
//                return null;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
    }

    @Test
    public void testLeetCode142(){
        LeetCode142 solution = new LeetCode142();
        ListNode test = Utils.generateListNode(5, true, 3);
        Utils.printListNode(test);
    }
}
