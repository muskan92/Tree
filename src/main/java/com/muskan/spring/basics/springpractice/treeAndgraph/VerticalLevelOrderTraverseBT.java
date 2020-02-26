package com.muskan.spring.basics.springpractice.treeAndgraph;

import com.muskan.spring.basics.springpractice.treeAndgraph.BTNode;

import java.util.*;

public class VerticalLevelOrderTraverseBT {

    BTNode root;
    Map<Integer, List> levelMap = new HashMap<>();

    List<BTNode> listNode = new LinkedList<>();

    public void crossLevel(BTNode n, int level){

        if(n == null){
            return;
        }
        if(levelMap.containsKey(level)){
            levelMap.get(level).add(n.data);
        }
        else {
            List nodeList = new ArrayList();
            nodeList.add(n.data);
            levelMap.put(level,nodeList);
        }
        n.level=level;
        listNode.add(n);

        crossLevel(n.left,level);
        crossLevel(n.right,level+1);
    }

    public void printCrossLevel(){
        Set<Integer> s = levelMap.keySet();
        s.stream().filter(k->k>0).forEach(k->{
            Collections.reverse(levelMap.get(k));
        });

        s.stream().forEach(k->{

            levelMap.get(k).forEach(System.out::print);
            System.out.println();
        });

        listNode.stream().forEach(i->{
            System.out.println(i);
        });
        Collections.sort(listNode);
        int a[] = {0};
        listNode.stream().forEach(n->{
                if(n.level==a[0]){
                    System.out.print(n.data);
                }
                else {
                    a[0]++;
                    System.out.println();
                    System.out.print(n.data);
                }
        });
    }
}

