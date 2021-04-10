package com.syn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    // Using a stack determine whether a string is a palindrome
    // Ignore case, punctuation and spaces.
    // Examples:
    // "I did, did I?" -> true
    // "Racecar" -> true
    // "Hello" -> false

    public static void main(String[] args) {

        String input = "Hello";
        System.out.println(isPalindrome(clean(input).toLowerCase()));
    }

    private static boolean isPalindrome(String input) {
        return reverse(input).equals(input);
    }

    private static String reverse(String input) {
        Deque<Character> stack = collectInStack(input);
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    private static Deque<Character> collectInStack(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] letters = input.toCharArray();

        for (char letter : letters) {
            stack.push(letter);
        }

        return stack;
    }

    private static String clean(String input) {
        return input.replaceAll("[^A-Za-z]", "");
    }
}
