package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TopologicalSort {

    public static void main(String[] args) {
        int[][] ar = new int[][]{
                {5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}
        };
        System.out.println(
                "Following is a Topological Sort");
        topologicalSort(ar);
    }

    private static void topologicalSort(int[][] ar) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        List<List<Integer>> zeroParentOneParentNodes = new ArrayList<>();
        zeroParentOneParentNodes.add(new ArrayList<>());
        zeroParentOneParentNodes.add(new ArrayList<>());

        for (int[] pair : ar) {
            adj.putIfAbsent(pair[0], new ArrayList<>());
            adj.get(pair[0]).add(pair[1]);
        }

        int[] inCount = new int[ar.length];

        for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
            for (Integer child : entry.getValue()) {
                inCount[child]++;
            }
        }
        System.out.println(adj);

        System.out.println(Arrays.toString(inCount));

        BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(ar.length);

        for (int i = 0; i < inCount.length; i++) {
            if (inCount[i] == 0) {
                q.add(i);
            }
        }

        for (int i = 0; i < inCount.length; i++) {
            if (inCount[i] == 0) {
                zeroParentOneParentNodes.get(0).add(i);
            }
            if (inCount[i] == 1) {
                zeroParentOneParentNodes.get(1).add(i);
            }
        }


        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()) {
            int curr = q.poll();
            result.add(curr);

            if (adj.containsKey(curr)) {
                for (Integer ch : adj.get(curr)) {
                    inCount[ch]--;
                    if (inCount[ch] == 0) {
                        q.add(ch);
                    }
                }
            }
        }

        System.out.println(result);
        System.out.println(zeroParentOneParentNodes);
    }
}
