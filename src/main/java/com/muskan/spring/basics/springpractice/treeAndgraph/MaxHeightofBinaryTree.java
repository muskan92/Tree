package com.muskan.spring.basics.springpractice.treeAndgraph;

class Node1{
    int data;
    Node1 left, right;
    Node1(int val){
        data=val;
        left = null;
        right = null;
    }
}
public class MaxHeightofBinaryTree {


    public static void main(String[] args) {

        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5

        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        System.out.println(maxHeight(root));

    }

    private static int maxHeight(Node1 root) {
        if(root == null){
            return 0;
        }
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);

        return Math.max(lh,rh) + 1;
    }
}
