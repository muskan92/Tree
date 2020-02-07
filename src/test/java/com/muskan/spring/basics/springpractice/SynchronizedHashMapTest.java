package com.muskan.spring.basics.springpractice;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SynchronizedHashMapTest{

    @Test
    public void SynchronizedHashMaptestmethod() throws InterruptedException {
       Map sm = new SynchronizedHashMap();

        System.out.println(sm.get(69));
        ExecutorService es = Executors.newFixedThreadPool(10);

        long startTime = System.nanoTime();

        IntStream.range(1,1600).forEach(i->{
            es.execute(()->sm.put(i,i));
        });

        IntStream.range(1,100).forEach(i->{
            es.execute(()->
                    System.out.println(sm.get(i)));
        });

        es.shutdown();
        es.awaitTermination(60,TimeUnit.SECONDS);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.println("duration: " +(duration/1000000000));

    }

    @Test
    public void concurrentHashMaptestmethod() throws InterruptedException {
        Map<String, AtomicInteger> ch = new ConcurrentHashMap<>();
        AtomicInteger a = new AtomicInteger(1);
        ch.put("one1",a);
//        ch.put("one2",1000);
//        ch.put("one3",2000);
//        ch.put("one4",3000);

        ExecutorService es = Executors.newFixedThreadPool(105);
        IntStream.range(1,500).forEach(i->{
            es.execute(()->ch.get("one1").getAndIncrement());
        });

        es.shutdown();
        es.awaitTermination(60,TimeUnit.SECONDS);

        IntStream.range(1,5).forEach(i->{
                    System.out.println(ch.get("one"+i));
        });


    }

    //functional interface
    interface Arithmetic {
        int operation(int a, int b);
    }
    @Test
    public void lambdaTest(){
        Arithmetic addTest = (int a, int b)->(a+b);
        //System.out.println(addTest.operation(4,5));

        List<Integer> li = Arrays.asList(1,2);
        Integer sum = li.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }

}