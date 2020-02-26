package com.muskan.spring.basics.springpractice.list;

public class LoopList {

    ListNode head;
    ListNode slow ; ListNode fast ; ListNode prev;

    public void detectLoop(){

        slow = head; fast = head; prev=head;int i=0;
        while(slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            i++;
            if(i>1)
                prev=prev.next;
            if(slow==fast){
                System.out.println("Loop Found");
                startOfLoop();
                return;
            }
        }
        System.out.println("Loop Not Found");
        return;
    }

    public void startOfLoop(){

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


    public  void printList(){
        ListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
