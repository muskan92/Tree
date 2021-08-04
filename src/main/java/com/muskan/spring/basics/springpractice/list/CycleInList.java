package com.muskan.spring.basics.springpractice.list;

public class CycleInList {
    static ListNode head;
    static ListNode slow ; static ListNode fast ; static ListNode prev;static int i=0;
     static class ListNode {
         int data;
         ListNode next;

         ListNode(int d) {
             data = d;
             next = null;
         }
     }
    public static void main(String[] args) {

         head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

       detectLoop();
    }

    public static void detectLoop(){
        slow = head; fast = head; prev=head;i=0;

        while(slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
//            i++;
//            if(i>1)
//                prev=prev.next;
            if(slow==fast){
                System.out.println("Loop Found");
                //startOfLoop();
                return;
            }
        }
        System.out.println("Loop Not Found");
        return;
    }

    public static void startOfLoop(){

         fast = head;

        while(slow != null && fast != null){
            slow = slow.next;
            fast = fast.next;
            prev = prev.next;

            if(slow == fast){
                System.out.println("And Start of the Loop is node : "+fast.data);

                prev.next=null;
                System.out.println("Loop is removed,Last node is : "+prev.data +" And last node is pointing to : "+prev.next);

                return;
            }
        }
    }
}
