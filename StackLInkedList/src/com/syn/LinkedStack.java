package com.syn;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Integer> data;

    public LinkedStack() {
        this.data = new LinkedList<>();
    }

    public void push(int value) {
        data.push(value);
    }

    public Integer pop() {
        return data.pop();
    }

    public Integer peek() {
        return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void print() {
        data.forEach(System.out::println);
    }
}
