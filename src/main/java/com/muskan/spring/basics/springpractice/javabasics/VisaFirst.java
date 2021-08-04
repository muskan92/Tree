//package com.muskan.spring.basics.springpractice.javabasics;
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//public class VisaFirst {
//}
//
//
// class Solution {
//
//    /**
//     1
//     /.  \
//     2    3
//     /  \
//     4.  5
//
//     Level order zig-zag
//     {{1},{3,2},{4,5}}
//     **/
//    public static void main(String[] args) {
//
//    }
//
//    // Node-> int val, Node left, Node right
//    public List<List<Integer>> zigzag(Node root){
//
//        List<List<Integer>> res = new ArrayList<list<Integer>>();
//        Queue<Integer> q = new LinkedList<>();
//        int count =1;
//        if(root == null){
//            return res;
//        }
//        q.add(root);
//        while(!q.isEmpty()){
//            int size = q.size();
//            List<Integer> list = new ArrayList<>();
//            for(int i=0;i<size; i++){
//                Node temp = q.poll();
//                list.add(temp);
//                if(temp.left != null){
//                    q.add(temp.left);
//                }
//                if(temp.right != null){
//                    q.add(temp.right);
//                }
//
//
//            }
//            if(count % 2 == 0){
//                Collections.reverse(list);
//                res.add(list);
//            }else{
//                res.add(list);
//            }
//            count++;
//        }
//        return res;
//
//    }
//}
//
//
///**
// *
// **/
//
//// Start typing here
//
//    /**abstract
//
//     k[<str>]
//     k*<str>= <str><str><str>
//
//     3[abc]=abcabcabc
//     3[a2[b]]=3[abb]=abbabbabb
//     3[a]2[b]=aaabb
//
//     num-> push
//     char->
//     [ -> push
//     ] -> till [
//
//     str s =stack.pop();
//     b2 = bb, a3 aaa
//
//     ]
//     ]
//     b
//     [
//     2
//     a
//     [
//     3
//
//
//
//     **/
//
//    public String decode(String encoded){
//        // encoded="3[abc]";
//        // 3[a2[b]]
//        if(encoded == null || encoded == "")
//            return encoded;
//        String s = "";
//        String result = "";
//        Stack<Character> stack = new Stack<>();
//
//        for(int i=0; i<encoded.length(); i++){
//            if(encoded.charAt(i) != ']'){
//                stack.push(encoded.charAt(i)); // 3 [ a 2 [ b -> b
//            }else{
//                while(stack.peek() != '['){
//                    char c = stack.pop(); //
//                    s = s.concat(Character.toString(c)); //b
//                }
//                //
//                stack.pop();//3 [ a 2
//                int n = Character.toInteger(stack.pop()); //2
//                // abb
//                // abbabb
//                // abbabbabb
//                for(int j=0; j<n; j++){
//                    result = result.concat(s); //abb abb abb
//                    //3 [ a
//                }
//            }
//        }
//
//        return result;
//
//    }