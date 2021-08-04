package com.muskan.spring.basics.springpractice.javabasics;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {

    Queue<Integer> q = new LinkedList<>();

    void push(int val){
        int size = q.size();
        q.add(val);

        for (int i = 0; i < size; i++) {
            int a = q.remove();
            q.add(a);
        }
    }

    int pop(){
        if(q.isEmpty()){
            System.out.println("No elements remaining");
        }
        return q.remove();
    }
    int top(){
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }

    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();
        stack.push(9);
        stack.push(7);
        System.out.println("Top element is :" + stack.top());
        stack.pop();
        System.out.println("Top element is :" + stack.top());
        stack.push(5);
        System.out.println("Top element is :" + stack.top());

    }
}
