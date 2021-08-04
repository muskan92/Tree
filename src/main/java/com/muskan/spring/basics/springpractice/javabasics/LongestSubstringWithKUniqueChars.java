package com.muskan.spring.basics.springpractice.javabasics;

import java.util.HashMap;

public class LongestSubstringWithKUniqueChars {

    public static void main(String[] args) {
        int count = lengthOfLongestSubstringKDistinct("aabbccd", 3);
        System.out.println(count);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int result = 0;
        int start=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }

            if(map.size()<=k){
                result = Math.max(result, (j-start)+1);
            }else{
                while(map.size()>k){
                    char l = s.charAt(start);
                    int count = map.get(l);
                    if(count==1){
                        map.remove(l);
                    }else{
                        map.put(l, map.get(l)-1);
                    }
                    start++;
                }
            }

        }

        return result;
    }
}
