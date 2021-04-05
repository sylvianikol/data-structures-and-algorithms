package com.syn;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("listen");
        words.add("silent");
        words.add("state");
        words.add("taste");
        words.add("invalid");
        words.add("nothing");

        listAnagrams(words);
    }

    public static void listAnagrams(List<String> words) {
        Set<String> sortedWords = new HashSet<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (sortedWords.contains(sortedWord)) {
                System.out.println(word + " is an anagram");
            }

            sortedWords.add(sortedWord);
        }
    }
}
