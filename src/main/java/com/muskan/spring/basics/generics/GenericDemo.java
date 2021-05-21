package com.muskan.spring.basics.generics;

public class GenericDemo<T> {

    T obj;

    public GenericDemo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public static<A extends Number,B extends Number> int addnum(A a, B b){
        return (a.intValue()+b.intValue());
    }
}
