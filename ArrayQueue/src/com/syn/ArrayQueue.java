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
        if (size() == data.length - 1) {
            resize();
        }

        this.data[back] = value;
        if (back < data.length - 1) {
            back++;
        } else {
            back = 0;
        }

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
        } else if (front == data.length) {
            front = 0;
        }

        return value;
    }

    public int peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return data[front];
    }

    private void resize() {
        int numItems = size();
        Integer[] newData = new Integer[2 * data.length];

        System.arraycopy(data, front, newData, 0, data.length - front);
        System.arraycopy(data, 0, newData, data.length - front, back);

        data = newData;

        front = 0;
        back = numItems;
    }

    public int size() {
        if (front <= back) {
            return back - front;
        }
        return back - front + data.length;
    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
