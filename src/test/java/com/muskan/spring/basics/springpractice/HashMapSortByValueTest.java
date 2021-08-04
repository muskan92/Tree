package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import java.util.*;

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

        //Set<Map.Entry<Integer, String>> entries1 = map.entrySet();

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(a,b)->
             a.getValue().compareTo(b.getValue())
        );
       /// System.out.println(entries);
        //Collections.sort(al, Collections.reverseOrder());

        Collections.sort(entries,(a,b)->
                b.getKey().compareTo(a.getKey())
        );

        //Map.Entry<Integer, String> integerStringEntry = entries.get(0);

        System.out.println(entries);
//        System.out.println(map);
//        HashMapSortByValue sk = new HashMapSortByValue();
//        sk.sortByVal((HashMap) map);


    }
}

class ValueComparator implements Comparator<Map.Entry<Integer, String>>{


    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}