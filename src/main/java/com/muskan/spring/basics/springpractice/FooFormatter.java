package com.muskan.spring.basics.springpractice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class FooFormatter implements Formatter<Integer> {
    @Override
    public String format() {
        return "foo";
    }

    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a-b;
    }
}
