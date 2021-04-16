package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 6, -1, 2, 4, 1, -6, 5}; // 8
        slidingWindowMax(array, 3);
    }

    private static void slidingWindowMax(int[] array, int step) {

        int index = 0;
        int length = index + step;

        while (length <= array.length) {
            int max = index;

            for (int i = index; i < length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.print(max + " ");
            index++;
            length = index + step;
        }
    }
}
