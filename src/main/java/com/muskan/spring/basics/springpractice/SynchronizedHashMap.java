package com.muskan.spring.basics.springpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedHashMap<K,V> implements Map<K,V> {

    Map<K,V> syncMap = new HashMap<>();

    private Object lock = new Object();

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
        synchronized (lock){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return syncMap.get(key);
        }
    }

    @Override
    public V put(K key, V value) {
        synchronized (lock){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
