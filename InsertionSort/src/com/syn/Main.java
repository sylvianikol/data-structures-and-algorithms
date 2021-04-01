package com.syn;

public class Main {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i = firstUnsortedIndex;

            while (i > 0 && array[i - 1] > newElement) {
                array[i] = array[i - 1];
                --i;
            }

            array[i] = newElement;
        }

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
