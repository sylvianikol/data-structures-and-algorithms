package com.syn;

public class ThreadOne extends Thread {

    private final Object LockOne;
    private final Object LockTwo;

    public ThreadOne(Object lockOne, Object lockTwo) {
        this.LockOne = lockOne;
        this.LockTwo = lockTwo;
    }

    @Override
    public void run() {

        synchronized (LockOne) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            System.out.println("Thread One: Waiting for lock 2...");

            synchronized (LockTwo) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}
