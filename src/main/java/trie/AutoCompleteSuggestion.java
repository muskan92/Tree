package trie;

import java.util.*;

class TrieNode2{

    Map<Character, TrieNode2> childNode = new HashMap<>();
    boolean isEndOfWord;
}

//prefix search
public class AutoCompleteSuggestion {

    static TrieNode2 root = new TrieNode2();

    /*
    insert string in Trie nodes
     */
    static void insert(String word){

        if(word == null || word.isEmpty())
            return;

        TrieNode2 currentNode = root;
        for (char ch : word.toCharArray()){


            currentNode.childNode.putIfAbsent(Character.toLowerCase(ch),new TrieNode2());
            currentNode = currentNode.childNode.get(ch);

        }
        currentNode.isEndOfWord = true;
    }

    static List<String> getSuggestion(String prefix){

        if(prefix == null || prefix.isEmpty())
            return new ArrayList<>();

        TrieNode2 currentNode = root;

        for(char ch : prefix.toCharArray()){

            if(! currentNode.childNode.containsKey(ch))
                return new ArrayList<>();
            currentNode = currentNode.childNode.get(Character.toLowerCase(ch));
        }

        List<String> suggestions = new ArrayList<>();

        getWordsFromNode(currentNode, prefix, suggestions);

        Collections.sort(suggestions);
        return suggestions;
    }

    /*

     */
    private static void getWordsFromNode(TrieNode2 node, String prefix, List<String> suggestions) {

        if (node == null)
            return;

        if(node.isEndOfWord)
            suggestions.add(prefix);

        for(Map.Entry<Character , TrieNode2> entry: node.childNode.entrySet()){

            getWordsFromNode(entry.getValue(), prefix+entry.getKey(), suggestions);

        }
    }

    public static void main(String[] args) {

        insert("apply");
        insert("apple");
        insert("application");
        insert("cat");
        insert("car");
        insert("cash");


        System.out.println(getSuggestion("ap"));
        System.out.println(getSuggestion("an"));
        System.out.println(getSuggestion("c"));
        System.out.println(getSuggestion(""));
        System.out.println(getSuggestion(" "));
        System.out.println(getSuggestion(null));
    }
}
