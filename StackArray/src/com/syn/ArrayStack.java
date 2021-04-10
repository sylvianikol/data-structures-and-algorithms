package com.syn;

import org.w3c.dom.Node;

import java.util.Arrays;
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

    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Integer value = data[--top];
        data[top] = null;
        return value;
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return data[top - 1];
    }

    private void resize() {
        Integer[] newArray = new Integer[2 * data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        data = newArray;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
