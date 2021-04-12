package com.syn;

public class Main {
    // For example: If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
    public static void main(String[] args) {

        String input = "abb";
        findAllSubstr(input);
    }

    private static void findAllSubstr(String input) {

        int step = 1;

        while (step <= input.length()) {
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.substring(i, i + step));
                if (i + step == input.length()) {
                    break;
                }
            }

            step++;
        }

    }
}
