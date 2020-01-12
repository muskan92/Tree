package com.muskan.spring.basics.springpractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
    Sum s;
    @Before
    public void setUp() throws Exception {
         s = new Sum();

    }

    @Test
    public void getSum() {

        //Assert.assertTrue((Integer) s.getSum((Object)3,(Object)7)==10);

        //Assert.assertTrue(s.getSum("a","a").equals("aa"));

        //s.set(new ArrayList<>());

    }

    @Test
    public void testGetSum() {
    }
}