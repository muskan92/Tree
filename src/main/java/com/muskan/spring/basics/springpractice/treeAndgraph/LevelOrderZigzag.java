package com.muskan.spring.basics.springpractice.treeAndgraph;

public class LevelOrderZigzag {

    BTNode root;

    public void levelOrder(BTNode node){

        boolean flag = false;

        int height = new BTHeight().height(node);

        int level = 1;
        while (level<=height) {
            printZigzag(node, level, flag);
            level++;
            flag = !flag;
        }

    }

    private void printZigzag(BTNode node, int level, boolean flag) {

        if(node == null){
            return;
        }
        if(level==1){
            System.out.print(node.data+" ");
        }
        else if(level>1) {
            if (flag) {
                printZigzag(node.left, level - 1, flag);
                printZigzag(node.right, level - 1, flag);
            } else {
                printZigzag(node.right, level - 1, flag);
                printZigzag(node.left, level - 1, flag);

            }
        }
    }
}
