package com.muskan.spring.basics.generics;

import com.muskan.spring.basics.springpractice.Customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class WildcardLowerUpperBound {

    public static void validateTillStringType(Collection<? super String> collection){
        //Wild card with Lower bound
        // Accept collection of objects of type string or SUPER-CLASS of String
    }

    public static void validateStringTypes(Collection<? extends Serializable> collection){
        //Wild card with Upper bound
        // Accept collection of objects of type string or SUB-CLASS of String
    }

    public static void main(String [] args){
        WildcardLowerUpperBound.validateTillStringType(new ArrayList<Object>());//OK

       // WildcardLowerUpperBound.validateTillStringType(new ArrayList<Integer>());//Error

      //  WildcardLowerUpperBound.validateStringTypes(new ArrayList<Object>());//Error

        WildcardLowerUpperBound.validateStringTypes(new ArrayList<Customer>());//OK

    }
}
