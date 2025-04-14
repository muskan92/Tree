//package javaBasics;
//
//
//import java.util.LinkedList;
//import java.util.Queue;
//
///**informatica 1st round
// *              3
// *            /   \
// *          5       4
// *         / \     /\
// *        2    8  1  7
// */
//    class Node {
//        int data;
//        Node left;
//        Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//public class MyClass_2BinaryTree {
//    static int total =0;
//    public static void main(String[] args) {
//        Node root = new Node(3);
//        Node root.left = new Node(3);
//        Node root = new Node(3);
//
//        int sum = levelOrder();
//    }
//
//    private static int levelOrder(Node root) {
//        Queue<Node> q = new LinkedList<>();
//        Node temp = null;
//        q.add(root);
//
//        while(!q.isEmpty()){
//             temp = q.poll();
//            total += temp.data;
//
//        if(temp.left != null)
//            q.add(temp.left);
//        if(temp.right != null)
//            q.add(temp.right);
//        }
//        return total;
//    }
//}
