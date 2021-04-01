package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    public static void swap(int[] array, int i) {

        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }
}
