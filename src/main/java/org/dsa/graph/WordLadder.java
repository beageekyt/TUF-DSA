package org.dsa.graph;

import java.util.*;
import java.util.List;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        int wordLength = beginWord.length();
        if(wordSet.contains(beginWord))
            wordSet.remove(beginWord);
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));
        while(!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            String word = pair.getKey();
            int step = pair.getValue();

            if(word.equals(endWord)) {
                return step;
            }
            for(int i = 0;i < wordLength;i++) {
                char[] charArr = word.toCharArray();
                for(char ch = 'a' ; ch <= 'z' ;ch++) {
                    charArr[i] = ch;
                    String newWord = new String(charArr);
                    if(wordSet.contains(newWord)) {
                        wordSet.remove(newWord);
                        queue.add(new Pair(newWord, step+1));
                    }
                }
            }
        }
        return 0;


    }
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
    }

    static class Pair<K, V>{
        private K key ;
        private V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
}
