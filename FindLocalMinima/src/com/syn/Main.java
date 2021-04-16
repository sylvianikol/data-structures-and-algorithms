package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = {9, 6, 3, 14, 5, 7, 4};
//        int[] array = {23, 8, 15, 2, 3};
//        int[] array = {1, 2, 3};
//        int[] array = {3, 2, 1};
//        int[] array = {3, 2};
//        int[] array = {1, 2};
//        int[] array = {2};
        int minimaIndex = recursiveFindLocalMinima(array, 0, array.length - 1, array.length);

        if (minimaIndex != -1) {
            System.out.println(array[minimaIndex]);
        } else {
            System.out.println("Nothing found!");
        }
    }

    // binary search, recursive
    private static int recursiveFindLocalMinima(int[] array, int low, int high, int length) {
        if (array.length == 0) {
            return -1;
        }

        if (array.length == 1) {
            return 0;
        }

        int mid = (low + high) >>> 1;

        if (array.length == 2) {
            if (!isMinima(array, mid)) {
                return mid + 1;
            }
            return mid;
        }

        if (isMinima(array, mid)) {
            return mid;
        }

        if (mid > 0 && array[mid - 1] < array[mid]) {
            return recursiveFindLocalMinima(array, low, mid - 1, length);
        }

        return recursiveFindLocalMinima(array, mid + 1, high, length);
    }

    //  linear scan solution
//    private static int findLocalMinima(int[] array) {
//
//        if (array.length == 0) {
//            return -1;
//        }
//
//        if (array.length == 1) {
//            return 0;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (isMinima(array, i)) {
//                return i;
//            }
//        }
//
//        return -1;
//    }

    private static boolean isMinima(int[] array, int i) {
        return (i == 0 && array[i] <= array[i + 1])
                || (i == array.length - 1 && array[i] <= array[i - 1])
                || (i < array.length - 1 && (array[i] <= array[i + 1] && array[i] <= array[i - 1]));
    }
}
