package com.syn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {12, 17, 70, 15, 22, 65, 21, 90};
        separateOddEven(array);
        print(array);
    }

    private static void separateOddEven(int[] array) {
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length; i++) {

            while (array[left] % 2 == 0) {
                left++;
            }

            while (array[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                swap(array, left, right);
            }
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
}
