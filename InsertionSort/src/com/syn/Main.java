package com.syn;

public class Main {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int element = array[firstUnsortedIndex];

            int index = firstUnsortedIndex;

            while (index > 0 && array[index - 1] > element) {
                array[index] = array[index - 1];
                --index;
            }

            array[index] = element;
        }

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
