package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, Integer> occurrences = new HashMap<>();

    public static void main(String[] args) {

        int[] array = { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
        countNumberOccurrences(array);
        findNumberWithOddOccur(array);
    }

    private static void countNumberOccurrences(int[] array) {
        for (int number : array) {
            occurrences.putIfAbsent(number, 0);
            int count = occurrences.get(number);
            occurrences.put(number, count + 1);
        }
    }

    private static void findNumberWithOddOccur(int[] array) {
        occurrences.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
