package com.muskan.spring.basics.springpractice.javabasics;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;


class Solution {

    /*
     * Complete the 'findSmallestDivisor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        boolean isDivisible = false;
        String subStr = "";
        int length = s.length();
        if(s.length()%t.length() != 0  || s == null || t == null){
            return -1;
        }
        else if(s.equals(t)){
            isDivisible = true;
            subStr = t.substring(0,t.length()/2);
            if((subStr.concat(subStr)).equals(s)){
                return subStr.length();
            }
        } else{
            //while(length>0){
            if((t.concat(t)).equals(s)){
                subStr = t.substring(0,t.length()/2);
                if((subStr.concat(subStr)).equals(t)){
                    return subStr.length();
                }else{
                    return t.length();
                }
            }

            //}
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 ="lrbblrbb";
        String s2 ="lrbb";

       int x = findSmallestDivisor(s1,s2);
    }

}