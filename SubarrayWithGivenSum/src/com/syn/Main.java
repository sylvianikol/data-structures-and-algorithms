package com.syn;

public class Main {

    public static void main(String[] args) {

//        int[] array =  {2, 3, 6, 4, 9, 0, 11};
        int[] array =  {9};
        findSubArraysWithSum(array, 9);
    }

    private static void findSubArraysWithSum(int[] array, int sum) {
        if (array.length == 1) {
            if (array[0] == sum) {
                System.out.printf("starting index : %d, Ending index : %d%n", 0, 0);
            }
            return;
        }

        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (start < array.length && end < array.length) {
            currentSum += array[end];

            if (currentSum < sum) {
                end++;
            }

            if (currentSum == sum) {
                System.out.printf("starting index : %d, Ending index : %d%n", start, end);
            }
            // 2, 3, 6, 4, 9, 0, 11
            if (currentSum > sum || currentSum == sum) {
                if (start == end) {
                    end++;
                } else {
                    currentSum = 0;
                    start++;
                    end = start;
                }
            }



        }
    }

//    private static void findSubArraysWithSum(int[] array, int sum) {
//
//        for (int i = 0; i < array.length; i++) {
//
//            int currentSum = 0;
//            int currentIndex = i;
//
//            while (currentIndex < array.length) {
//                currentSum += array[currentIndex];
//                if (currentSum > sum) {
//                    break;
//                }
//
//                if (currentSum == sum) {
//                    System.out.printf("starting index : %d, Ending index : %d%n", i, currentIndex);
//                }
//                currentIndex++;
//            }
//        }
//    }
}
