package com.syn;

public class Main {

    public static void main(String[] args) {

        DoblyLinkedList list = new DoblyLinkedList();

//        list.addToFront(3);
//        list.addToFront(2);
//        list.addToFront(1);

        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);

        System.out.println(list.addBefore(new Node(9), new Node(2)));

//        list.print();
//        list.removeFirst();
//        list.removeLast();
        list.print();

//        list.reversePrint();
    }
}
