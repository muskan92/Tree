package com.muskan.spring.basics.springpractice;

import org.springframework.stereotype.Component;

@Component
public class BarFormatter implements Formatter<Long> {
    @Override
    public String format() {
        return "bar";
    }

    @Override
    public Long sum(Long a, Long b) {
        return a+b;
    }

    @Override
    public Long subtract(Long a, Long b) {
        return a-b;
    }
}
