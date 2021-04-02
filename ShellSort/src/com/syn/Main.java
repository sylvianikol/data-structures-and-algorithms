package com.syn;

public class Main {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int element = array[i];
                int index = i;

                while (index >= gap && array[index - gap] > element) {
                    array[index] = array[index - gap];
                    index -= gap;
                }

                array[index] = element;
            }
        }

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
