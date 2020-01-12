package com.muskan.spring.basics.springpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class SynchronizeDemo {

    volatile static boolean flag = false;
    /*volatile static*/
    Lock l = new ReentrantLock();
    public static int count;
     void increment() {
         l.lock();
             count++;
             l.unlock();
    }

    synchronized static void incrementSync() {

         count++;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sync() throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(50);
        SynchronizeDemo st = new SynchronizeDemo();

        IntStream.range(0, 500).peek(i->System.out.println("Pool size is now " +
                ((ThreadPoolExecutor) es).getActiveCount() ))
                .forEach(i -> es.submit(()-> SynchronizeDemo.incrementSync()));

        if (es instanceof ThreadPoolExecutor) {
            System.out.println("Pool final is now " +
                            ((ThreadPoolExecutor) es).getActiveCount() );
        }
        es.shutdown();
        if (es instanceof ThreadPoolExecutor) {
            System.out.println("Pool final 2 is now " +
                    ((ThreadPoolExecutor) es).getActiveCount() );
        }
        es.awaitTermination(600, TimeUnit.SECONDS);
        if (es instanceof ThreadPoolExecutor) {
            System.out.println("Pool final 3 is now " +
                    ((ThreadPoolExecutor) es).getActiveCount() );
        }

    }



    }