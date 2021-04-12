package com.syn;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    // Using a stack determine whether a string is a palindrome
    // Ignore case, punctuation and spaces.
    // Examples:
    // "I did, did I?" -> true
    // "Racecar" -> true
    // "Hello" -> false
    // "Don't nod" -> true
    // "Was it a car or a cat I saw?" -> true

    public static void main(String[] args) {

        String input = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(clean(input).toLowerCase()));
    }

//    private static boolean isPalindrome(String input) {
//        return reverse(input).equals(input);
//    }

    private static boolean isPalindrome(String input) {
        Deque<Character> stack = collectInDeque(input, "stack");
        Deque<Character> queue = collectInDeque(input, "queue");

        if (stack.size() != queue.size()) {
            return false;
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }

    private static String reverse(String input) {
        Deque<Character> stack = collectInDeque(input, "stack");
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    private static Deque<Character> collectInDeque(String input, String type) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] letters = input.toCharArray();

        switch (type) {
            case "stack":
                for (char letter : letters) {
                    deque.push(letter);
                }
                break;
            case "queue":
                for (char letter : letters) {
                    deque.offer(letter);
                }
                break;
            default:
                throw new IllegalArgumentException();
        }

        return deque;
    }

    private static String clean(String input) {
        return input.replaceAll("[^A-Za-z]", "");
    }
}
