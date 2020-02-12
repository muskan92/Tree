package com.muskan.spring.basics.springpractice;

import org.junit.Test;

public class JavabasicsTest {

    @Test
    public void basictest(){
        String a = "muskan";
        String b = a+"gupta";
        String c = b;

        a.concat("gupta");
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);


    }
}
