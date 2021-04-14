package com.syn;

public class Main {
    // Given array of +n and -n integers, find a pair whose sum is closest to zero in an array.
    public static void main(String[] args) {

        int[] array = {1, 3, -5, 7, 8, 20, -40, 6};
        findPairClosestToZero(array);
    }

    private static void findPairClosestToZero(int[] array) {
        int closest = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        for (int i : array) {
            for (int j : array) {
                int pairSum = Math.abs(i + j);
                if (pairSum < closest) {
                    closest = pairSum;
                    first = i;
                    second = j;
                }
            }
        }

        System.out.println(first + " and " + second);
    }
}
