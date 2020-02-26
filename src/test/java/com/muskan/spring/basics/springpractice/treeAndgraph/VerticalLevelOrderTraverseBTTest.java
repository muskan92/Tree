package com.muskan.spring.basics.springpractice.treeAndgraph;

import com.muskan.spring.basics.springpractice.treeAndgraph.BTNode;
import com.muskan.spring.basics.springpractice.treeAndgraph.VerticalLevelOrderTraverseBT;
import org.junit.Before;
import org.junit.Test;

public class VerticalLevelOrderTraverseBTTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crossLevel() {

        VerticalLevelOrderTraverseBT vbt = new VerticalLevelOrderTraverseBT();

        vbt.root = new BTNode(1);
        vbt.root.left = new BTNode(2);
        vbt.root.right  = new BTNode(3);

        vbt.root.left.left = new BTNode(4);
        vbt.root.left.right = new BTNode(5);

        vbt.crossLevel(vbt.root,0);
        vbt.printCrossLevel();
    }
}