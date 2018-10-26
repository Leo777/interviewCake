package com.interviewcake.algolearn;

import com.interviewcake.algolearn.Model.TreeNode;
import org.junit.Test;

public class MergeTwoBinaryTreesTest {

    @Test
    public void testMerge() {
        TreeNode root1 = new TreeNode(1);
        TreeNode leafLeft1 = new TreeNode(2);
        leafLeft1.left = new TreeNode(4);
        leafLeft1.right = new TreeNode(5);

        TreeNode leafRight1 = new TreeNode(3);
        root1.left = leafLeft1;
        root1.right = leafRight1;

        TreeNode root2 = new TreeNode(5);
        TreeNode leafLeft = new TreeNode(3);
        leafLeft1.left = new TreeNode(2);

        TreeNode leafRight = new TreeNode(6);
        leafRight.left = new TreeNode(1);
        leafRight.right = new TreeNode(4);

        root2.left = leafLeft;
        root2.right = leafRight;

        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        mergeTwoBinaryTrees.mergeTreesRecursion(root1,root2);

    }
}
