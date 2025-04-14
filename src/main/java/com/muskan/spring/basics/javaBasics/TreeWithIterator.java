package javaBasics;


import java.util.Iterator;
import java.util.LinkedList;

/* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
class Tree {
    static TreeNode root;
    static class TreeIterator implements Iterator<TreeNode> {
        TreeNode temp = root;
        TreeNode nextNode = null;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public TreeNode next() {
            nextNode = nextNode.left;
            return temp;
        }
    }

    static class TreeNode {

        int data;
        TreeNode left, right;

        TreeNode(int d) {
            data = d;
            left = right = null;
        }
    }
}
public class TreeWithIterator {

    public static void main(String[] args) {

        Tree.TreeNode root = new Tree.TreeNode(50);
        root.left = new Tree.TreeNode(30);
        root.right = new Tree.TreeNode(70);
        root.left.left = new Tree.TreeNode(20);
        root.left.right = new Tree.TreeNode(40);
        root.right.left = new Tree.TreeNode(60);
        root.right.right = new Tree.TreeNode(80);

        Iterator<Tree.TreeNode> it = new Tree.TreeIterator();

        while (it.hasNext()){
            System.out.println(it.next().data);
        }

    }
}
