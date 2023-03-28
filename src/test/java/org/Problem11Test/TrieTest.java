package org.Problem11Test;

import org.Problem11.TrieHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TrieTest {


    @Test
    public void dePrefixReturnDeerDeal(){
        TrieHashMap trie = new TrieHashMap();
        trie.insertWord("Dog");
        trie.insertWord("Deer");
        trie.insertWord("Deal");
        List<String> autoComplete = trie.autoComplete("De");
        List<String> expectedResult = Arrays.asList("Deal", "Deer");
        Assertions.assertArrayEquals(autoComplete.toArray(), expectedResult.toArray());
    }


    @Test
    public void emptyTrie(){
        TrieHashMap trie = new TrieHashMap();
        List<String> autoComplete = trie.autoComplete("De");
        List<String> expectedResult = Arrays.asList();
        Assertions.assertArrayEquals(autoComplete.toArray(), expectedResult.toArray());
    }

}
