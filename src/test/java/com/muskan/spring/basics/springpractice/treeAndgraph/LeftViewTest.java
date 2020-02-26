package com.muskan.spring.basics.springpractice.treeAndgraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftViewTest {

    @Test
    void treeLeftView() {

        LeftView lv = new LeftView();

        lv.root = new BTNode(1);
        lv.root.left = new BTNode(2);
        lv.root.right  = new BTNode(3);

        lv.root.left.left = new BTNode(4);
        lv.root.left.right = new BTNode(5);
        lv.root.left.right.right  = new BTNode(6);


        lv.root.right.left = new BTNode(9);
        lv.root.right.right = new BTNode(10);

        lv.treeLeftView(lv.root,1);

    }
}