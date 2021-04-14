package com.syn;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // 1. Given array of +n and -n integers, find a pair whose sum is closest to zero in an array.
//        int[] array = {1, 3, -5, 7, 8, 20, -40, 6};
//        findPairClosestToZero(array);

        // 2. Given a sorted array and a number n, find the pair in array whose sum is closest to n
//        int number = 5;
//        int[] array = {-40, -5, 1, 3, 6, 7, 8, 20};
//        findPairClosestToN(array, number);

        // 3. Find all pairs of elements from an array whose sum is equal to given number
        int number = 15;
        int[] array = {-40, -5, 1, 3, 6, 7, 8, 20};
        findPairsEqualToN(array, number);
    }

    private static void findPairsEqualToN(int[] array, int number) {
        Map<Integer, Integer> usedPairs = new HashMap<>();

        for (int i : array) {
            for (int j : array) {
                if (i + j == number && !exists(usedPairs, i, j)) {
                    System.out.println(i + " and " + j);
                    usedPairs.put(i, j);
                }
            }
        }
    }

    private static boolean exists(Map<Integer, Integer> map, int i, int j) {
        return map.containsKey(j) && map.get(j) == i;
    }

    private static void findPairClosestToN(int[] array, int number) {
        if (array.length < 2) {
            return;
        }

        int closest = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        for (int i : array) {
            for (int j : array) {
                int pairSum = i + j;
                int diff = Math.abs(number - pairSum);

                if (diff < closest) {
                    closest = diff;
                    first = i;
                    second = j;
                }
            }
        }

        System.out.println(first + " and " + second);
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
