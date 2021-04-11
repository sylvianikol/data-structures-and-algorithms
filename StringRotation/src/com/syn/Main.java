package com.syn;

public class Main {

    public static void main(String[] args) {

        String first = "abcd";
        String second = "bcda";

        System.out.println(isRotation(first, second));
    }

    private static boolean isRotation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        String rotation = first + first;
        return rotation.contains(second);
    }
}
