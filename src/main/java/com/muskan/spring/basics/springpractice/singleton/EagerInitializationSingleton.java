package com.muskan.spring.basics.springpractice.singleton;

public class EagerInitializationSingleton {

    private EagerInitializationSingleton(){

        System.out.println("in EagerInitializationSingleton private constructor");
    }
    private static final EagerInitializationSingleton eagerInitializationSingleton = new EagerInitializationSingleton();

    public static EagerInitializationSingleton getInstance(){
        System.out.println("in method"+""+Thread.currentThread().getName());
        return eagerInitializationSingleton;
    }
}
