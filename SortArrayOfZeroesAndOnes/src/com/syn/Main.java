package com.syn;

public class Main {
    // Given an array of 0’s and 1’s in random order, you need to separate 0’s and 1’s in an array.
    public static void main(String[] args) {

        int[] array = {0, 1, 0, 0, 1, 1, 1, 0, 1};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            while (array[left] == 0) {
                left++;
            }

            while (array[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }

//    private static void sort(int[] array) {
//        int countOnes = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                array[i] = 0;
//                countOnes++;
//            }
//        }
//
//        for (int i = array.length - 1; i >= array.length - countOnes; i--) {
//            array[i] = 1;
//        }
//    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
