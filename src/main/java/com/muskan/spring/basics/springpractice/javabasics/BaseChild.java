package com.muskan.spring.basics.springpractice.javabasics;


public class BaseChild {
    public static void main(String[] args) {
        Base b = new Child1();
    }

}
class Base {
    Base(){
        System.out.println("Base..");
    }
}
class Child1 extends Base{
    Child1(){
        System.out.println("Child1..");
    }
}