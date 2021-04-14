package com.syn;

public class Main {
    // 1. find the index of N in a sorted and rotated array in o(logn) time complexity.
    // 2. find min element in a sorted and rotated array
    // 2. Find second largest number in a sorted and rotated array
    public static void main(String[] args) {

        int n = 5;
//        int[] array = {16, 19, 21, 25, 3, 5, 8, 10};
        int[] array = {16, 1, 2, 3, 4, 5, 6, 7};
//        System.out.println(findIndex(array, 0, array.length - 1, n));
//        System.out.println(findMin(array, 0, array.length - 1));
        System.out.println(findSecondLargest(array));
    }

    private static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int current : array) {
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        return secondLargest;
    }

//    private static int findSecondLargest(int[] array) {
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            int current = array[i];
//            int next = array[i + 1];
//            if (current < next) {
//                secondLargest = current;
//            } else {
//                if (i == 0) {
//                    return array[array.length - 1];
//                }
//                return secondLargest;
//            }
//        }
//
//        return secondLargest;
//    }

    private static int findMin(int[] array, int start, int end) {

        int mid;

        while (start < end) {
            mid = (start + end) >>> 1;

            if (array[mid] > array[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return array[start];
    }


    private static int findIndex(int[] array, int start, int end, int number) {

        int mid;

        while (start <= end) {
            // unsigned shift avoids overflows which result in a negative number
            mid = (start + end) >>> 1;

            if (array[mid] == number) {
                return mid;
            }

            if (array[mid] <= array[end]) {

                if (number > array[mid] && number <= array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {

                if (array[start] <= number && number < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
