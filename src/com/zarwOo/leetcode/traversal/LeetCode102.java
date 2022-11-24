package com.zarwOo.leetcode.traversal;// 返回二叉树的层序遍历
import com.zarwOo.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import java.util.LinkedList;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)    return res;
        bfs(root, res);
        return res;
    }

    public void bfs(TreeNode root, List<List<Integer>> res){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i = 0;i < n;++i){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null)   queue.offer(node.left);
                if(node.right != null)  queue.offer(node.right);
            }
            res.add(level);
        }
    }
}
