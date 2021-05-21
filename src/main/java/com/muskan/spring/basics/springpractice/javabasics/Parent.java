package com.muskan.spring.basics.springpractice.javabasics;

public class Parent {

    private void show(){
        System.out.println("parent");
    }

    public void methodA(){
        System.out.println("parent's methodA");
        methodB();
    }
    public void methodB(){
        System.out.println("parent's methodB");
    }
}
