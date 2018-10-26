package com.interviewcake.algolearn;

import com.interviewcake.algolearn.Model.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head != null){
            ListNode temp = head.next;
            ListNode val = head;
            ListNode tail = val;
            while (val.next != null){
                tail = val.next;
            }
            head.next = tail.next;
            tail.next = temp;


        }

        return head;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if(head != null){
            ListNode temp = head.next;
            ListNode val = head;
            ListNode tail = val;
            while (val.next != null){
                tail = val.next;
            }
            head.next = tail.next;
            tail.next = temp;


        }

        return head;
    }
}
