package com.muskan.spring.basics.springpractice.list;

import java.util.*;
import java.util.stream.IntStream;

public class ListInterFaceDemo {
    public static void main(String[] args) {
        List<Integer> order = new LinkedList<>();
        List<Integer> reverse = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        IntStream.range(0,10).boxed().forEach(i->{
            order.add(i);
            reverse.add(0,i);
            queue.add(i);
        });

        System.out.println(order);
        System.out.println(reverse);
        System.out.println(queue);
//List<String> list = Arrays.asList("dog","gffg","hfh");
//
//System.out.println(list.stream().reduce(new String(),(s1,s2) -> s1 + s2.charAt(0),(c1,c2) -> c1 += c2));

//        System.out.println(list.stream().reduce(
//                new Character(),(Character s1,s2)
//        ));

    }
}
