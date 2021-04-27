package com.syn;

public class ThreadTwo extends Thread {

    private final Object LockOne;
    private final Object LockTwo;

    public ThreadTwo(Object lockOne, Object lockTwo) {
        this.LockOne = lockOne;
        this.LockTwo = lockTwo;
    }

    @Override
    public void run() {
        synchronized (LockTwo) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (LockOne) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }
}
