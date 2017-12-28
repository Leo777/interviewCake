package com.interviewcake.algolearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalanceChecker{

private class NodeDepthPair {
    BinaryTreeNode node;

    int depth;

    public NodeDepthPair(BinaryTreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

    public boolean isBalanced(BinaryTreeNode root) {

        if (root == null) {
            return true;
        }

        Stack<NodeDepthPair> nodes = new Stack<NodeDepthPair>();
        List<Integer> depthsList = new ArrayList<Integer>();
        nodes.push(new NodeDepthPair(root, 0));

        while (!nodes.isEmpty()) {
            NodeDepthPair pair = nodes.pop();
            BinaryTreeNode node = pair.node;
            int depth = pair.depth;

            if (node.left == null && node.right == null) {

                if (!depthsList.contains(depth)) {
                    depthsList.add(depth);

                    if (depthsList.size() > 2 || depthsList.size() == 2 && (Math.abs(depthsList.get(0) - depthsList.get(1)) > 1)) {
                        return false;
                    }
                }

            }else{
                if (node.left != null)
                nodes.push(new NodeDepthPair(node.left,depth+1));

                if (node.right != null)
                nodes.push(new NodeDepthPair(node.right, depth+1));
            }
        }

        return true;
    }

}

