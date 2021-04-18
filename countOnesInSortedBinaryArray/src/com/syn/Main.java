package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 0, 0, 1, 1, 1, 1};
//        int[] array = {0, 0, 0};
//        int[] array = {0, 0, 1};
        System.out.println(countOnes(array));
        System.out.println(recursiveCountOnes(array, 0, array.length - 1));
    }

    private static int recursiveCountOnes(int[] array, int start, int end) {
        if (array[start] == 1) {
            return end - start + 1;
        }

        if (array[end] == 0) {
            return 0;
        }

        int mid = (start + end) >>> 1;

        int left = recursiveCountOnes(array, start, mid);
        int right = recursiveCountOnes(array, mid + 1, end);

        return left + right;
    }

    private static int countOnes(int[] array) {
        int index = 0;

        while (index < array.length && array[index] < 1) {
            index++;
        }

        return index == array.length ? 0 : array.length - index;
    }
}
