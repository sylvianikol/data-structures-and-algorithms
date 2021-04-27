package com.syn;

public class Main {

    public static Object LockOne = new Object();
    public static Object LockTwo = new Object();

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne(LockOne, LockTwo);
        ThreadTwo threadTwo = new ThreadTwo(LockOne, LockTwo);
        threadOne.start();
        threadTwo.start();
    }
}
