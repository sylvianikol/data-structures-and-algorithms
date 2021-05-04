package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = { -22, -15, 1, 7, 20, 35, 55 };

        int index = recursiveFind(array, 20, 0, array.length);
//        int index = iterativeFind(array, 1);

        System.out.println(index);
    }

    private static int recursiveFind(int[] array, int num, int start, int end) {

        if (start >= end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (array[middle] == num) {
            return middle;
        }

        if (array[middle] > num) {
            return recursiveFind(array, num, start, middle);
        }

        if (array[middle] < num) {
            return recursiveFind(array, num, middle + 1, end);
        }

        return -1;
    }

    private static int iterativeFind(int[] array, int num) {

        int start = 0;
        int end = array.length;

        while (start < end) {

            int middle = (start + end) / 2;

            if (array[middle] == num) {
                return middle;
            }

            if (array[middle] > num) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

}
