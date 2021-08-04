package com.muskan.spring.basics.springpractice.treeAndgraph;

import com.muskan.spring.basics.springpractice.treeAndgraph.BTNode;
import com.muskan.spring.basics.springpractice.treeAndgraph.LevelOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LevelOrderTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void lvlOrdrTrvrs() {

        LevelOrder lo = new LevelOrder();

        lo.root = new BTNode(1);
        lo.root.left = new BTNode(2);
        lo.root.right  = new BTNode(3);

        lo.root.left.left = new BTNode(4);
        lo.root.left.right = new BTNode(5);

        lo.root.right.left = new BTNode(9);
        lo.root.right.right = new BTNode(10);

        lo.lvlOrdrTrvrs(lo.root);



    }


}