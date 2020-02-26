package com.muskan.spring.basics.springpractice.list;

public class ReverseList {

    ListNode head;
    ListNode curr;
    ListNode prev = null;
    ListNode next = null;

    public ListNode reverseList(ListNode root){

        curr = root;
        while (curr!=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
        return root;
    }

    public void printList(ListNode node){

        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
