package com.syn;

public class Main {

    public static void main(String[] args) {
        // Check if given Integer is palindrome or not.
        // You can use divide by 10 to reduce the number and modulus 10 to get the last digit.
        // This trick is used to solve this problem.

        int n = 1001;
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int number) {

        if (number / 10 == 0) {
            return true;
        }

        int palindrome = number;
        int reversed = 0;

        while (palindrome > 0) {
            int last = palindrome % 10;
            reversed = reversed * 10 + last;
            palindrome /= 10;
        }

        return reversed == number;
    }
}
