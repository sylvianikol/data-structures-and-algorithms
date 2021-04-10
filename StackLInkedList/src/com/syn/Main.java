package com.syn;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peeked: " + stack.peek());
        stack.print();
    }
}
