package com.muskan.spring.basics.springpractice;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizeDemoTest {

    @Test
    public void sync() throws InterruptedException {

        SynchronizeDemo st = new SynchronizeDemo();
        st.sync();
        //st.sync();


       /* ExecutorService es = Executors.newFixedThreadPool(5);

        IntStream.range(0, 10)
                .forEach(i -> es.submit(()-> {
                    try {
                        System.out.println("calling st"+i);
                        st.sync();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));

        es.shutdown();
        es.awaitTermination(60, TimeUnit.SECONDS);
*/
        System.out.println(SynchronizeDemo.count);


        //Assert.assertEquals(1000,SynchronizeTest.count);
    }

    @Test
    public void testmethod(){
        System.out.print("hg");
    }
}