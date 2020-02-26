package com.muskan.spring.basics.springpractice.treeAndgraph;

import com.muskan.spring.basics.springpractice.treeAndgraph.AncestorBT;
import com.muskan.spring.basics.springpractice.treeAndgraph.BTNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AncestorBTTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void BTTest(){
        AncestorBT bt = new AncestorBT();

        bt.root = new BTNode(1);
        bt.root.left = new BTNode(2);
        bt.root.right  = new BTNode(3);

        bt.root.left.left = new BTNode(4);
        bt.root.left.right = new BTNode(5);

        bt.commonAncestor(bt.root,4,2);

        Assert.assertEquals(bt.ancestr,bt.root);
        bt.found = 0;
        bt.commonAncestor(bt.root,4,5);

        Assert.assertEquals(bt.ancestr,bt.root.left);

    }
}