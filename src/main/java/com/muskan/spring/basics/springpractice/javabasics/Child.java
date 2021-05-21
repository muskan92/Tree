package com.muskan.spring.basics.springpractice.javabasics;

public class Child extends Parent {

    public void show(){
        System.out.println("child");
    }

    public void methodA(){
        System.out.println("child's methodA");
        super.methodA();
    }
    public void methodB(){
        System.out.println("child's methodB");
    }
}

class demo{
    public static void main(String[] args) {
        Parent p = new Child();
        p.methodA();
    }
}