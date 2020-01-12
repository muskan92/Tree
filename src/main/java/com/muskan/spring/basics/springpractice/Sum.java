package com.muskan.spring.basics.springpractice;

public class Sum {

    public Integer getSum(Integer a,Integer b){
        System.out.println("This is integer");
        return a+b;
    }
    public static Long getSum(Long a, Long b){
        System.out.println("object called");
        return a+b;
    }


}

