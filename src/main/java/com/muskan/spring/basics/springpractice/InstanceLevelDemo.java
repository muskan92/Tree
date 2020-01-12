package com.muskan.spring.basics.springpractice;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class InstanceLevelDemo {
private static Object lockObj = new Object();
    public static Integer count = 0;

public void increment() throws InterruptedException {

    ExecutorService es = Executors.newFixedThreadPool(10);

    IntStream.range(0,100).forEach(i->es.submit(()->{
        synchronized (this){ //instancelevel
            //synchronized (InstanceLevelDemo.class){ --classlevel
        count++; }
    }
    ));

    //List<Integer> list1 = new ArrayList<>();
    //List<Integer> list = Collections.synchronizedList(list1);

    Map<Integer,Integer> m = new HashMap<>();
    Map<Integer,Integer> syncMap = Collections.synchronizedMap(m);

    Queue<Integer> q = new ArrayBlockingQueue<Integer>(4);

    es.shutdown();
    es.awaitTermination(60, TimeUnit.SECONDS);
}



}
