package com.syn;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String input = "abcdefg";

        System.out.println(allUniqueChars(input));
    }

    // Using indexOf and lastIndexOf
    private static boolean allUniqueChars(String input) {
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (input.indexOf(c) != input.lastIndexOf(c)) {
                return false;
            }
        }

        return true;
    }

    // Using HashSet
//    private static boolean allUniqueChars(String input) {
//        Set<Character> chars = new HashSet<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            if (!chars.add(input.charAt(i))) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
