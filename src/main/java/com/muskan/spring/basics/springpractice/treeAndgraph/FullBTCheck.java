package com.muskan.spring.basics.springpractice.treeAndgraph;

public class FullBTCheck {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode().buildTree();

        System.out.println(isFullBT(tree));

    }

    static boolean isFullBT(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null)
            return true;
        if (node.left != null && node.right != null)
            return (isFullBT(node.left) && isFullBT(node.right));

        return false;
    }
}
