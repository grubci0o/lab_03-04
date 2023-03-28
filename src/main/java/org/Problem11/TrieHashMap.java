package org.Problem11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieHashMap {
    class Node {
        char c;
        Map<Character, Node> children;
        boolean endOfWord;

        public Node(){
            children = new HashMap<>();
            endOfWord = false;
        }

        public Node(char c) {
            this.c = c;
            children = new HashMap<>();
            endOfWord = false;
        }

        private Node root;

    }


    private Node root;

    public TrieHashMap(){
        root = new Node();
    }



    public void insertWord(String word){
        Node current = root;
        for(char c : word.toCharArray()){
            var node = current.children.get(c);
            if ( !current.children.containsKey(c)){
                node = new Node(c);
                current.children.put(c, node);
            }
            current = node;

        }
        current.endOfWord = true;
    }


    public List<String> autoComplete(String prefix){
        List<String> autoComplete = new ArrayList<>();
        Node current = root;

        for (char c : prefix.toCharArray()){
            current = current.children.get(c);
            if (current == null) return autoComplete;
        }

        searchWords(current, autoComplete, prefix);
        return autoComplete;

    }

    private void searchWords(Node current, List<String> complete, String prefix){
        if(current == null) return;
        if(current.endOfWord){
            complete.add(prefix);
        }

        Map<Character, Node> map = current.children;

        for (Character c: map.keySet()){
            searchWords(map.get(c), complete, prefix + String.valueOf(c));
        }


    }


















}
