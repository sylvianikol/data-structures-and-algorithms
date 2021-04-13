package com.syn;

public class Main {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 5};
        System.out.println(findMissingNumber(array, 5));
    }

    private static int findMissingNumber(int[] array, int n) {

        int total = n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            total -= array[i];
        }

        return total;
    }
}
