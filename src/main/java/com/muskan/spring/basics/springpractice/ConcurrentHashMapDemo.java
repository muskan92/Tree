package com.muskan.spring.basics.springpractice;

import java.util.*;

public class ConcurrentHashMapDemo<K,V> implements Map<K,V> {

    Map<K,V> conMap = new HashMap<>();

    Object lock[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    int b =0;

    @Override
    public int size() {
        return conMap.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        synchronized (this) {
            return conMap.get(key);
        }
    }

    @Override
    public V put(K key, V value) {
        b = key.hashCode()%16;
        synchronized (lock[b]){

            //System.out.println("lock[b]:"+lock[b]);
            return conMap.put(key,value);
        }
    }

   /* @Override
   public V put(K key, V value){
       return conMap.put(key,value);
    }*/

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
