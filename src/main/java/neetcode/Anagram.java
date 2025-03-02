package neetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character,Integer> sMap = createMap(s);
        Map<Character,Integer> tMap = createMap(t);

        if(sMap.equals(tMap))
            return true;
        return false;


    }

    public static Map<Character,Integer> createMap(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.get(c) != null)
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "bbcc", t = "ccbc";

        System.out.println(isAnagram(s,t));

    }
}

