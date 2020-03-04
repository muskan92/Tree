package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentTest {

    @Test
    void abc() {

        Parent p = new Child();
        //p.sum();
        p.substract();
    }
}