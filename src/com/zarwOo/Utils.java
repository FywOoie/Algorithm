package com.zarwOo;

import com.zarwOo.leetcode.ListNode;
import org.junit.Test;

public class Utils {

    // 生成num个节点的ListNode
    // 第一个参数为节点个数，第二个参数为是否有环，第三个参数为环回节点的位置
    public static <T> ListNode generateListNode(T ...args){
        int argsSize = args.length;
        int num = argsSize >= 1 ? (Integer) args[0] : 3; // 若未指定节点个数，生成三个
        boolean isRing = argsSize >= 2 ? (Boolean) args[1] : false; // 若未指定是否有环，
        int ringNodeIndex = argsSize >= 3 ? (Integer) args[2] : 0;

        ListNode dummy = new ListNode(-1);
        ListNode current1 = dummy;
        for(int i = 0; i < num; ++i) {
            current1.next = new ListNode(i);
            current1 = current1.next;
        }
        // 有环的话在指定位置加
        if(isRing){
            ListNode current2 = dummy.next;
            int c2 = 0;
            while(current2 != null){
                if(c2 == ringNodeIndex){
                    current1.next = current2;
                    break;
                }
                current2 = current2.next;
                ++c2;
            }
        }
        return dummy.next;
    }

    // 打印链表
    public static void printListNode(ListNode node){
        if(node == null){
            System.out.println("Empty ListNode");
            return ;
        }

        // 如果有环会一直打印，设定上限为10个
        int count = 0;
        boolean end = true;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
            if(count > 10){
                end = false;
                break;
            }
            ++count;
            // 注意：对node的遍历并不会改变传入的node
            // 这是因为引用变量的直接操作相当于值传递，不会改变原来的引用变量
            // 但是如果对引用变量的属性进行操作，会改变原有引用的属性
            // node.val = 1000第二次打印时会变成1000->1000->1000->null
        }
        if(end){
            System.out.print("null");
        }else{
            System.out.print("...");
        }
        System.out.println();
    }

    @Test
    public void testUtils(){
        ListNode test = Utils.generateListNode(4, true, 2);
        Utils.printListNode(test);
    }
}
