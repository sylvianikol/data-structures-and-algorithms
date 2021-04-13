package com.syn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String input = "abc";
        String[] array = input.split("");
        permute(array, array.length);
    }

    private static void permute(String[] array, int pos) {
        if (pos == 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 0; i < pos; i++) {
                permute(array, pos - 1);

                if (pos % 2 == 1) {
                    swap(array, 0, pos - 1);
                } else {
                    swap(array, i, pos - 1);
                }
            }
        }
    }

    private static void swap(String[] array, int right, int left) {
        String temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
}
