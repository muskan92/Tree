package javaBasics;

/* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

class Node {

    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class SecondLargestInBST {
    static int count =0;
    static int result = 0;

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        int [] c = new int[1];
        int secondLargest = Integer.MIN_VALUE;
        int x = getSecondLargest(root,c);
        System.out.println(x);
        //System.out.println(result);
    }

//    private static void getSecondLargest(Node node) {
//
//        if(node == null || count>=2){
//            return ;
//        }
//
//        getSecondLargest(node.right);
//        count++;
//        //secondLargest = node.data;
//        if (count == 2){
//            System.out.println(node.data);
//            result = node.data;
//            return ;//secondLargest;
//        }
//        getSecondLargest(node.left);
//        //return secondLargest;
//    }

    private static int getSecondLargest(Node node, int[] count) {

        if(node == null || count[0]>=2){
            return Integer.MIN_VALUE;
        }

        int r = getSecondLargest(node.right,count);
        count[0]++;
        if (count[0] == 2){
            return node.data;
        }
        int l = getSecondLargest(node.left,count);
        return Integer.max(l,r);
    }
}
