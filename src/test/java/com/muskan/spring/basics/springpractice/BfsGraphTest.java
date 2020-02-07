package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BfsGraphTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void bfs() {

        BfsGraph bg = new BfsGraph();
        bg.graphMap.put(1,new ArrayList<>());
        bg.graphMap.get(1).add(2);
        bg.graphMap.get(1).add(3);

        bg.graphMap.put(6,new ArrayList<>());
        bg.graphMap.get(6).add(4);
        bg.graphMap.get(6).add(5);

        bg.graphMap.put(2,new ArrayList<>());
        bg.graphMap.get(2).add(1);
        bg.graphMap.get(2).add(4);

        bg.graphMap.put(3,new ArrayList<>());
        bg.graphMap.get(3).add(1);
        bg.graphMap.get(3).add(4);
        bg.graphMap.get(3).add(62);

        bg.graphMap.put(62,new ArrayList<>());
        bg.graphMap.get(62).add(3);


        bg.graphMap.put(55,new ArrayList<>());
        bg.graphMap.get(55).add(5);


        bg.graphMap.put(4,new ArrayList<>());
        bg.graphMap.get(4).add(2);
        bg.graphMap.get(4).add(3);
        bg.graphMap.get(4).add(5);
        bg.graphMap.get(4).add(6);

        bg.graphMap.put(5,new ArrayList<>());
        bg.graphMap.get(5).add(4);
        bg.graphMap.get(5).add(6);
        bg.graphMap.get(5).add(7);
        bg.graphMap.get(5).add(55);


        bg.graphMap.put(7,new ArrayList<>());
        bg.graphMap.get(7).add(5);


        bg.bfs(1);

        System.out.print("with Key set");

        bg.graphMap.keySet().stream().forEach(k->{
            System.out.println(k+" "+bg.graphMap.get(k));
        });
    System.out.print("with Entry set");
        bg.graphMap.entrySet().stream().forEach(e->{
            System.out.println(e.getKey()+" "+e.getValue());
        });

        System.out.print("visited set");

        bg.visited.stream().forEach(s->{System.out.println(s);});

        System.out.println("DFS called");

        DfsGraph dg = new DfsGraph();
        dg.graphMap.putAll(bg.graphMap);
        dg.dfs(1);

    }
}