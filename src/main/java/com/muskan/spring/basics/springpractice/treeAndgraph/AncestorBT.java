package com.muskan.spring.basics.springpractice.treeAndgraph;

import com.muskan.spring.basics.springpractice.treeAndgraph.BTNode;

public class AncestorBT {


    BTNode root;
    BTNode ancestr;
    int found = 0;

    public int commonAncestor(BTNode node, int x, int y){

        if(node==null){
            return  0;
        }
        int l = commonAncestor(node.left,x ,y);
        int r = commonAncestor(node.right,x, y);
        if(l+r == 2 && found == 0){
          System.out.println("Common ancestor of "+x +" and "+y +" is "+node.data);
          ancestr = node;
          found = 1;
        }
        if(node.data == x || node.data == y){
            return  l+r+1;
        }
        else
            return l + r;
    }

}
