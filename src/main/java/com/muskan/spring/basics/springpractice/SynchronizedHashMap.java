package com.muskan.spring.basics.springpractice;

import java.util.*;

public class SynchronizedHashMap<K,V> implements Map<K,V> {

    Map<K,V> syncMap = new HashMap<>();

   // private Object lock = new Object();

    @Override
    public int size() {
        return 0;
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
        synchronized (syncMap){

            return syncMap.get(key);
        }
    }

    @Override
    public V put(K key, V value) {
        synchronized (syncMap){
           return syncMap.put(key,value);

        }
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

        Map<K, V> kvMap = Collections.synchronizedMap(syncMap);

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
