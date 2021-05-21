package com.muskan.spring.basics.springpractice.dp;

import java.util.Arrays;
import java.util.List;

public class OvertakeCount {
    public static void main(String[] args) {
        int a[] = {2,1,5,4,6,3};//{2,1,4,5};

        int totalOvertakes = countOvertake(a);
        System.out.println(totalOvertakes);
    }

    private static int countOvertake(int[] a) {
        int count =0;
        int ar [] = new int[a.length];
        for(int i=a.length-2; i>=0; i--){
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    ar[i]=ar[j]+1;
                    break;
                }
            }
        }

        final Integer reduce = Arrays.stream(ar)
                //.stream()
                .map(i -> new Integer(i))
                .reduce(0, (c, b) -> c + b);


        List<int[]> ints = Arrays.asList(ar);
        System.out.println(ints.size());


        return reduce;
    }
}
