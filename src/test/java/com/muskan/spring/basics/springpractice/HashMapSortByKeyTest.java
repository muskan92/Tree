package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashMapSortByKeyTest {

    @Test
    void sortByKey() {

        Map<Integer,String> map = new HashMap<>();
        map.put(29,"two");
        map.put(45,"four");
        map.put(100,"one");
        map.put(52,"five");
        map.put(38,"three");

        System.out.println(map);
        HashMapSortByKey sk = new HashMapSortByKey();
        sk.sortByKey((HashMap) map);

        //linked hashmap example
        Map<Integer,String> lmap = new LinkedHashMap<>();
        lmap.put(29,"two");
        lmap.put(45,"four");
        lmap.put(100,"one");
        lmap.put(52,"five");
        lmap.put(38,"three");

        System.out.println("Linked map");
        lmap.keySet().stream().forEach(k->{
            System.out.println(k+" "+lmap.get(k));
        });

    }
}