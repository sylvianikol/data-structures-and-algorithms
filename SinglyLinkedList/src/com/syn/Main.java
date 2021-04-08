package com.syn;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);

        list.print();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println(list.removeFromFront());
        System.out.println(list.getHead());
    }
}
