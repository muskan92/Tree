package com.muskan.spring.basics.springpractice.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

        System.out.println("in BillPughSingleton Constructor");
    }
    private static class BillPughSinletonInner {

        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){

        System.out.println(Thread.currentThread().getName()+" "+ "in BillPughSingleton method" );
        System.out.println(Thread.currentThread().getName()+" "+ BillPughSinletonInner.billPughSingleton);

        return BillPughSinletonInner.billPughSingleton;
    }
}
