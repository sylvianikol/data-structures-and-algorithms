package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = { -22, -15, 1, 7, 20, 35, 55 };

        int index = recursiveFind(array, 20, 0, array.length - 1);

        System.out.println(index);
    }

    private static int recursiveFind(int[] array, int num, int start, int end) {

        int middle = (start + end) / 2;

        if (start == end && array[middle] != num) {
            return -1;
        }

        if (array[middle] == num) {
            return middle;
        }

        if (array[middle] > num) {
            return recursiveFind(array, num, start, middle - 1);
        }

        if (array[middle] < num) {
            return recursiveFind(array, num, middle + 1, end);
        }

        return -1;
    }
}
