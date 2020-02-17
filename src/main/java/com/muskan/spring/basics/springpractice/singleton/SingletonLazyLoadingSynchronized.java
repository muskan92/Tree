package com.muskan.spring.basics.springpractice.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonLazyLoadingSynchronized {

    private static Lock lock = new ReentrantLock();
    private static Object object = new Object();
    private static SingletonLazyLoadingSynchronized instance;

    private SingletonLazyLoadingSynchronized(){

        System.out.println("SingletonLazyLoadingSynchronized");
    }

 /*   public static synchronized SingletonLazyLoadingSynchronized getInstance(){

        if(instance==null){
            instance = new SingletonLazyLoadingSynchronized();
        }
        return instance;
    }*/

/*    public static SingletonLazyLoadingSynchronized getInstance(){

        try {
            lock.lock();
            if (instance == null) {
                instance = new SingletonLazyLoadingSynchronized();
            }
        }finally {
            lock.unlock();
        }
        return instance;

    }*/

    public static SingletonLazyLoadingSynchronized getInstance(){

        System.out.println(Thread.currentThread().getName()+" "+instance);

            synchronized (SingletonLazyLoadingSynchronized.class){
            if (instance == null) {
                instance = new SingletonLazyLoadingSynchronized();
            }
        }
        return instance;

    }

//Lazy initialization with Double check locking
    public static SingletonLazyLoadingSynchronized getInstanceSDoubleCheck(){

        System.out.println(Thread.currentThread().getName()+" "+instance);
        if(instance==null) {
            synchronized (SingletonLazyLoadingSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonLazyLoadingSynchronized();
                }
            }
        }
        return instance;

    }
}
