package com.muskan.spring.basics.springpractice.singleton;

public class SingletonLazyLoading {

    private static SingletonLazyLoading instance;

    private SingletonLazyLoading(){

        System.out.println("SingletonLazyLoading");
    }

    public static SingletonLazyLoading getInstance(){

        if(instance==null){
            instance = new SingletonLazyLoading();
        }
        return instance;
    }
}
