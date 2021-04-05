package com.syn;

public class Main {

    public static void main(String[] args) {

        // data must have same radix and width
        // RADIX is the number of unique digits/values that a numbering system or alphabet has
        // for ex. the radix of the decimal system is 10, and for the english alphabet - 26
        // WIDTH is the number of digits or letters.
        // for ex. "hello" has a width of 5, number 10 has a width of 2

        int[] array = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(array, 10, 4);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(int[] array, int position, int radix) {

        int numItems = array.length;
        int[] countArray = new int[radix];

        for (int value : array) {
            int index = getDigit(position, value, radix);
            countArray[index]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            int index = --countArray[getDigit(position, array[tempIndex], radix)];
            temp[index] = array[tempIndex];
        }

        System.arraycopy(temp, 0, array, 0, numItems);
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
