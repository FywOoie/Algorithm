package com.zarwOo.leetcode.traversal;

import com.zarwOo.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class LeetCode101 {
    // 思路：先中序遍历然后判断是否中心对称
    public boolean isSymmetric(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return isCentralSymmetric(res);
    }

    public void inorder(TreeNode node, List<Integer> res){
        if(node == null)
            return;
        
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    public boolean isCentralSymmetric(List<Integer> list){
        int size = list.size();
        for(int i = 0;i < size / 2;++i){
            if(list.get(i) != list.get(size - i))
                return false;
        }
        return true;
    }

}
