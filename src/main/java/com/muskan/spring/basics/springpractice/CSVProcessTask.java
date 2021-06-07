package com.muskan.spring.basics.springpractice;

import com.google.common.collect.Lists;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CSVProcessTask {

    void updateOverHttp(int vin,List<Integer> res) throws InterruptedException {
        System.out.println("saving for vin : "+vin);
        res.add(vin+1);
        Thread.sleep(500);

    }
    void process(List<Integer> resultList, List<Integer> res) throws InterruptedException {
       Thread.sleep(500);
       for(Integer i : resultList) {
           updateOverHttp(i,res);
       }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        CSVProcessTask processTask = new CSVProcessTask();
        List<Integer> result = Collections.synchronizedList(new ArrayList<>()) ;
        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es1 = Executors.newFixedThreadPool(10);
        long stime = System.currentTimeMillis();
        List<Integer> integerList = IntStream.range(0, 20).boxed().collect(Collectors.toList());
//        Collection<List<Integer>> values = integerList.stream()
//                .collect(Collectors.partitioningBy(s -> integerList.indexOf(s) > 5))
//                .values();
        List<List<Integer>> partition = Lists.partition(integerList, 2);
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(partition);

        set.stream().forEach(li->{
            System.out.println(li);
            es.submit(()-> {
                try {
                    processTask.process(li,result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });


        es.shutdown();
        if(!es.awaitTermination(100, TimeUnit.MILLISECONDS)){
            System.out.println("didnt finish in 1 minute");
        }

        //processTask.process(IntStream.range(1,1001).boxed().collect(Collectors.toList()));
        System.out.println("time duration :"+(System.currentTimeMillis()-stime)/1000);

        partition.stream().forEach(li->{
            System.out.println(li);
            es1.submit(()-> {
                try {
                    processTask.process(li,result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });

        es1.shutdown();
        es1.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("time duration 1:"+(System.currentTimeMillis()-stime)/1000);

    }
}
