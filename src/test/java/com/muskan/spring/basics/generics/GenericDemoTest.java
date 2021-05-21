package com.muskan.spring.basics.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericDemoTest {

    @Test
    void getObj() {

        System.out.println(GenericDemo.addnum(10.5,11.6));

        GenericDemo <Integer> intObj = new GenericDemo<>(17);
        System.out.println(intObj.getObj());

        GenericDemo<String> strObj = new GenericDemo<>("Muskan");
        System.out.println(strObj.getObj());
    }
}