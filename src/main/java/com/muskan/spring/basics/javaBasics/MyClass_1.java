package javaBasics;


import java.util.LinkedList;
import java.util.Queue;
//informatica 1st round
//implt stack using 2 queses
public class MyClass_1 {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void main(String[] args) {

        push(1);
        push(2);

        System.out.println(pop());
        push(3);

        System.out.println(q1);

    }

    private static void push(int x) {

        q1.add(x);

    }
    private static int pop() {

        int size = q1.size();
        for(int i=0; i<size-1; i++) {
            q2.add(q1.poll());

        }
        int popped = q1.poll();

        for(int i=0; i<size; i++) {
            q1.add(q2.poll());
        }
        return popped;
        }

    }

