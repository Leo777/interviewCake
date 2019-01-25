package com.interviewcake.algolearn;

import com.interviewcake.algolearn.Model.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head != null) {
            ListNode preNode = null;
            ListNode currNode = head;
            ListNode nextNode = null;
            while (currNode != null) {
                nextNode = currNode.next;
                currNode.next = preNode;
                preNode = currNode;
                currNode = nextNode;
            }
            head = preNode;


        }
        return head;
    }
}
