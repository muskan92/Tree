package com.muskan.spring.basics.springpractice.treeAndgraph;

public class LeftView {

    BTNode root;
    static int tempLvl = 0;
    public void treeLeftView(BTNode node,int lvl){

        if(node == null){
            return;
        }
        if(tempLvl<lvl){
            System.out.print(node.data+" ");
            tempLvl = lvl;
        }
        treeLeftView(node.left,lvl+1);
        treeLeftView(node.right,lvl+1);
    }
}
