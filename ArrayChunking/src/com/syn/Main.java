package com.syn;

public class Main {
    // --- Directions
    // Given an array and chunk size, divide the array into many subarrays
    // where each subarray is of length size
    // --- Examples
    // chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
    // chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
    // chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
    // chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
    // chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        int chunkSize = 10;
        chunk(array, chunkSize);
    }

    private static void chunk(int[] array, int chunkSize) {

        for (int i = 0; i < array.length; i += chunkSize) {

            for (int j = i; j < i + chunkSize && j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
