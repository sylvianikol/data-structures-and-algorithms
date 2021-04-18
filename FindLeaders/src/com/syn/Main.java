package com.syn;

public class Main {

    public static void main(String[] args) {

        int[] array = {14, 12, 70, 15, 99, 65, 21, 90};
        findLeaders(array);
    }

    private static void findLeaders(int[] array) {
        int leader = array[array.length - 1];

        System.out.println(leader + " ");

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > leader) {
                leader = array[i];
                System.out.println(leader + " ");
            }
        }
    }
}
