package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.*;

public class DfsGraph {

    Map<Integer, List<Integer>> graphMap = new TreeMap<>();
    Set<Integer> visited = new TreeSet<>();

    public void dfs(int n){

        visited.add(n);
        graphMap.get(n).stream().forEach(v->{
            if(!visited.contains(v)){
                //visited.add(v);
                dfs(v);
            }
        });
        System.out.print(n+" ");

    }
}
