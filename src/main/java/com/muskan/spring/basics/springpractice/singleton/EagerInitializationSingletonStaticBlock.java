package com.muskan.spring.basics.springpractice.singleton;

public class EagerInitializationSingletonStaticBlock {

    public static EagerInitializationSingletonStaticBlock instance;

    private EagerInitializationSingletonStaticBlock(){
        System.out.println("EagerInitializationSingletonStaticBlock");
    }
    static {
        instance = new EagerInitializationSingletonStaticBlock();
    }
}
