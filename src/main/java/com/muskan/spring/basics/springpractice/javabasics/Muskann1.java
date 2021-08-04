package com.muskan.spring.basics.springpractice.javabasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Muskann1 {



    public static void main(String[] args) {
         List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,7,7);


        //Set<Integer> collect = list.stream().collect(Collectors.toSet());

        //collect.stream().forEach(System.out::println);

        List<Integer> collect1 = list.stream().filter(i -> i < 5).map(i->i*i)
                .collect(Collectors.toList());

        collect1.stream().forEach(System.out::print);


        //tional<List<Integer>> optionalList = Optional.of(new ArrayList<Integer>());

//        if(optionalList.isEmpty()){
//
//        }


//        LocalDateTime ldt = new LocalDateTime(new LocalDate(2021,06,07),
//                new LocalTime());


         System.out.println(LocalDateTime.now().plusDays(1));
//Temporal

}
}
