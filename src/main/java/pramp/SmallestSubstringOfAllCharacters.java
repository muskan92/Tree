package pramp;

/*input:  arr = ['x','y','z'], str = "xyyzyzyx"
  output: "zyx"*/

import java.util.HashMap;

public class SmallestSubstringOfAllCharacters {

    static String getShortestUniqueSubstring(char[] arr, String str) {
        HashMap<Character , Integer> mapCounter = new HashMap<Character , Integer>();
        //HashMap<Character , Integer> map = new HashMap<Character , Integer>();

        int opLength = arr.length;
        //int counter =0;
        String result = new String();
        //char[] myStr = str.toCharArray();
        int start=0;
        int end=opLength;

        mapCounter = slideWindowStr(str, mapCounter, start, end);

        for(char ch : arr){
            if(mapCounter.get(ch) !=null && mapCounter.get(ch) == 1)
                result = result.concat(String.valueOf(ch));
        }
        if(result.length() != opLength) {
            start++;
            mapCounter.clear();
            mapCounter.clear();
            mapCounter = slideWindowStr(str, mapCounter, start, end);
        }
        else{
            if(result.length() == opLength)
                return result;
        }
        return null;
    }

    private static HashMap slideWindowStr(String str, HashMap<Character, Integer> mapCounter, int start, int end) {
        for(int i = start; i< start + end; i++){
            if (mapCounter.containsKey(str.charAt(i))) {
                mapCounter.put(str.charAt(i), mapCounter.get(str.charAt(i)) + 1);
            } else {
                mapCounter.put(str.charAt(i), 1);
            }
        }
        return mapCounter;
    }

    public static void main(String[] args) {

       char[] arr = {'x','y','z'};
        String str = "xyyzyzyx";
        String subStr = getShortestUniqueSubstring(arr, str);
        System.out.println(subStr);
    }
}
