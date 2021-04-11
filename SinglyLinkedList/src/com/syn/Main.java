package com.syn;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

//        list.addToFront(5);
//        list.addToFront(4);
//        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);

//        list.insertSorted(5);
//        list.insertSorted(1);
//        list.insertSorted(0);
//        list.insertSorted(52);
//        list.insertSorted(3);

//        list.print();
        System.out.println(list.getMiddle());
//        System.out.println(list.getSize());
//        System.out.println(list.isEmpty());
//
//        System.out.println(list.removeFromFront());
//        System.out.println(list.getHead());
    }
}
