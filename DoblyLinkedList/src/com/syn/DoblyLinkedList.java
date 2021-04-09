package com.syn;

public class DoblyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addToFront(int data) {
        Node node = new Node(data);
        node.setNext(head);

        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrev(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(int data) {
        Node node = new Node(data);
        node.setPrev(tail);

        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    public Node removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node node = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        return node;
    }

    public Node removeLast() {
        if (isEmpty()) {
            return null;
        }

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
