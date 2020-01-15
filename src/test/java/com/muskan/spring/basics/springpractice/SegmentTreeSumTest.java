package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SegmentTreeSumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSegTree() {

        int ar[] = {0,1,2,6,7};
        int s =0;
        int e = ar.length;
        int sga[] = new int[2*e];
        SegmentTreeSum st = new SegmentTreeSum();
        Arrays.fill(sga, -1);

        st.createSegTree(ar, s, e-1, 0, sga);

        Arrays.stream(sga).filter(i->i>=0)
                .forEach(i->{
            System.out.print(i+" ");
        });

        System.out.println();
        int sum = st.sumOfRange(1,3,sga, 0,e-1, 0);

        System.out.print("Sum of 1 to 3 is :"+sum);
    }
}