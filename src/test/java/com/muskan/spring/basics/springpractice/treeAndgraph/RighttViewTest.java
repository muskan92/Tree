package com.muskan.spring.basics.springpractice.treeAndgraph;

import org.junit.jupiter.api.Test;

class RighttViewTest {

    @Test
    void treeRightView() {

        RightView rv = new RightView();

        rv.root = new BTNode(1);
        rv.root.left = new BTNode(2);
        rv.root.right  = new BTNode(3);

        rv.root.left.left = new BTNode(4);
        rv.root.left.right = new BTNode(5);
        rv.root.left.right.right  = new BTNode(6);


        rv.root.right.left = new BTNode(9);
        rv.root.right.right = new BTNode(10);

        rv.treeRightView(rv.root,1);

    }
}