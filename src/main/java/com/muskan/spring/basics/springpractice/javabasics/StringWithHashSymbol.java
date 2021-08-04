package com.muskan.spring.basics.springpractice.javabasics;

import java.util.Stack;

/**
 * Given a string S containing letters and ‘#‘. The ‘#” represents a backspace. The task is to print the new string without ‘#‘.
 *
 * Examples:
 *
 * Input : S = "abc#de#f#ghi#jklmn#op#"
 * Output : abdghjklmo
 *
 * Input : S = "##geeks##for##geeks#"
 * Output : geefgeek
 *
 */

public class StringWithHashSymbol {

    public static void main(String[] args) {
        String S = "##geeks##for##geeks#";
        
        System.out.println(newString(S));
    }

    private static StringBuilder newString(String S) {
        Stack<Character> q = new Stack<Character>();

        for (int i = 0; i < S.length(); ++i)
        {
            if (S.charAt(i) != '#')
                q.push(S.charAt(i));
            else if (!q.isEmpty())
                q.pop();
        }

        // build final string
        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty())
        {
            ans.append(q.pop());
            //ans += q.pop();
        }
        return ans.reverse();
    }
}
