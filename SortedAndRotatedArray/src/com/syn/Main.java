package com.syn;

public class Main {
    // find the index of n in rotated and sorted array in o(logn) time complexity.
    public static void main(String[] args) {

        int n = 5;
        int[] array = {16, 19, 21, 25, 3, 5, 8, 10};
        System.out.println(findIndex(array, 0, array.length - 1, n));
    }

    private static int findIndex(int[] array, int start, int end, int number) {

        int mid;

        while (start <= end) {
            // unsigned shift avoids overflows which result in a negative number
            mid = (start + end) >>> 1;

            if (array[mid] == number) {
                return mid;
            }

            if (array[mid] <= array[end]) {

                if (number > array[mid] && number <= array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {

                if (array[start] <= number && number < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
