package org.Problem11;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    class TrieNode {
        private char value;
        private boolean isWord;
        private TrieNode[] children;

        public TrieNode(char c){
            this.value = c;
            this.isWord = false;
            this.children = new TrieNode[26];
        }


    }
    TrieNode root = new TrieNode('$');

    public void insert(String word){
        TrieNode nextNode = root;
        for (char x : word.toCharArray()){
            if(nextNode.children[x - 'a'] == null){
                nextNode.children[x - 'a'] = new TrieNode(x);
            }
            nextNode = nextNode.children[x - 'a'];
        }
        nextNode.isWord = true;
    }

    public TrieNode getLast(String word){
        TrieNode nextNode = root;
        for (char x : word.toCharArray()){
            if(nextNode.children[x - 'a'] == null){
                return null;
            }
            nextNode = nextNode.children[x - 'a'];

        }
        return nextNode;
    }
    public boolean search(String key){
        TrieNode t = getLast(key);
        return (t != null && t.isWord);
    }



    public void getAllStartingWithPrefixHelper(TrieNode root, List<String> list, StringBuffer curr){
        if (root.isWord){
            list.add(curr.toString());
        }
        if (root != null ){
            return;
        }
        for (TrieNode child : root.children){
            if(child != null) {
                getAllStartingWithPrefixHelper(child, list, curr.append(child.value));
                curr.setLength(curr.length() - 1);
            }

        }

    }



    public List<String> getAllStartingWithPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        TrieNode nextNode = root;
        var curr = new StringBuffer();
        for ( char x : prefix.toCharArray()){
            if (nextNode.children[x - 'a'] == null){
                return result;
            }
            nextNode = nextNode.children[x - 'a'];
            curr.append(x);
        }
        getAllStartingWithPrefixHelper(nextNode, result, curr);
        return result;
    }
}
