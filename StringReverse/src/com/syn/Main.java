package com.syn;

public class Main {

    public static void main(String[] args) {

        String word = "idea";
        System.out.println(iterativeReverse(word));
    }

    private static String recursiveReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1)
                + recursiveReverse(input.substring(0, input.length() - 1));
    }

    private static String iterativeReverse(String input) {
        StringBuilder sb = new StringBuilder();
        char[] letters = input.toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {
            sb.append(letters[i]);
        }

        return sb.toString();
    }
}
