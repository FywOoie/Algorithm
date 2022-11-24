package com.zarwOo.leetcode.linkedlist;

import com.zarwOo.leetcode.ListNode;

import java.util.Set;
import java.util.HashSet;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        while(ptrA != null){
            set.add(ptrA);
            ptrA = ptrA.next;
        }
        while(ptrB != null){
            if(set.contains(ptrB)){
                return ptrB;
            }
            ptrB = ptrB.next;
        }
        return null;
    }
}
