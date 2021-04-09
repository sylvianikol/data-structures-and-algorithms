package com.syn;

public class Main {

    public static void main(String[] args) {

        DoblyLinkedList list = new DoblyLinkedList();

        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);

        list.print();
        list.reversePrint();
    }
}
