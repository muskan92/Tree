package com.muskan.spring.basics.springpractice.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class EagerInitializationSingletonTest {

    @Test
    public void EagerInitializationSingletonTest() throws InterruptedException {
        //EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
        System.out.println(Thread.currentThread().getName());
        ExecutorService es = Executors.newFixedThreadPool(100);
        IntStream.range(1,101).forEach(i->{
            es.submit(()->{
                EagerInitializationSingleton instanceThread = EagerInitializationSingleton.getInstance();
                System.out.println(instanceThread+" "+Thread.currentThread().getName());
            });
        });
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }

    @Test
    public void EagerInitializationSingletonStaticBlockTest() throws InterruptedException {
        //EagerInitializationSingletonStaticBlock instance = EagerInitializationSingletonStaticBlock.instance;
       // EagerInitializationSingletonStaticBlock instance1 = EagerInitializationSingletonStaticBlock.instance;
        //System.out.println(instance);

        ExecutorService es = Executors.newFixedThreadPool(100);
        IntStream.range(1,101).forEach(i->{
            es.submit(()->{
                EagerInitializationSingletonStaticBlock instanceThread = EagerInitializationSingletonStaticBlock.instance;
                //Assert.assertTrue(instanceThread==instance);
                System.out.println(instanceThread+" "+Thread.currentThread().getName());
            });
        });

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }

    @Test
    public void SingletonLazyLoadingTest() throws InterruptedException {
        //SingletonLazyLoading instance = SingletonLazyLoading.getInstance();
        //System.out.println(instance);

        ExecutorService es = Executors.newFixedThreadPool(1000);
        IntStream.range(1,1001).forEach(i->{
            es.submit(()->{
                SingletonLazyLoading instanceThread = SingletonLazyLoading.getInstance();
                //Assert.assertTrue(instanceThread==instance);
                System.out.println(instanceThread+" "+Thread.currentThread().getName());
            });
        });

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }

    @Test
    public void SingletonLazyLoadingSynchronizedTest() throws InterruptedException {
        //SingletonLazyLoading instance = SingletonLazyLoading.getInstance();
        //System.out.println(instance);

        ExecutorService es = Executors.newFixedThreadPool(1000);
        IntStream.range(1,1001).forEach(i->{
            es.submit(()->{
                SingletonLazyLoadingSynchronized instanceThread = SingletonLazyLoadingSynchronized.getInstance();
                //Assert.assertTrue(instanceThread==instance);
                System.out.println(instanceThread+" "+Thread.currentThread().getName());
            });
        });

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }

    @Test
    public void BillPughSingletonTest() throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(1000);
        IntStream.range(1,1001).forEach(i->{
            es.submit(()->{
                BillPughSingleton instanceThread = BillPughSingleton.getInstance();
                System.out.println("*** "+instanceThread+" "+Thread.currentThread().getName());
            });
        });

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }

}