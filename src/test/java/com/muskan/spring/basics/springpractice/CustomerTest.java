package com.muskan.spring.basics.springpractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Before
    public void before(){

    }
    @Test
    public void testEquals() {
        Address address = new Address(943,"Mannat");
        Address address1 = new Address(943,"Mannat");

        Customer c = new Customer(68,"parshantava",address);
        Customer c1 = new Customer(68,"parshantava",address1);

        Assert.assertEquals(c.test(8),true);
        Assert.assertEquals(c.equals(c1),true);
        Assert.assertFalse(c.equals(address));

    }
}