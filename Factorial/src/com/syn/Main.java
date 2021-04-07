package com.syn;

public class Main {

    public static void main(String[] args) {
	    // Find the factorial of a number
        // number * (number - 1)
        // value of factorial zero is 1 - base case in the recursive solution

        System.out.println(iterativeFactorial(5));
    }

    public static int recursiveFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    public static int iterativeFactorial(int n) {

        int fn = 1;

        while (n > 0) {
            fn = fn * n;
            --n;
        }

        return fn;
    }
}
