package com.zarwOo.leetcode.tree;

import com.zarwOo.leetcode.TreeNode;

import java.util.List;

import java.util.ArrayList;

// 给你一棵二叉搜索树，请 按中序遍历 
// 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，
// 并且每个节点没有左子节点，只有一个右子节点。

public class Offer52 {
    List<Integer> ldr_res;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null)    return null;
        ldr_res = new ArrayList<Integer>();
        ldr(root);
        return generateTree();
    }

    // 中序遍历
    public void ldr(TreeNode node){
        if(node == null)    return;
        ldr(node.left);
        ldr_res.add(node.val);
        ldr(node.right);
    }

    // 生成树
    public TreeNode generateTree(){
        TreeNode res = new TreeNode(0);
        TreeNode temp = res;
        for(int num : ldr_res){
            temp.right = new TreeNode(num);
            temp = temp.right;
        }
        return res.right;
    }
}
