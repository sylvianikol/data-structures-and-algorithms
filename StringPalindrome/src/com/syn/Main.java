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

        if (input.length() == 1) {
            return true;
        }

        return recursiveReverse(input).equals(input);
    }

    public static String iterativeReverse(String input) {
        char[] letters = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = letters.length - 1; i >= 0; i--) {
            sb.append(letters[i]);
        }

        return sb.toString();
    }

    public static String recursiveReverse(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1)
                + recursiveReverse(input.substring(0, input.length() - 1));
    }
}
