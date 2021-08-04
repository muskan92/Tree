package com.muskan.spring.basics.springpractice.treeAndgraph;

/**
 * Find Minimum Depth of a Binary Tree
 *
 */

public class TreeMinHeight {
    public static void main(String[] args) {
        Node2 tree = new Node2(1);
        tree.left = new Node2(2);
 //       tree.right = new Node2(3);
//        tree.left.left = new Node2(4);
//        tree.left.right = new Node2(5);

        int depth = depth(tree);
        System.out.println(depth);

    }

    private static int depth(Node2 node) {

        if(node == null)
            return 0;
        if(node.left==null && node.right==null)
            return 1;
        if(node.left==null)
            return depth(node.right)+1;
        if(node.right==null)
            return depth(node.left)+1;

        return Math.min(depth(node.left),depth(node.right))+1;
    }

}


class Node2{
    int data;
    Node2 left, right;

    public Node2(int item)
    {
        data = item;
        left = right = null;
    }
}