package com.muskan.spring.basics.springpractice.treeAndgraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopViewTest {

    @Test
    void treeTopView() {

        TopView tv = new TopView();

        tv.root = new BTNode(1);
        tv.root.left = new BTNode(2);
        tv.root.right  = new BTNode(3);

        tv.root.left.left = new BTNode(4);
        tv.root.left.right = new BTNode(5);
        tv.root.left.right.right  = new BTNode(6);


        tv.root.right.left = new BTNode(9);
        tv.root.right.right = new BTNode(10);

        tv.treeTopView(tv.root,0,0);
        tv.printTopView();

    }
}