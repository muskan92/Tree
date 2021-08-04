package com.muskan.spring.basics.springpractice.treeAndgraph;

public class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
    public TreeNode(){

    }

    public TreeNode buildTree(){

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        //tree.right.right = new TreeNode(7);
        tree.left.right.right = new TreeNode(7);
        return tree;

    }
}