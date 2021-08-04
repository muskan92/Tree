package com.muskan.spring.basics.springpractice.javabasics;

import java.util.*;
import java.util.stream.Collectors;

public class KFrequentElements {
    public static void main(String[] args) {

        int k=2;
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,5);
        map.put(2,3);
        map.put(3,2);
        map.put(4,1);
        map.put(5,7);
        map.put(0,6);

        Queue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue().compareTo(b.getValue()));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(pq.size()<k){
                pq.add(entry);
            }else{
                if(pq.peek().getValue()<entry.getValue()){
                    pq.remove();
                    pq.add(entry);
                }
            }
        }

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        List<Integer> collect = pq.stream().map(i -> i.getKey()).collect(Collectors.toList());

    }
}
