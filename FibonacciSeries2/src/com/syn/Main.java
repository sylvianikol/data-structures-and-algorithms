package com.syn;

import java.util.HashMap;
import java.util.Map;

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

    private static Map<Integer, Integer> existing = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(memoizedFibonacci(4));
    }

    private static int memoizedFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (existing.containsKey(n)) {
            return existing.get(n);
        }

        int value = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        existing.put(n, value);
        return value;
    }

    private static int iterativeFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        int current = 2;
        int fib = 0;

        while (current <= n) {
            fib = first + second;
            first = second;
            second = fib;
            current++;
        }

        return fib;
    }

    private static int recursiveFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
