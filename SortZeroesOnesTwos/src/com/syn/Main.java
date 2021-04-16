package com.syn;

import java.util.Arrays;

public class Main {
    // Given an array containing zeroes, ones and twos only.
    // Write a function to sort the given array in O(n) time complexity.
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 0, 0, 1, 2, 2, 1};
        dutchSort(array);
        print(array);
    }

    // Dutch national flag algorithm or Three way partitioning
    private static void dutchSort(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, mid, low);
                mid++;
                low++;
            } else if (array[mid] == 2) {
                swap(array, mid, high);
                high--;
            } else if (array[mid] == 1) {
                mid++;
            }
        }
    }

    private static void sort(int[] array) {
        int zeroes = 0;
        int ones = 0;

        for (int number : array) {
            if (number == 0) {
                zeroes++;
            }

            if (number == 1) {
                ones++;
            }
        }

        for (int i = 0; i < zeroes; i++) {
            array[i] = 0;
        }

        for (int i = zeroes; i < zeroes + ones; i++) {
            array[i] = 1;
        }

        for (int i = zeroes + ones; i < array.length; i++) {
            array[i] = 2;
        }
    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
