package neetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            String freqStr = createFreqMap(str);

            if(!map.containsKey(freqStr)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(freqStr,list);
            }else{
                map.get(freqStr).add(str);
            }
        }
        // List<List<String>> res = new ArrayList<>();
        // res.add(map.values());

        return new ArrayList<>(map.values());

    }

    public static String createFreqMap(String str){

        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }

        char c = 'a';
        StringBuilder sb = new StringBuilder("");
        for(int i : freq){
            if(i != 0) {

                sb.append(c);
                sb.append(i);
            }
            c++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"}).toString());

    }

}
