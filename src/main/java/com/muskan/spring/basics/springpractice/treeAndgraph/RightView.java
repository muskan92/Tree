package com.muskan.spring.basics.springpractice.treeAndgraph;

public class RightView {

    BTNode root;
    static int tempLvl = 0;
    public void treeRightView(BTNode node,int lvl){

        if(node == null){
            return;
        }
        if(tempLvl<lvl){
            System.out.print(node.data+" ");
            tempLvl = lvl;
        }
        treeRightView(node.right,lvl+1);
        treeRightView(node.left,lvl+1);
    }
}
