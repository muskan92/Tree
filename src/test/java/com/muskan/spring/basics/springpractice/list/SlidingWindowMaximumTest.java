package com.muskan.spring.basics.springpractice.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    @Test
    void maxWindow() {

        int ar[] = new int[]{1,2,3,1,4,5,2,3,1};

        SlidingWindowMaximum sw = new SlidingWindowMaximum();

        sw.maxWindow(ar,ar.length,3);
    }
}