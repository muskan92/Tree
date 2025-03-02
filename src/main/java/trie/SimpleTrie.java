package trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode{

    Map<Character, TrieNode> refNode = new HashMap<>();

    boolean isEndOfWord;

    @Override
    public String toString() {
        return this.hashCode() +"  ,  " +"TrieNode{" +
                "refNode=" + this.refNode +
                ", isEndOfWord=" + isEndOfWord +
                '}' ;
    }
}

public class SimpleTrie {

     static TrieNode root = new TrieNode();

     static void insert(String word){

         if(word == null || word.isEmpty())
             return;;

        TrieNode current = root;

        for(char currChar : word.toCharArray()){
            current.refNode.putIfAbsent(currChar,new TrieNode());
            //System.out.println(current);
            current = current.refNode.get(currChar);
        }
        current.isEndOfWord = true;
        //System.out.println(current);

    }

    static boolean search(String word){

         if(word == null || word.isEmpty())
             return false;

         TrieNode current = root;

         for(char ch : word.toCharArray()){
             //System.out.println(current);
             if(! current.refNode.containsKey(ch)){
                 return false;
             }
             current = current.refNode.get(ch);
         }
         return current.isEndOfWord;

    }

    static boolean startsWith(String prefix){

        if(prefix == null || prefix.isEmpty())
            return false;

         TrieNode current = root;

         for(char ch : prefix.toCharArray()){
             if(! current.refNode.containsKey(ch))
                 return false;
         }

         return true;
    }

    public static void main(String[] args) {

        insert("aple");
        insert("cat");

        System.out.println(search("ap"));
        System.out.println(search("aple"));

        System.out.println(startsWith("ca"));
        System.out.println(startsWith("pa"));

    }


}
