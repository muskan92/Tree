package com.muskan.spring.basics.springpractice;

import java.util.*;

public class BfsGraph {

    Map<Integer, List<Integer>> graphMap = new TreeMap<>();
    Set<Integer> visited = new TreeSet<>();

    public void bfs(int n){

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited.add(n);

        while (!q.isEmpty()){

            n = q.remove();
            System.out.print(n+" ");
            graphMap.get(n).stream().forEach(i->{
                if(!visited.contains(i)){
                    q.add(i);
                    visited.add(i);
                }
            });
        }

    }
}
