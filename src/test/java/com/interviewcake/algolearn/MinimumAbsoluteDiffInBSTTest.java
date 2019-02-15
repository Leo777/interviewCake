package com.interviewcake.algolearn;

import com.interviewcake.algolearn.Model.TreeNode;
import org.junit.Test;

public class MinimumAbsoluteDiffInBSTTest {


    @Test
    public void findMinAbsoluteDiff() {
        TreeNode root1 = new TreeNode(8);
        TreeNode leafLeft1 = new TreeNode(3);
        leafLeft1.left = new TreeNode(1);
        leafLeft1.right = new TreeNode(6);
        leafLeft1.right.left = new TreeNode(4);
        leafLeft1.right.right = new TreeNode(7);

        TreeNode leafRight1 = new TreeNode(10);
        leafRight1.right = new TreeNode(14);

        root1.left = leafLeft1;
        root1.right = leafRight1;

        MinimumAbsoluteDiffInBST diffInBST = new MinimumAbsoluteDiffInBST();
        System.out.println("Min: " +diffInBST.getMinimumDifference(root1));
    }
}
