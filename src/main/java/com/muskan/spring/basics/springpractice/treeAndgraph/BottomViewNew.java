package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.Map;
import java.util.TreeMap;

public class BottomViewNew {

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
        Node node = new Node(20);
        node.left = new Node(8);
        node.right = new Node(22);
        node.left.left = new Node(5);
        node.left.right = new Node(3);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);
        node.right.right = new Node(25);
        node.right.left = new Node(4);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);


       bottomView(node,0,0);
        for(Map.Entry<Integer,NodeDepthPair> entry : map.entrySet()){
            System.out.println(entry.getValue().data);
        }

    }

    private static void bottomView(Node node, int vd, int depth) {
        if(node == null)
            return;

        if(map.get(vd) == null){
            map.put(vd,new NodeDepthPair(node.data,depth));
        }
        if(map.get(vd).depth<=depth){
            map.put(vd,new NodeDepthPair(node.data,depth));
        }
        bottomView(node.left,vd-1,depth+1);
        bottomView(node.right,vd+1,depth+1);

    }
}