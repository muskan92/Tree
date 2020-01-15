package com.muskan.spring.basics.springpractice;

import java.util.Arrays;

public class AlphabetToNumber {

    public int alphaToNum(String s){

        s = new StringBuilder(s).reverse().toString();
        char c[] = s.toCharArray();
        int len = c.length;
        int num[] ={0};
        int i[] = {0};
 /*       while(len>0){
            int digit = c[len-1]-64;
            num = (int) (num+digit*Math.pow(26,i));
            i++;
            len--;
        }
*/
        s.chars()
                .forEach(j->{
            num[0] = (int) (num[0]+(j-64)*Math.pow(26,i[0]));
            i[0]++;
            System.out.println(j);
        });

        return num[0];
    }

}
