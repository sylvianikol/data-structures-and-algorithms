package com.syn;

public class Main {
    // --- Directions
    // Write a program that accepts an integer N and returns a NxN spiral matrix.
    // --- Examples
    //   matrix(2)
    //     [[1, 2],
    //     [4, 3]]
    //   matrix(3)
    //     [[1, 2, 3],
    //     [8, 9, 4],
    //     [7, 6, 5]]
    //  matrix(4)
    //     [[1,  2,  3, 4],
    //     [12, 13, 14, 5],
    //     [11, 16, 15, 6],
    //     [10,  9,  8, 7]]
    public static void main(String[] args) {

        int n = 3;
	    int[][] matrix = new int[n][n];

	    spiralMatrix(matrix, n);
	    print(matrix);
    }

    private static void spiralMatrix(int[][] matrix, int n) {
        int counter = 1;

        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        while (counter <= n * n) {

            System.out.println();
            // TOPLEFT TO TOPRIGHT
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = counter++;
            }

            topRow++;

            // TOPRIGHT TO BOTTOMRIGHT
            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = counter++;
            }

            rightCol--;

            // BOTTOMRIGHT TO BOTTOMLEFT
            for (int col = rightCol; col >= leftCol; col--) {
                matrix[bottomRow][col] = counter++;
            }

            bottomRow--;

            // BOTTOMlEFT TO TOPLEFT
            for (int row = bottomRow; row >= topRow; row--) {
                matrix[row][leftCol] = counter++;
            }

            leftCol++;
        }

    }

    private static void print(int[][] matrix) {

        for (int[] row : matrix) {
            for (int n : row) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
