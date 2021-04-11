package com.syn;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(11);

        queue.print();
        System.out.println(queue.size());
        System.out.println("-".repeat(10));

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        queue.print();
        System.out.println(queue.size());
    }
}
