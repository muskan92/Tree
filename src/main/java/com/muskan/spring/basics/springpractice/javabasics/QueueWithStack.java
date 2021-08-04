package com.muskan.spring.basics.springpractice.javabasics;

import java.util.Stack;

public class QueueWithStack {

      Stack<Integer> s1;
      Stack<Integer> s2;

    void enqueue(int val){
        s1.push(val);
    }

    int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("no element remaining");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                int x = s1.pop();
                s2.push(x);
            }
        }
        int y = s2.pop();
        return y;
    }

    int peek(){

        if(!s2.isEmpty()){
            return s2.peek();
        }
        else{
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        QueueWithStack q = new QueueWithStack();
        q.s1 = new Stack<>();
        q.s2 = new Stack<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.s1);
        System.out.println(q.s2);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.peek());

        q.enqueue(4);

        System.out.println(q.dequeue());
        System.out.println(q.s1);
        System.out.println(q.s2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


    }
}
