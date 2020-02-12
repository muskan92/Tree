package com.muskan.spring.basics.springpractice;

public interface Formatter<T> {

    String format();

    T sum(T a, T b);

    T subtract(T a , T b );
}
