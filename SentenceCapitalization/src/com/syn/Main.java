package com.syn;

public class Main {
    // --- Directions
    // Write a function that accepts a string.  The function should
    // capitalize the first letter of each word in the string then
    // return the capitalized string.
    // --- Examples
    //   capitalize('a short sentence') --> 'A Short Sentence'
    //   capitalize('a lazy fox') --> 'A Lazy Fox'
    //   capitalize('look, it is working!') --> 'Look, It Is Working!'
    public static void main(String[] args) {

        System.out.println(capitalize("look, it is working!"));
    }

    private static String capitalize(String input) {

        StringBuilder capitalized = new StringBuilder();
        char[] symbols = input.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if (i == 0 || symbols[i - 1] == ' ') {
                capitalized.append(Character.toUpperCase(symbols[i]));
            } else {
                capitalized.append(symbols[i]);
            }
        }

        return capitalized.toString();
    }
}
