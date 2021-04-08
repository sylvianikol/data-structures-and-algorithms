package com.syn;

public class Main {
    // --- Directions
    // Write a function that accepts a positive number N.
    // The function should console log a step shape with N levels using the # character.
    // Make sure the step has spaces on the right hand side!
    // --- Examples
    //   steps(2)
    //       '# '
    //       '##'
    //   steps(3)
    //       '#  '
    //       '## '
    //       '###'
    //   steps(4)
    //       '#   '
    //       '##  '
    //       '### '
    //       '####'
    public static void main(String[] args) {

        recursiveSteps(4, 1);
    }

    private static void recursiveSteps(int n, int repeat) {

        if (n == 0) {
            return;
        }

        for (int i = 0; i < repeat; i++) {
            System.out.print("#");
        }

        System.out.print(" ");
        System.out.println();

        recursiveSteps(n - 1, repeat + 1);

    }

    private static void iterativeSteps(int n) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col <= row) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void steps(int n) {

        for (int i = 1; i <= n; i++) {

            String step = i == n
                    ? "#".repeat(i)
                    : "#".repeat(i) + " ";

            System.out.println(step);
        }
    }
}
