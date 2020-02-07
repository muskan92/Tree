package com.muskan.spring.basics.springpractice;

import java.util.*;

public class HashMapSortByValue {

    public void sortByVal(HashMap map){

        List list = new LinkedList(map.values());
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
