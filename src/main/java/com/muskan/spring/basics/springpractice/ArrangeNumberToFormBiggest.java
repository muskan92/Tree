package com.muskan.spring.basics.springpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class ArrangeNumberToFormBiggest {

    public void formLargest(int arr[]){

        Vector<String> vector = new Vector<>();

        Arrays.stream(arr).forEach(i->{
            vector.add(String.valueOf(i));
        });

        Collections.sort(vector, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {

                String xy =x+y;
                String yx =y+x;

                int i = xy.compareTo(yx);
                if(i>0)
                    return -1;
                else
                    return 1;
            }
        });

        vector.forEach(n->{
            System.out.print(n);
        });
    }
}
