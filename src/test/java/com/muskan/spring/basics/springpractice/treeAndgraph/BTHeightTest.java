package com.muskan.spring.basics.springpractice.treeAndgraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTHeightTest {

    @Test
    void height() {

        BTHeight bt = new BTHeight();

        bt.root = new BTNode(1);
        bt.root.left = new BTNode(2);
        bt.root.right  = new BTNode(3);

        bt.root.left.left = new BTNode(4);
        bt.root.left.right = new BTNode(5);

        int h =bt.height(bt.root);

        System.out.print("Height: "+h);


    }
}