package com.muskan.spring.basics.springpractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketWindowTest {

    TicketWindow tw = new TicketWindow();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calc() {

        int a[] = {7,4,1,3,2,5};
        int b[] = {5,3,1,2,7,4};
        Assert.assertEquals(tw.calc(a,3),14);
        Assert.assertEquals(tw.calc(b,3),9);
        Assert.assertEquals(tw.calc(b,5),18);
        Assert.assertEquals(tw.calc(b,0),19);



    }
}