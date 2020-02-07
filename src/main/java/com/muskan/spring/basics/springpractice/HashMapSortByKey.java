package com.muskan.spring.basics.springpractice;

import java.util.*;

public class HashMapSortByKey {

    public void sortByKey(HashMap hashMap){

        System.out.println("Before Sorting");
        Set<Integer> set1 = hashMap.keySet();
        set1.stream().forEach(key->{
            System.out.println(key+" "+hashMap.get(key));
        });

        List list = new LinkedList(hashMap.keySet());

        Map<Integer,String> tmap = new TreeMap<>(hashMap);
        Set<Integer> set = tmap.keySet();
        System.out.println("After sorting th map:");
        set.stream().forEach(key->{
            System.out.println(key+" "+tmap.get(key));
        });
    }
}
