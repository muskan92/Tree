package com.muskan.spring.basics.springpractice;

import org.junit.Test;

import java.util.*;

public class TestNew {

    @Test
    public void bsb(){
        String[] s = "my name is".split(" ");

        for (int i = s.length-1; i >=0 ; i--) {
            System.out.printf(s[i]);
            if(i!=0){
                System.out.printf(".");
            }
        }

    }
 // [1,9,6,22,33,2,11]
    // 15
    @Test
    public void skdf(){
        char[] chars = "5435".toCharArray();
        List<Integer> arr = new ArrayList<>();

        for (char c:chars) {
            arr.add(Integer.parseInt(String.valueOf(c)));
        }
        boolean noChnage = true;
        for (int i = 0; i <arr.size() ; i++) {
                if(arr.get(i)==arr.get(arr.size()-1-i)){
                    continue;
                }else {
                    noChnage=false;
                    arr.set(arr.size()-1-i,arr.get(i));
                }
        }
        if(noChnage)
        {
            int mid = (arr.size()/2);
            if(arr.size()%2==0){
                mid = (arr.size()/2)-1;
                arr.set(mid+1,arr.get(mid)+1);
            }
            arr.set(mid,arr.get(mid)+1);

        }
        System.out.printf(arr.toString());

    }

    @Test
    public void taget(){
        String s = "[1,9,6,22,33,2,11]";
        String res = "15";
        int rs = Integer.parseInt(res);
        String[] split = s.replace("[", "").replace("]", "").split(",");
        Integer [] ar = new Integer[split.length];
        int i=0;
        for(String st: split){
            ar[i] = Integer.parseInt(st);
            i++;
        }
        Set<Integer> set = new HashSet<>();
        for(int j=0;j<ar.length-1;j++){
            if(set.contains(ar[j])){
                System.out.printf("found "+ar[j]+", "+(rs-ar[j]));
            }else
                set.add(rs-ar[j]);
        }
        System.out.print(Arrays.toString(ar));
    }
}
