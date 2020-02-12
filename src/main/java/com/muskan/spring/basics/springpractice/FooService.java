package com.muskan.spring.basics.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;
    //or
    //private Formatter fooFormatter;

}
