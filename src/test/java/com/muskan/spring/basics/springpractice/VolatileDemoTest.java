package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class VolatileDemoTest {

    @Test
    void increamentCounter() throws InterruptedException {

        VolatileDemo vd = new VolatileDemo();

        ExecutorService es = Executors.newFixedThreadPool(10);

        es.submit(()->{
            System.out.println("second thread "+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vd.counter=false;
        });


        IntStream.range(1,21).forEach(i->{

            es.submit(()->{
                while (vd.counter){
                    System.out.println(Thread.currentThread().getName()+ " "+i);
                }
                System.out.println(Thread.currentThread().getName()+vd.counter+ " "+i);

            });

        });

 /*       es.submit(new Runnable() {
            @Override
            public void run() {
                while(vd.counter){
                    System.out.println(Thread.currentThread().getName());
                }
                System.out.println("Frst Thread "+vd.counter);
            }
        });

        es.submit(()->{
           while (vd.counter){
               System.out.println(Thread.currentThread().getName());
           }
            System.out.println(Thread.currentThread().getName()+vd.counter);

        });*/


        es.submit(()->{
                    System.out.println("second thread "+Thread.currentThread().getName());
                    vd.counter=false;
                });

        es.shutdown();
        es.awaitTermination(40, TimeUnit.SECONDS);

        System.out.println("scnd Thread "+vd.counter);

    }
}