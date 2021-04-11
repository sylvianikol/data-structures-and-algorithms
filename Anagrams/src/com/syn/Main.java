package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // --- Directions
    // Check to see if two provided strings are anagrams of each other.
    // One string is an anagram of another if it uses the same characters in the same quantity.
    // Only consider characters, not spaces or punctuation.
    // Consider capital letters to be the same as lower case
    // --- Examples
    //   anagrams('rail safety', 'fairy tales') --> True
    //   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
    //   anagrams('Hi there', 'Bye there') --> False
    public static void main(String[] args) {

        System.out.println(isAnagram("Hi there", "Bye there"));
    }

    private static boolean isAnagram(String s1, String s2) {
        String first = clean(s1).toLowerCase();
        String second = clean(s2).toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        int[] charCounter = new int[256];

        for (int i = 0; i < first.length(); i++) {
            charCounter[first.charAt(i)]++;
            charCounter[second.charAt(i)]--;
        }

        for (int c : charCounter) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

//    private static boolean isAnagram(String s1, String s2) {
//        String first = clean(s1).toLowerCase();
//        String second = clean(s2).toLowerCase();
//
//        if (first.length() != second.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> firstCharCounter = countChars(first);
//        Map<Character, Integer> secondCharCounter = countChars(second);
//
//        if (firstCharCounter.size() != secondCharCounter.size()) {
//            return false;
//        }
//
//        return firstCharCounter.equals(secondCharCounter);
//    }

    private static String clean(String input) {
        return input.replaceAll("[^A-Za-z]", "");
    }

    private static Map<Character, Integer> countChars(String input) {
        Map<Character, Integer> charCounter = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCounter.putIfAbsent(c, 0);
            int count = charCounter.get(c) + 1;
            charCounter.put(c, count);
        }

        return charCounter;
    }
}
