package neetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 0;
        int len =0;


        //Input: nums = [0,3,2,5,4,6,1,1], {2,20,4,10,3,4,5} - 4
        //
        //Output: 7

        for(int n : nums){
            if(!set.contains(n-1)){
                 len =0;
                while(set.contains(n++)){
                    len++;
                }
            }
            max = Math.max(max,len);
        }
        return max;

    }



    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int [] {0,3,2,5,4,6,1,1}));

    }
}

