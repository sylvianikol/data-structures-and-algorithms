package com.syn;

public class DoblyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addToFront(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            tail = node;
        } else if (size == 1) {
            node.setNext(head);
            tail.setPrev(node);
        } else {
            node.setNext(head);
            head.setPrev(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else if (size == 1) {
            node.setPrev(tail);
            head.setNext(node);
        } else {
            node.setPrev(tail);
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    public Node removeFirst() {
        Node node = head;

        if (size == 1) {
            tail = null;
            head = null;
        } else {
            head = head.getNext();
        }

        if (head != null) {
            head.setPrev(null);
        }

        size--;
        return node;
    }

    public Node removeLast() {
        Node node = tail;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
        }

        if (tail != null) {
            tail.setNext(null);
        }

        size--;
        return node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }

    public void reversePrint() {
        Node node = tail;
        while (node != null) {
            System.out.println(node);
            node = node.getPrev();
        }
    }
}
