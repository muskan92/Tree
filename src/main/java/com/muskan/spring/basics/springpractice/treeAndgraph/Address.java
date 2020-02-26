package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.*;

public class Address {

    Integer hNum;
    String hName;

    public Address(Integer hNum, String hName) {
        this.hNum = hNum;
        this.hName = hName;
    }

    public boolean equals(Object obj){
        if(obj==null || obj.getClass()!=this.getClass())
            return  false;
        else if (this==obj)
            return  true;
        Address temp = (Address) obj;
        return Objects.equals(this.hName,temp.hName)&&
                Objects.equals(this.hNum,temp.hNum);
    }

    public static class BfsGraph {

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
}
