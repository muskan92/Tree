package com.muskan.spring.basics.springpractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetToNumberTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void alphaToNum() {

        AlphabetToNumber a = new AlphabetToNumber();
        Assert.assertEquals(a.alphaToNum("AB"),28);
        Assert.assertEquals(a.alphaToNum("BB"),54);

    }
}