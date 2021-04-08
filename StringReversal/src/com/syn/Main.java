package com.syn;

public class Main {
    // --- Directions
    // Given a string, return a new string with the reversed order of characters
    // --- Examples
    //   reverse('apple') === 'elppa'
    //   reverse('hello') === 'olleh'
    //   reverse('Greetings!') === '!sgniteerG'
    public static void main(String[] args) {

        System.out.println(iterativeReverse("hello"));
    }

    private static String iterativeReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder();
        char[] symbols = input.toCharArray();

        for (int i = symbols.length - 1; i >= 0; i--) {
            reversed.append(symbols[i]);
        }

        return reversed.toString();
    }

    private static String recursiveReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1)
                + recursiveReverse(input.substring(0, input.length() - 1));
    }
}
