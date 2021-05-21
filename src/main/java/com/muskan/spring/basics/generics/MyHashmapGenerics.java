package com.muskan.spring.basics.generics;

import java.util.LinkedList;
import java.util.List;

public class MyHashmapGenerics<K,V> {

    List<K> klist = new LinkedList<>();
    List<V> vList = new LinkedList<>();

    int index = 0;
    public void put(K k, V v){
        klist.add(k);
        vList.add(v);

    }

    public V get(K k){
        if(klist.contains(k)){
            index=klist.indexOf(k);
        }
        return vList.get(index);
    }

    public void listSize(){
        System.out.println("klist.size() and vList.size() : "+klist.size()+" "+vList.size());
    }
}
