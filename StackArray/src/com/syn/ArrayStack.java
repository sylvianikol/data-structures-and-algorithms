package com.syn;

import org.w3c.dom.Node;

import java.util.EmptyStackException;

public class ArrayStack {

    private Integer[] data;
    private int top;

    public ArrayStack(int capacity) {
        this.data = new Integer[capacity];
    }

    public void push(int value) {
        if (top == data.length) {
           resize();
        }
        data[top] = value;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = data[--top];
        data[top] = null;
        return value;
    }

    private void resize() {
        Integer[] newArray = new Integer[2 * data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        data = newArray;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
