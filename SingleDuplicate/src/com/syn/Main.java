package com.syn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int expectedSum = sum(array);

        array[50] = 1;

        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println(findDuplicate(array, expectedSum));
    }

    private static int findDuplicate(int[] array, int expectedSum) {

        return array[expectedSum - sum(array)];
    }

    private static int sum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
