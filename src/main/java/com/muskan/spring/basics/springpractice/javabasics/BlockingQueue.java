package com.muskan.spring.basics.springpractice.javabasics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockingQueueImplementation <T>{
    Queue<T> queue = new LinkedList<>();
    int maxLimit;
    Lock lock = new ReentrantLock();

    BlockingQueueImplementation(int limit) {
        maxLimit = limit;
    }

    public synchronized void  enqueue(T element) throws InterruptedException {

            while (queue.size() == maxLimit) {
                System.out.println("max limit reached for enqueue...waiting :" + Thread.currentThread().getName());
                wait();
            }
            if (queue.size() == 0) {
                System.out.println("queue is empty in enqueue...notifyingAll :" + Thread.currentThread().getName());
                notifyAll();
            }
            queue.add(element);
            System.out.println("element added in the queue :" + "" + element + " " + Thread.currentThread().getName());

    }

    public synchronized T dequeue() throws InterruptedException {
    T element = null;

            while (queue.size() == 0) {
                System.out.println("queue is empty for dequeue...waiting :" + Thread.currentThread().getName());
                wait();
            }
            if (queue.size() == maxLimit) {
                System.out.println("queue is full in dequeue...notifyingAll :" + Thread.currentThread().getName());
                notifyAll();
            }

            System.out.println("element removed from the queue :" + "" + queue.peek() + " " + Thread.currentThread().getName());
            element = queue.poll();

        return element;
    }

}

public class BlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueueImplementation<Customer> bq = new BlockingQueueImplementation<>(3);
        Customer c = new Customer(7);

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    bq.enqueue(new Customer(finalI));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"producer"+i)
                    .start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread( () -> {
                try {
                    bq.dequeue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"consumer"+i)
                    .start();
        }

        Thread.sleep(1000);
    }
}

class Customer{
    int id;
    Customer(int id){
        this.id = id;
    }
}