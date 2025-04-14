package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode3{
    Map<Character,TrieNode3> childNode = new HashMap<>();
    boolean isEndOfWord;
}

public class WordBreak {

    static TrieNode3 root = new TrieNode3();

    public static void insert(String word){
        TrieNode3 currentNode = root;

        if (word == null || word.isEmpty())
            return;

        for(char ch : word.toCharArray()){
            currentNode.childNode.putIfAbsent(ch,new TrieNode3());
            currentNode = currentNode.childNode.get(ch);
        }
        currentNode.isEndOfWord = true;
    }

    static List<String> wordBreak(String s, TrieNode3 root) {
        List<String> result = new ArrayList<>();
         wordBreakHelper(s, root, "", result);
        return result;
    }

    static void wordBreakHelper(String s, TrieNode3 root, String currentSentence, List<String> result) {
        if (s.isEmpty()) {
            result.add(currentSentence.trim());
            return;
        }

        TrieNode3 current = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!current.childNode.containsKey(c)) {
                return;
            }
            current = current.childNode.get(c);

            if (current.isEndOfWord) {
                String prefix = s.substring(0, i + 1);
                wordBreakHelper(s.substring(i + 1), root, currentSentence + " " + prefix, result);
                    //return true;
            }
        }
        //return false;
    }

    public static void main(String[] args) {

        insert("my");
        insert("name");
        insert("i");
        //insert("khan");
        //insert("myname");
        insert("mynameis");
        insert("iskhan");
        //insert("khan");

        System.out.println(wordBreak("mynameiskhan" , root));

    }
}
