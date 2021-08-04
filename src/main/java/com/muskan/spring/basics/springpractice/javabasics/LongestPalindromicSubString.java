package com.muskan.spring.basics.springpractice.javabasics;

import java.util.Arrays;

public class LongestPalindromicSubString {

    public static void main(String[] args) {

        //String input = "ababbba";
        String input = "abcb";

        System.out.printf("longestPD : " + longestPalindrome(input));

    }

    private static class Pair {
        int row;
        int col;

        public Pair(int a, int b) {
            this.row = a;
            this.col = b;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + row +
                    ", b=" + col +
                    '}';
        }
    }

    public static String longestPalindrome(String input) {
        int size = input.length();

        String longestPD = "";
        boolean dp[][] = new boolean[size][size];

        int r = 0, c = 0;
        int count = ((size)*(size+1))/2;
        //System.out.println("count "+count);
        while (count>0) {


            if (r == c) {
                dp[r][c] = true;
                if(longestPD.length()<=c-r+1)
                    longestPD = input.substring(r,c+1);
            }else if(input.charAt(r)==input.charAt(c) && c-r == 1){
                dp[r][c] = true;
                if(longestPD.length()<=c-r+1)
                    longestPD = input.substring(r,c+1);
            }else {
                if(input.charAt(r)==input.charAt(c) && dp[r+1][c-1] ){
                    dp[r][c] = true;
                    if(longestPD.length()<=c-r+1)
                        longestPD = input.substring(r,c+1);
                }
            }
            Pair tmp = getNextMove(r, c, size-1);
            r = tmp.row;
            c = tmp.col;

            count--;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return longestPD;
    }

    public static Pair getNextMove(int r, int c, int size) {


        if (c == size) {
            return new Pair(0, size - r + 1);
        }

        return new Pair(r + 1, c + 1);
    }
}



/**
 *
 *                                                     r(4,3)
 *                                                  r(3,3)   r(2,3)  r(1,3)
 *                                                r()

 **/