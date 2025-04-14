package javaBasics;

import java.util.HashSet;

public class TwoInstanceException {


    static HashSet<Class> thereCanBeOnlyOne = new HashSet();

    public TwoInstanceException() {
        Class c = this.getClass();
        if (thereCanBeOnlyOne.contains(c))
            throw new RuntimeException("cant create twice for : "+this.getClass());
        thereCanBeOnlyOne.add(c);
    }



    static public class B extends TwoInstanceException {}

    static public class C extends TwoInstanceException {}


    public static void main(String[] args) {
        TwoInstanceException a1 = new TwoInstanceException();
        B b1 = new B();  // OK
        C c1 = new C();  // OK
//        TwoInstanceException a2 = new TwoInstanceException();
//        C c2 = new C();   // throws exception
        B b2 = new B();
    }
}