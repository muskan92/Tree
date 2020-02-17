package com.muskan.spring.basics.springpractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class ReverseStringByWord {

    @Test
    public void reverse(){

        String s = "My Name Is Khan";
        StringBuilder sb = new StringBuilder();
        //output "Khan.Is.Name.My";
        String rev[] = s.split(" ");
        int strlen = rev.length;
        for(int i=strlen-1;i>=0;i--){
            System.out.print(rev[i]);
            sb.append(rev[i]);
            if(i>0){
                System.out.print(".");
                sb.append(".");
            }
        }
        System.out.print(sb.toString());

    }
    @Test
    public void targetSum(){
        // [1,9,6,22,33,2,11]
        // 15

    }

    @Test
    public void nextPalindrom(){
        //input: 5435, 606,
        //output: 5445, 616,

        String s = "3456789";
        char c[] = s.toCharArray();
        int ar[] = new int[s.length()];

        int count[] = {0};
       s.chars().mapToObj(d->(char) d).forEach(i->{
           ar[count[0]] = Integer.parseInt(String.valueOf(i));
           count[0]++;
       });

       int len = ar.length-1;
       AtomicBoolean isPalindrom = new AtomicBoolean(true);
        IntStream.range(0,len+1).forEach(i->{
            //System.out.print(i);
            if(ar[i]==ar[len-i]){
            }else {
                isPalindrom.set(false);
                ar[len-i]=ar[i];
            }
        });
        if(isPalindrom.get()) {
            int mid = ar.length / 2;
            if (ar.length % 2 == 0) {
                mid = (ar.length / 2)-1;
                ar[mid] = ar[mid] + 1;
                ar[mid + 1] = ar[mid + 1] + 1;
            } else {
                ar[mid] = ar[mid] + 1;
            }
        }
        System.out.print(Arrays.toString(ar));

    }
}
