package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.*;

public class LevelOrderZigzagHashmap {

    BTNode root;
    Map<Integer, List<Integer>> map = new HashMap<>();

    public void levelOrder(BTNode node, int level) {


        if(node==null){
            return;
        }
        node.level = level;


        if(map.containsKey(node.level)){
            map.get(level).add(node.data);
        }
        else {
            List nodeList = new ArrayList();
            nodeList.add(node.data);
            map.put(node.level,nodeList);
        }

        levelOrder(node.left,level+1);
        levelOrder(node.right,level+1);

    }

    public void print(){

        map.keySet().stream().forEach(k->{
            if(k%2==0){
                printEven(k);
            }else{
                printOdd(k);
            }
        });
    }

    private void printOdd(Integer k) {

        List l = map.get(k);
        Collections.reverse(l);
        l.stream().forEach(e->{
            System.out.print(e+" ");
        });
    }

    private void printEven(Integer k) {

        List l = map.get(k);
        l.stream().forEach(e->{
            System.out.print(e+" ");
        });
    }

}
