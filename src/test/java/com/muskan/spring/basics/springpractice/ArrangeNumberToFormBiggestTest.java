package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrangeNumberToFormBiggestTest {

    @Test
    void formLargest() {

        ArrangeNumberToFormBiggest ar = new ArrangeNumberToFormBiggest();

        int a[] = {54,546,548,60};

        ar.formLargest(a);
    }
}