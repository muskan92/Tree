package com.muskan.spring.basics.springpractice.treeAndgraph;

public class BTHeight {

    BTNode root;

    public int height(BTNode node){

        if(node == null){
            return 0;
        }

        int l = height(node.left);
        int r = height(node.right);

        return Math.max(l,r)+1;
    }
}
