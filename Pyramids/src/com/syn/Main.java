package com.syn;

public class Main {
    // --- Directions
    // Write a program that accepts a positive number N.
    // The program should console log a pyramid shape
    // with N levels using the # character.
    // Make sure the pyramid has spaces on both the left *and* right hand sides
    // --- Examples
    //   pyramid(1)
    //       '#'
    //   pyramid(2)
    //       ' # '
    //       '###'
    //   pyramid(3)
    //       '  #  '
    //       ' ### '
    //       '#####'
    public static void main(String[] args) {

        int rows = 4;
        int width = 1;
        int spaces = rows - 1;

//        recursivePyramid(rows, width, spaces);
        iterativePyramid(rows, width, spaces);
    }

    private static void iterativePyramid(int rows, int width, int spaces) {
        int cols = 2 * spaces + width;

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {
                if (col < spaces || col >= spaces + width) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println();
            --spaces;
            width += 2;
        }
    }

    private static void recursivePyramid(int rows, int width, int spaces) {

        if (rows == 0) {
            return;
        }

        printSpaces(spaces);
        printHashes(width);
        printSpaces(spaces);

        System.out.println();

        recursivePyramid(rows - 1, width + 2, spaces - 1);
    }

    private static void printSpaces(int spaces) {
        for (int i = spaces; i >= 0; i--) {
            System.out.print(" ");
        }
    }

    private static void printHashes(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
    }
}
