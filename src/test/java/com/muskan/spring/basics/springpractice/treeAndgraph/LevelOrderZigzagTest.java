package com.muskan.spring.basics.springpractice.treeAndgraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderZigzagTest {

    @Test
    void levelOrder() {

        LevelOrderZigzag bt = new LevelOrderZigzag();
        bt.root = new BTNode(1);
        bt.root.left = new BTNode(2);
        bt.root.right  = new BTNode(3);

        bt.root.left.left = new BTNode(4);
        bt.root.left.right = new BTNode(5);

        bt.root.right.left  = new BTNode(6);
        bt.root.right.right = new BTNode(7);


        bt.levelOrder(bt.root);

    }
}