package com.syn;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(1);
        stack.push(7);
        stack.push(4);
        stack.push(5);
        stack.push(2);

        stack.print();
        System.out.println("Popped: " + stack.pop());
        stack.print();

        System.out.println("Peeked: " + stack.peek());

    }
}
