//package com.muskan.spring.basics.springpractice.treeAndgraph;
//
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**horizontal distance : reference point -root,left->+1,right->-1
// * depth
// *              6
// *           5     7
// *         4   9
// *           8   0
// *         2   1
// *       5  9
// *      8 9
// */
//
//public class TreeDiameter {
//    //Node node;
//
//    PriorityQueue<>
//
//    static int maxDiameter =0;
//    static Map<Integer, PriorityQueue<NodeDepth>> map = new HashMap<>();
//    static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    static class NodeDepth implements Comparable{
//        int data;
//        int depth;
//
//        public NodeDepth(int data, int depth) {
//            this.data = data;
//            this.depth = depth;
//        }
//
//        @Override
//        public int compareTo(Object o) {
//            NodeDepth nd = (NodeDepth) o;
//            return this.depth - nd.depth;
//        }
//    }
//    public static void main(String[] args) {
//
//        Node node = new Node(1);
//        //node.data=1;
//        node.left=new Node(2);
//        node.right=new Node(3);
//        node.left.left=new Node(4);
//        node.left.right=new Node(5);
//        node.left.left.left=new Node(6);
//        node.left.left.right=new Node(7);
//
//        Node root = new Node(1);
//             //root = new Node(1);
//              root.left = new Node(2);
//              root.right = new Node(3);
//              root.left.right = new Node(4);
//              root.left.right.right = new Node(5);
//              root.left.right.right.right = new Node(6);
//
//              topView(root,0,0);
//        map.keySet().stream().sorted(Comparator.reverseOrder()).forEach(i->{
//            //System.out.println(i);
//           // System.out.print(map.get(i).peek().data+" ");
//        });
//
//        //System.out.println();
//        int depth = maxDepth(node);
//        System.out.println("maxDiameter:"+maxDiameter);
//
//    }
//
//    private static int maxDepth(Node node) {
//        if(node == null)
//            return 0;
//        int l = maxDepth(node.left);
//        int r = maxDepth(node.right);
//
//        maxDiameter = Integer.max(maxDiameter,(l+r));
//        return Integer.max(l,r)+1;
//
//    }
//
//    private static void topView(Node node, int depth, int hd){
//        if(node == null)
//            return ;
//        PriorityQueue<NodeDepth> depthPriorityQueue = map.getOrDefault(hd, new PriorityQueue<>());
//
//        depthPriorityQueue.add(new NodeDepth(node.data,depth));
//        if(!map.containsKey(hd)) {
//            map.put(hd, depthPriorityQueue);
//        }
//
//        topView(node.left,depth+1,hd+1);
//        topView(node.right,depth+1,hd-1);
//
//
//    }
//
//}
