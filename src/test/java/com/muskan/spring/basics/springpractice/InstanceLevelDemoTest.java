package com.muskan.spring.basics.springpractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class InstanceLevelDemoTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void incrementTest() throws InterruptedException {

        InstanceLevelDemo id = new InstanceLevelDemo();
        InstanceLevelDemo id1 = new InstanceLevelDemo();

        ExecutorService es = Executors.newFixedThreadPool(10);
        IntStream.range(0,100).forEach(i->es.submit(()-> {
            try {
                new InstanceLevelDemo().increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        es.shutdown();
        es.awaitTermination(60, TimeUnit.SECONDS);


        System.out.println(InstanceLevelDemo.count);

    }
}