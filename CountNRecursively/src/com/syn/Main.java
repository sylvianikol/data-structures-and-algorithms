package com.syn;

public class Main {
    // Given a non-negative int N, compute recursively (no loops) the count of the occurrences of K as a digit,
    // except that an K with another K immediately to its left counts double, so 8818 yields 4.
    // count8(8) → 1
    // count8(818) → 2
    // count8(8818) → 4
    public static void main(String[] args) {

        System.out.println(countN(8818, 8));
    }

    private static int countN(int n, int k) {
        if (n == 0) {
            return 0;
        }

        int occur = 0;

        if (n % 10 == k) {
            occur++;
            if ((n / 10) % 10 == k) {
                occur++;
            }
        }

        return occur + countN(n / 10, k);
    }
}
