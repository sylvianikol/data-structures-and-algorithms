package com.syn;

public class Main {
    // --- Directions
    // Given an integer, return an integer that is the reverse
    // ordering of numbers.
    // --- Examples
    //   reverseInt(15) === 51
    //   reverseInt(981) === 189
    //   reverseInt(500) === 5
    //   reverseInt(-15) === -51
    //   reverseInt(-90) === -9
    public static void main(String[] args) {

        int n = 500;
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {

        boolean isNegative = n < 0;

        int number = Math.abs(n);
        int reversed = 0;

        while (number > 0) {
            int last = number % 10;
            reversed = reversed * 10 + last;
            number /= 10;
        }

        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }
}
