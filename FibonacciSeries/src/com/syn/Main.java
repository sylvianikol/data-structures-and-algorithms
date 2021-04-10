package com.syn;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, Integer> existingNumbers = new HashMap<>();

    public static void main(String[] args) {

        // Write a simple Java program which will print Fibonacci series,
        // e.g. 1 1 2 3 5 8 13 ... . up to a given number.
        // Prepare for cross questions like using iteration over recursion
        // and how to optimize the solution using caching and memoization.
        int n = 7;

        for (int i = 1; i <= n; i++) {
            System.out.println(memoizedFibonacci(i) + " ");
        }
    }

    // iterative solution
    public static int iterativeFibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int fn = 0;

        for (int i = 3; i <= n; i++) {

            fn = first + second;
            first = second;
            second = fn;
        }

        return fn;
    }

    // recursive solution
    public static int recursiveFibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // memoized solution
    public static int memoizedFibonacci(int n) {

        if (existingNumbers.containsKey(n)) {
            return existingNumbers.get(n);
        }

        int value = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        existingNumbers.put(n, value);
        return value;
    }
}
