package com.muskan.spring.basics.springpractice.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListAlternativeKthNodeTest {

    @Test
    void reverseListAlternateNode() {


        ReverseListAlternativeKthNode reverseList = new ReverseListAlternativeKthNode();
        reverseList.head = new ListNode(1);

        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode ninth = new ListNode(9);

        reverseList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;

        reverseList.head = reverseList.reverseListAlternateNode(reverseList.head,3);

        reverseList.printList(reverseList.head);

    }
}