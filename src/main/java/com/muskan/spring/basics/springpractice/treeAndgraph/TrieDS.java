package com.muskan.spring.basics.springpractice.treeAndgraph;

import java.util.HashMap;
import java.util.Map;

public class TrieDS {

    private class TrieNode{
        Map<Character,TrieNode> trieNodeMap;
        boolean endOfWord;
        public TrieNode(){
            this.trieNodeMap = new HashMap<>();
            this.endOfWord = false;
        }
    }

    private final TrieNode root;
    public TrieDS(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.trieNodeMap.get(ch);
            if(node == null){
                node = new TrieNode();
                current.trieNodeMap.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.trieNodeMap.get(ch);
            if(node == null){
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public void delete(String word){
        delete(root,word,0);
    }

    private boolean delete(TrieNode current, String word, int index) {
        if(index == word.length()){
            if(!current.endOfWord){
                return false;
            }
            current.endOfWord = false;
            //if current has no other mapping ten return true
            return current.trieNodeMap.size()==0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.trieNodeMap.get(ch);
        if(node == null)
            return false;

        boolean shouldDeleteCurrentNode = delete(node,word,index+1);
        if(shouldDeleteCurrentNode){
            current.trieNodeMap.remove(ch);
            return current.trieNodeMap.size() ==0;
        }
        return false;

    }

    public static void main(String[] args) {
        TrieDS tds = new TrieDS();
        tds.insert("ab");
        tds.insert("abc");
        tds.insert("abd");
        tds.insert("abcd");
    }

}
