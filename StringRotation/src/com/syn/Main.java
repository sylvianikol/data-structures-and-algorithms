package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String first = "abcd";
        String second = "bcda";
        Map<String, Integer> map = new HashMap<>();
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
