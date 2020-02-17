package com.muskan.spring.basics.springpractice.javabasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBasicsTest {

    @Test
    void show() {

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        c.show();
    }
}