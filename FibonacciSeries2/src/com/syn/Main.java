package com.syn;

public class Main {
    // --- Directions
    // Print out the n-th entry in the fibonacci series.
    // The fibonacci series is an ordering of numbers where
    // each number is the sum of the preceding two.
    // For example, the sequence
    //  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    // forms the first ten entries of the fibonacci series.
    // Example:
    //   fib(4) === 3
    public static void main(String[] args) {

        System.out.println(recursiveFibonacci(4));
    }

    private static int recursiveFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
