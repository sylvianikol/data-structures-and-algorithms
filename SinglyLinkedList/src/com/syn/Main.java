package com.syn;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

//        list.addToFront(5);
//        list.addToFront(3);
        list.addToFront(1);

        System.out.println(list.insertSorted(5));

        list.print();
//        System.out.println(list.getSize());
//        System.out.println(list.isEmpty());
//
//        System.out.println(list.removeFromFront());
//        System.out.println(list.getHead());
    }
}
