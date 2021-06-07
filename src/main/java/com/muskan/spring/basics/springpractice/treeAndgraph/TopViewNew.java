package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.Map;
import java.util.TreeMap;

public class TopViewNew {

    static Map<Integer,NodeDepthPair> map = new TreeMap<>();

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class NodeDepthPair {
        int data;
        int depth;

        public NodeDepthPair(int data, int depth) {
            this.data = data;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(6);
        node.left.left.right = new Node(7);


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);


        topView(root,0,0);
        for(Map.Entry<Integer,NodeDepthPair> entry : map.entrySet()){
            System.out.println(entry.getValue().data);
        }

    }

    private static void topView(Node node, int vd, int depth) {
        if(node == null)
            return;

        if(map.get(vd) == null){
            map.put(vd,new NodeDepthPair(node.data,depth));
        }
        if(map.get(vd).depth>depth){
            map.put(vd,new NodeDepthPair(node.data,depth));
        }
        topView(node.left,vd-1,depth+1);
        topView(node.right,vd+1,depth+1);

    }
}