package com.syn;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Integer[] data;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.data = new Integer[capacity];
    }

    public void add(int value) {
        if (back == data.length) {
            resize();
        }

        this.data[back] = value;
        back++;
    }

    public int remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Integer value = data[front];
        data[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return value;
    }

    private void resize() {
        Integer[] newData = new Integer[2 * data.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public int size() {
        return back - front;
    }
}
