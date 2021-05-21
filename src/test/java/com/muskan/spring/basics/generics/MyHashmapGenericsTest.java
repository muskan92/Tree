package com.muskan.spring.basics.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashmapGenericsTest {

    @Test
    void putintInt() {

        MyHashmapGenerics <Integer,Integer> intInt = new MyHashmapGenerics();
        MyHashmapGenerics <Integer,String> intStr = new MyHashmapGenerics();
        MyHashmapGenerics <String,Integer> strInt = new MyHashmapGenerics();

        intInt.put(1,11);
        intInt.put(2,22);

        //intInt.get(2);
        System.out.println("intInt.get(1):"+intInt.get(1));
        System.out.println("intInt.get(2):"+intInt.get(2));

       // intStr.put(2,"Two");
       // strInt.put("Three",3);


    }
}