package tree;

class Node{
    int data;
    Node left,right;

    public Node(int val){
        data = val;
        left = null;
        right = null;
    }
}

public class TreeHeight {

    public static int height(Node node){
        if(node == null)
            return -1;
        int lHeight = height(node.left);
        int rHeight = height(node.right);

        return Math.max(lHeight,rHeight)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(3);
        root.left.left = new Node(3);

        System.out.println(height(root));


    }
}
