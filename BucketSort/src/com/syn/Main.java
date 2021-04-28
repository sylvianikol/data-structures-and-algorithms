package com.syn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = { 54, 46, 83, 66, 95, 92, 43 };
        bucketSort(array);
        print(array);
    }

    private static void bucketSort(int[] array) {

    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(v -> System.out.println(v + " "));
    }
}
