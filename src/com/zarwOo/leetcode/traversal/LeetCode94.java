package com.zarwOo.leetcode.traversal;// 题目描述：给定一个二叉树的根节点 root ，返回 它的 中序 遍历

import com.zarwOo.leetcode.TreeNode;

import java.util.List;

import java.util.ArrayList;

public class LeetCode94 {
    List<Integer> res = new ArrayList<Integer>(); // 存放结果
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }

    public void inorder(TreeNode node){
        // 中序遍历是先访问节点的左子树，再访问根节点，再访问右子树
        if(node == null){
            // 递归的返回条件
            return;
        }
        inorder(node.left);
        res.add(node.val);
        inorder(node.right);
    }

    public static void main(String[] args){
        LeetCode94 solution = new LeetCode94();
        TreeNode tree = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        ArrayList<Integer> result = (ArrayList<Integer>) solution.inorderTraversal(tree);
        System.out.println(result);   
    }
}
