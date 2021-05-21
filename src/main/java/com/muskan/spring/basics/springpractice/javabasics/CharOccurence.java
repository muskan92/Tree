package com.muskan.spring.basics.springpractice.javabasics;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

    public static void main(String[] args) {
        String s = "aaabbbcccdddd";

        //countChars(s);
        countChars(s);
    }

    private static void countChars(String s) {
        if(s == null){

        }
        int count =1;
        for (int i = 0; i < s.length()-1; i++) {
            int j= i+1;
            if(s.charAt(i)==s.charAt(j)){
                count++;
                if(j==s.length()-1){
                    System.out.println(s.charAt(i)+""+count);
                }
            }

            else{
                System.out.println(s.charAt(i)+""+count);
                count=1;
            }
        }

    }

//    private static void countChars(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        Integer count =0;
//        for(int i=0; i<s.length();i++){
//            count = map.getOrDefault(s.charAt(i),0);
//            map.put(s.charAt(i),count+1);
//        }
//        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
//            System.out.print(entry.getKey()+""+entry.getValue());
//        }
//
//    }
}
