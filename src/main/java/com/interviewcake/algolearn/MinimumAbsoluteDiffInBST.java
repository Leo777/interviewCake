package com.interviewcake.algolearn;

import com.interviewcake.algolearn.Model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumAbsoluteDiffInBST {
    private TreeNode prev;
    private int min =Integer.MAX_VALUE;


    public void getMinDiffRecursive(TreeNode node) {
        if(node == null) return;
        getMinDiffRecursive(node.left);
        if(prev != null) min = Math.min(node.val - prev.val,min);
        prev = node;
//        System.out.println(node.val);
        getMinDiffRecursive(node.right);
    }

    public int inOrder(TreeNode node){
        getMinDiffRecursive(node);
        return min;
    }

    public int getMinimumDifference(TreeNode root) {
        TreeNode prev = null;
        int min = Integer.MAX_VALUE;
        final Deque<TreeNode> stack = new ArrayDeque<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if(prev != null) min = Math.min(root.val-prev.val,min);
                prev=root;
                root = root.right;
            }
        }

        return min;
    }
}
