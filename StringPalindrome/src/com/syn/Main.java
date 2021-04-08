package com.syn;

public class Main {

    public static void main(String[] args) {
	    // Check if a given String is palindrome or not.
        // A Palindrome is a String which is equal to the reverse of itself, e.g.,
        // "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
        // Though be prepared with both recursive and iterative solution of this problem.
        // The interviewer may ask you to solve without using any library method,
        // e.g. indexOf() or subString() so be prepared for that.


        String input = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(input.toLowerCase()));
    }

    private static boolean isPalindrome(String input) {
        return iterativeReverse(input).equals(input);
    }

    private static String recursiveReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1)
                + recursiveReverse(input.substring(0, input.length() - 1));
    }

    private static String iterativeReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] symbols = input.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = symbols.length - 1; i >= 0; i--) {
            reversed.append(symbols[i]);
        }

        return reversed.toString();
    }
}
