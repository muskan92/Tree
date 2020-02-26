package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class BinarySearch {

    public int bSearch(int[] a, int number){
        final int[] cnt = {0};
        if(a==null){
            return -1;
        }
        OptionalInt oi = Arrays.stream(a).peek(i->
        {
             cnt[0]++;
             System.out.println(i+" "+cnt[0]);
        }
        ).filter(i->i==number).findFirst();

        if(oi.isPresent())
        return cnt[0]-1;
        else
            return -1;
    }
}
