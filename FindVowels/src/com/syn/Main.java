package com.syn;

public class Main {
    // --- Directions
    // Write a function that returns the number of vowels used in a string.
    // Vowels are the characters 'a', 'e' 'i', 'o', and 'u'.
    // --- Examples
    //   vowels('Hi There!') --> 3
    //   vowels('Why do you ask?') --> 4
    //   vowels('Why?') --> 0
    public static void main(String[] args) {

        System.out.println(vowels("Why?"));
    }

    private static int vowels(String input) {
        int counter = 0;
        String vowels = "aeiou";

        for (char c : input.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                ++counter;
            }
        }

        return counter;
    }
}
