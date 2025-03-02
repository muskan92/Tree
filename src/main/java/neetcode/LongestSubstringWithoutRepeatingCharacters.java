package neetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if(n <= 1)
            return n;
        int l = 0;
        int r = 0;
        int len = 0;
        Set<Character> set = new HashSet<>();

        while(l <= r && r < n){

            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }else{
                len = Math.max(set.size(),len);
                set.remove(s.charAt(l));
                l++;
            }
            len = Math.max(set.size(),len);
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
