package com.syn;

public class Main {

    // We have bunnies standing in a line, numbered 1, 2, ...
    // The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n
    // (without loops or multiplication).

    //bunnyEars2(0) → 0
    //bunnyEars2(1) → 2
    //bunnyEars2(2) → 5

    public static void main(String[] args) {

        System.out.println(bunnyEars(2));
    }

    private static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        int ears = bunnies % 2 == 0 ? 3 : 2;

        return ears + bunnyEars(bunnies - 1);
    }
}
