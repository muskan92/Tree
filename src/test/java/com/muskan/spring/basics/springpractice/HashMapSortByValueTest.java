package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashMapSortByValueTest {

    @Test
    void sortByVal() {

        Map<Integer,String> map = new HashMap<>();
        map.put(32,"thirtytwo");
        map.put(64,"sixtyfour");
        map.put(81,"eightyone");
        map.put(95,"nintyfive");
        map.put(3,"three");
        map.put(2,"two");
        map.put(4,"four");
        map.put(1,"one");
        map.put(5,"five");
        map.put(3,"three");

        System.out.println(map);
        HashMapSortByValue sk = new HashMapSortByValue();
        sk.sortByVal((HashMap) map);
    }
}