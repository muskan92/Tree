package com.muskan.spring.basics.springpractice.dp;

import java.util.Objects;

/**
 *
 *   @ a b c d e
 * @ 0 0 0 0 0 0
 * a 0 1 1 1 1 1
 * c 0 1 1 2 2 2
 * e 0 1 1 2 2 3
 *
 */

public class LongestCommonSubsequence {

    int age;
    String name;
    int x;
    public static void main(String[] args) {

        LongestCommonSubsequence ls  = new LongestCommonSubsequence();
        ls.x = 10;
        LongestCommonSubsequence ls1  = new LongestCommonSubsequence();
        ls1.x = 10;

        LongestCommonSubsequence ls3 = ls;

        if(ls3 == ls){
            System.out.println("equal");
        }
        if(ls3.equals(ls)){
            System.out.println("equal");
        }
        if(ls.equals(ls)){
            System.out.println("equal");
        }
        if(!ls.equals(ls1)){
            System.out.println("not equal");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongestCommonSubsequence that = (LongestCommonSubsequence) o;
        return age == that.age &&
                x == that.x &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, x);
    }

    public int longestCommonSubsequence(String text1, String text2) {



        return 0;
    }
}
