package com.muskan.spring.basics.springpractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumPathInMatrixTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void calc() {
        int a[][] = {
                {4, 6, 1, 0},
                {2, 6, 0, 9},
                {4, 0, 7, 1},
                {6, 1, 0, 3}
        };

        MaxSumPathInMatrix sum = new MaxSumPathInMatrix();

        sum.calc(a);
    }
}