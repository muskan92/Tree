package com.muskan.spring.basics.springpractice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch bs;
    int [] ar;
    @org.junit.Before
    public void setUp() throws Exception {
         bs = new BinarySearch();
         ar = new int[]{1, 2, 4, 7, 9};
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void bSearch() {



        int indx = bs.bSearch(ar,4);
        Assert.assertEquals(2,indx);
        Assert.assertEquals(bs.bSearch(ar,22),-1);
        Assert.assertEquals(bs.bSearch(ar,9),ar.length-1);
        Assert.assertEquals(bs.bSearch(ar,1),0);
        Assert.assertEquals(bs.bSearch(new int []{},2),-1);
    }
    @Test
    public void bSearchParamCheck(){
        Assert.assertEquals(bs.bSearch(null,9),-1);
        Assert.assertEquals(bs.bSearch(ar,Integer.MAX_VALUE),-1);

    }

    @Test
    public void testBSearch() {
    }
}