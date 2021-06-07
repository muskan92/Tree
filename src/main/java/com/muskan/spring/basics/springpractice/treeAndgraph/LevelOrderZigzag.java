package com.muskan.spring.basics.springpractice.treeAndgraph;

public class LevelOrderZigzag {

    BTNode root;

    public static void main(String[] args) {
        BTNode node = new BTNode(1);
        node.left = new BTNode(2);
        node.right = new BTNode(3);
        node.left.left = new BTNode(4);
        node.left.right = new BTNode(5);
        node.left.left.left = new BTNode(6);
        node.left.left.right = new BTNode(7);
        levelOrder(node);
    }



        public static void levelOrder(BTNode node){

        boolean flag = false;

        int height = new BTHeight().height(node);

        int level = 1;
        while (level<=height) {
            printZigzag(node, level, flag);
            level++;
            flag = !flag;
        }

    }

    private static void printZigzag(BTNode node, int level, boolean flag) {

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
