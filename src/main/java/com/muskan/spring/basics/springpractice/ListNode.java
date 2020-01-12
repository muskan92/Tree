package com.muskan.spring.basics.springpractice;

import java.util.Objects;

public class ListNode {
    int data;
    ListNode next;

    ListNode(int d){
        data=d;
        next=null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode node = (ListNode) o;
        return data == node.data &&
                next.equals(node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }


}
