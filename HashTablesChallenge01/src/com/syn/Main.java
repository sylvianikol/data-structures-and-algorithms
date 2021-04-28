package com.syn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = { 59282, 43, 6894, 500, 99, -58 };

        for (int num : numsToAdd) {
            int index = hash(num);
            nums[index] = num;
        }

        print(nums);
    }

    private static int hash(int value) {
        return Math.abs(value % 10);
    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(v -> System.out.print(v + " "));
    }
}
