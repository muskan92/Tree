package com.muskan.spring.basics.springpractice.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Unstacking {

    public static void main(String[] args) {
        System.out.println(splitCount(11));
//729856
    }


    static int  splitCount(int size){
        List<Integer> mem = new ArrayList<>();
        mem.add(size);
        int count =0;
        while (mem.size()<size){
            //Collections.sort(mem);
           // int tmp = //mem.get(mem.size()-1);
            int tmp = mem.stream().filter(i -> i != 1).findFirst().get();
            mem.remove(mem.size()-1);
            System.out.println(tmp);
            int split1 = (tmp/2);
            int split2 = tmp - split1;
            count+= split1*split2;
            mem.add(split1);
            mem.add(split2);

            System.out.println("mem "+mem);

        }

        return count;
    }

}