package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.TreeMap;

public class TopView {

    BTNode root;
    static class pair{
        int nodeData;
        int nodeLevel;

        public pair(int nodeData, int nodeLevel) {
            this.nodeData = nodeData;
            this.nodeLevel = nodeLevel;
        }
    }

    TreeMap<Integer,pair> map = new TreeMap<>();
    static boolean flag = true;
    public void treeTopView(BTNode node, int vLevel, int d){

        if(node == null){
            return;
        }

        if(map.get(d)==null){
            map.put(d,new pair(node.data,vLevel));
        }
        else if(map.get(d).nodeLevel>vLevel){
            map.put(d,new pair(node.data,vLevel));
        }

        treeTopView(node.left,vLevel+1,d-1);
        treeTopView(node.right,vLevel+1,d+1);

    }

    public void printTopView(){
        map.entrySet().stream().forEach(e->{
            System.out.print(e.getValue().nodeData+" ");
        });

    }
}
