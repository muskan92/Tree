package com.muskan.spring.basics.springpractice.treeAndgraph;

public class MirrorTree {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        inOrder(tree);
        System.out.println("");

        /* convert tree to its mirror */
        mirror(tree);

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of mirrored binary tree is : ");
        inOrder(tree);
    }

//    static Node mirror(Node node)
//    {
//        if (node == null)
//            return node;
//
//        /* do the subtrees */
//        Node left = mirror(node.left);
//        Node right = mirror(node.right);
//
//        /* swap the left and right pointers */
//        node.left = right;
//        node.right = left;
//
//        return node;
//    }

    static void mirror(Node node)
    {
        if (node == null)
            return;

        /* do the subtrees */
        mirror(node.left);
        mirror(node.right);

        /* swap the left and right pointers */
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;


    }


    /* Helper function to test mirror(). Given a binary
       search tree, print out its data elements in
       increasing sorted order.*/
    static void inOrder(Node node)
    {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }
}



class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}