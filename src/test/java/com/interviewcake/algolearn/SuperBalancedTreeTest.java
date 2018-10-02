package com.interviewcake.algolearn;



import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuperBalancedTreeTest {
   private BalanceChecker checker = new BalanceChecker();

    @Test
    public void shouldReturnTrueIfRootIsNull(){
        BinaryTreeNode root= null;
        assertTrue(checker.isBalanced(root));
    }

    @Test
    public void shouldReturnFalseIfTreeContainsMoreThan2Depths(){
        BinaryTreeNode root = new BinaryTreeNode(1);

        BinaryTreeNode node1 = root.insertLeft(2);
        BinaryTreeNode node2 = root.insertRight(3);

        BinaryTreeNode node3 =node1.insertLeft(4);
        BinaryTreeNode node4 =node1.insertRight(5);
        node3.insertLeft(6);

        assertFalse(checker.isBalanced(root));
    }

    @Test
    public void shouldReturnFalseIfLeafsDepthMoreThan1(){
        BinaryTreeNode root = new BinaryTreeNode(1);

        BinaryTreeNode node1 = root.insertLeft(2);
        BinaryTreeNode node2 = root.insertRight(3);

        BinaryTreeNode node3 =node1.insertLeft(4);

        node3.insertLeft(6);

        assertFalse(checker.isBalanced(root));
    }

    @Test
    public void shouldReturnTrueIfTreeIsBalanced(){
        BinaryTreeNode root = new BinaryTreeNode(1);

        BinaryTreeNode node1 = root.insertLeft(2);
        BinaryTreeNode node2 = root.insertRight(3);

        BinaryTreeNode node3 =node1.insertLeft(4);
        BinaryTreeNode node4 =node1.insertRight(5);
        node2.insertRight(7);
        node3.insertLeft(6);

        assertTrue(checker.isBalanced(root));
    }
}
