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
    }

    @Test
    public void testLeetCode142(){
        LeetCode142 solution = new LeetCode142();
        ListNode test = Utils.generateListNode(4, true, 2);
        Utils.printListNode(test);
    }
}
