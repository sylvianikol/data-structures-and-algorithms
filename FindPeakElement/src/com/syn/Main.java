package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = {9, 6, 3, 14, 5, 7, 4};
        int peakIndex = findPeakElement(array, 0, array.length - 1, array.length);
        System.out.println(array[peakIndex]);
    }

    private static int findPeakElement(int[] array, int start, int end, int length) {
        if (length == 0) {
            return -1;
        }

        if (length == 1) {
            return 0;
        }

        int mid = (start + end) >>> 1;

        if (isPeak(array, mid)) {
            return mid;
        }

        if (array[mid - 1] > array[mid]) {
            return findPeakElement(array, start, mid - 1, length);
        }

        return findPeakElement(array, mid + 1, end, length);
    }

    private static boolean isPeak(int[] array, int i) {
        return (i == 0 && array[i] > array[i + 1])
                || (i == array.length - 1 && array[i] > array[i - 1])
                || (i > 0 && i < array.length - 1 && (array[i] > array[i - 1]
                    && array[i] > array[i + 1]));
    }
}
