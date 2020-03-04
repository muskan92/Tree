package com.muskan.spring.basics.springpractice.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SlidingWindowMaximum {

    public void maxWindow(int ar[], int n, int k){

        Deque<Integer> dq = new LinkedList<>();

        for(int j=0; j<n; j++){
            if(j<k){
                dq.add(ar[j]);
            }
            else {
                    dq.removeFirst();
                    dq.add(ar[j]);
            }

            Integer [] max = new Integer[]{Integer.MIN_VALUE};
            dq.stream().forEach(i->{
                max[0] = i > max[0] ? i: max[0];
            });

            //max = ar[j] > max ? ar[j] : max;
            System.out.print(max[0]+" ");

        }
    }
}
