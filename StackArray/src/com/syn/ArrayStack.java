package com.syn;

import org.w3c.dom.Node;

import java.util.EmptyStackException;

public class ArrayStack {

    private int[] data;
    private int top;

    public ArrayStack(int capacity) {
        this.data = new int[capacity];
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
        return data[--top];
    }

    private void resize() {
        int[] newArray = new int[2 * data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        data = newArray;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
