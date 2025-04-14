package tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionInBinaryTreeLevelOrder {

    public static void main(String[] args) {
        //          10
        //        /    \
        //       11     9
        //      /      / \
        //     7      15   8
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 12;
        root = InsertNode(root, key);

        inorder(root);
    }

    private static void inorder(Node root) {

        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static Node InsertNode(Node root, int key) {

        if(root == null){
            root = new Node(key);
            return root;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            Node curr = q.poll();

            if(curr.left != null){
                q.add(curr.left);
            }else {
                curr.left = new Node(key);
                return root;
            }
            if(curr.right != null){
                q.add(curr.right);
            }else {
                curr.right = new Node(key);
                return root;
            }
        }
        return root;
    }

}
