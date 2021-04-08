package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // --- Directions
    // Given a string, return the character that is most commonly used in the string.
    // --- Examples
    // maxChar("abcccccccd") === "c"
    // maxChar("apple 1231111") === "1"

    public static void main(String[] args) {

        String input = "apple 1231111";
        System.out.println(maxChar(input));
    }

    private static char maxChar(String input) {
        Map<Character, Integer> charCounter = new HashMap<>();
        int max = 0;
        char maxChar = '_';

        char[] symbols = input.toCharArray();

        for (char symbol : symbols) {
            charCounter.putIfAbsent(symbol, 0);
            charCounter.put(symbol, charCounter.get(symbol) + 1);

            int count = charCounter.get(symbol);
            if (count > max) {
                max = count;
                maxChar = symbol;
            }
        }

        return maxChar;
    }
}
