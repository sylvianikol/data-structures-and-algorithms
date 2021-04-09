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

    public void addBefore(Node newNode, Node existingNode) {
        Node current = get(existingNode);

        if (size == 1) {
            addToFront(existingNode.getData());
            return;
        }

        if (current != null) {
            newNode.setNext(current);
            newNode.setPrev(current.getPrev());
            if (current.getPrev() != null) {
                current.getPrev().setNext(newNode);
            }

            current.setPrev(newNode);
            size++;
        }
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
        node.setNext(null);

        return node;
    }

    public Node removeLast() {
        if (isEmpty()) {
            return null;
        }

        Node node = tail;

        if (tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();
        size--;
        node.setPrev(null);

        return node;
    }

    public Node get(Node node) {
        Node current = head;
        while (current != null) {
            if (current.getData() == node.getData()) {
                return current;
            }
            current = current.getNext();
        }

        return null;
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
