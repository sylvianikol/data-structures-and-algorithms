package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] array = { 12, 6, 8, 1, 7, 9, 6, 8 };

        Map<Integer, Integer> duplicatesCounter = countDuplicates(array);

        printDuplicates(duplicatesCounter);
    }

    private static Map<Integer, Integer> countDuplicates(int[] array) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int key : array) {
            counter.putIfAbsent(key, 0);
            int value = counter.get(key);
            counter.put(key, value + 1);
        }

        return counter;
    }


    private static void printDuplicates(Map<Integer, Integer> map) {
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
