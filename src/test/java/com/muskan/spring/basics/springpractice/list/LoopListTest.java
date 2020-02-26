package com.muskan.spring.basics.springpractice.list;

import com.muskan.spring.basics.springpractice.list.ListNode;
import com.muskan.spring.basics.springpractice.list.LoopList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoopListTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void detectLoop() {

        LoopList loop = new LoopList();
        loop.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        loop.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        loop.detectLoop();

        loop.printList();
        Assert.assertTrue(loop.fast==loop.slow);


    }
}