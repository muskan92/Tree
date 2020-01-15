package com.muskan.spring.basics.springpractice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    BTNode root;
    Queue<BTNode> q = new LinkedList<>();
    public void lvlOrdrTrvrs(BTNode n){

        q.add(n);
        while (!(q.isEmpty())){
            BTNode temp = q.remove();
            System.out.print(temp.data+" ");
            if (temp.left!=null)
                q.add(temp.left);
            if (temp.right!=null)
                q.add(temp.right);
        }
    }

}
