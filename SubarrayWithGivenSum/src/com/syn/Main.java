package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array =  {2, 3, 6, 4, 9, 0, 11};
//        int[] array =  {2, 3, 6, 4, 9, 9, 9};
        findSubArraysWithSum(array, 9);
    }

    private static void findSubArraysWithSum(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {

            int currentSum = 0;
            int currentIndex = i;

            while (currentIndex < array.length) {
                currentSum += array[currentIndex];
                if (currentSum > sum) {
                    break;
                }

                if (currentSum == sum) {
                    System.out.printf("starting index : %d, Ending index : %d%n", i, currentIndex);
                }
                currentIndex++;
            }
        }
    }
}
