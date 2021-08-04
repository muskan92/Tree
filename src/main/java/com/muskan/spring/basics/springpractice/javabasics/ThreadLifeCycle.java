package com.muskan.spring.basics.springpractice.javabasics;

//import jdk.internal.jline.internal.Log;

import com.muskan.spring.basics.springpractice.SynchronizeDemo;

public class ThreadLifeCycle extends Thread{

    Integer lock = new Integer(1);
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new ThreadLifeCycle();
        Thread t = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        //Log.info(t.getState());
        t.setName("Prashant");
        t1.setName("Prashant12");
//t.run();
        //System.out.println(t.getState());
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t.getState()+"1");
        System.out.println(Thread.currentThread().getName()+" main");
        //Thread.sleep(1000000);
        t1.join();
        Thread.sleep(100000);

    }

    @Override
    public void run() {
        while (true){

        }
        //synchronized(this){

//            try {
//
//                System.out.println(Thread.currentThread().getName()+" ,2");
//                System.out.println("in run ()");
//                wait(30000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        //}

    }
}
