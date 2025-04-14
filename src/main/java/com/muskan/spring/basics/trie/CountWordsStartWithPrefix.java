package trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode1{

    Map<Character,TrieNode1> refNode= new HashMap<>();
    boolean isEndOfWord;

    @Override
    public String toString() {
        return "TrieNode1{" +
                "refNode=" + refNode +
                ", isEndOfWord=" + isEndOfWord +
                '}';
    }
}

public class CountWordsStartWithPrefix {

    static TrieNode1 root = new TrieNode1();

    static void insert(String word){
        TrieNode1 currentNode = root;

        for(char ch : word.toCharArray()){
            currentNode.refNode.putIfAbsent(ch, new TrieNode1());
            currentNode = currentNode.refNode.get(ch);
        }
        currentNode.isEndOfWord = true;
    }

    static int countWordsWithPrefix(String prefix){

        TrieNode1 currentNode = root;

        for(char ch : prefix.toCharArray()){
            if(!currentNode.refNode.containsKey(ch))
                return 0;
            currentNode = currentNode.refNode.get(ch);
        }

        int [] count = {0};
        countWordsFromNode(currentNode,count);
        return count[0];


    }

    static void countWordsFromNode(TrieNode1 node, int[] count) {
        System.out.println(node.refNode.keySet() );
        if(node == null)
            return ;

        if(node.isEndOfWord) {
            count[0]++;
        }

        for(TrieNode1 childNode : node.refNode.values()){
            countWordsFromNode(childNode,count);
        }
    }

    public static void main(String[] args) {

        insert("aple");
        insert("aply");
        insert("ap");

        //System.out.println(countWordsWithPrefix("a"));
        System.out.println(countWordsWithPrefix("b"));
    }


}
