package com.syn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String input = "aaaaccaabaaaaddy";
        System.out.println(findFirstNonRepeatedChar(input));
    }

    // using LinkedHashMap
    private static Character findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> charCounter = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            charCounter.putIfAbsent(c, 0);
            int count = charCounter.get(c);
            charCounter.put(c, count + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    // using indexOf() and lastIndexOf()
//    private static Character findFirstNonRepeatedChar(String input) {
//        char[] chars = input.toCharArray();
//
//        for (char c : chars) {
//            int firstIndex = input.indexOf(c);
//            int lastIndex = input.lastIndexOf(c);
//
//            if (firstIndex == lastIndex) {
//                return c;
//            }
//        }
//
//        return null;
//    }
}
