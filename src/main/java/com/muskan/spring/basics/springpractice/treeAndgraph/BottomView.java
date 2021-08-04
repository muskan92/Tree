package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 		    1 0,0
 * 	    2-1,1	 31,1
 *   4-2,2 50,2
 *           72,2
 *
 */

public class BottomView {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode().buildTree();
        Map<Integer, MetaData> map = new TreeMap<>();
        bottomView(tree, map, 0, 0);

        for (Map.Entry<Integer, MetaData> entry : map.entrySet())
            System.out.print(entry.getValue().data+" ");

    }

    private static void bottomView(TreeNode node, Map<Integer, MetaData> map, int level, int hd) {

        if (node == null)
            return;

        if (map.containsKey(hd)) {
            if (map.get(hd).level < level) //greater than for topView
                map.put(hd, new MetaData(level, node.data));
        } else
            map.put(hd, new MetaData(level, node.data));

        bottomView(node.left, map, level + 1, hd - 1);

        bottomView(node.right, map, level + 1, hd + 1);
        System.out.println(node.data+" ,"+hd);

    }

    static class MetaData {
        int level;
        int data;

        public MetaData(int level, int data) {
            this.level = level;
            this.data = data;
        }
    }
}
