package com.muskan.spring.basics.springpractice.list;

public class ReverseListAlternativeKthNode {

        ListNode head;

        public ListNode reverseListAlternateNode(ListNode root, int k){

            ListNode curr = root;
            ListNode prev = null;
            ListNode next = null;
            int count =0;

            while (curr!=null && count<k){

                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(root!=null){
                root.next=curr;
            }
            count=0;
            while (count<k-1 && curr!=null){
                curr=curr.next;
                count++;
            }
            if(curr!=null){
                curr.next = reverseListAlternateNode(curr.next,k);
            }
            root =prev;
            return root;
        }

        public void printList(ListNode node){

            while (node!=null){
                System.out.print(node.data+" ");
                node = node.next;
            }
        }

    }
