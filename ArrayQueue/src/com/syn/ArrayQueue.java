package com.syn;

public class ArrayQueue {

    private int[] data;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.data = new int[capacity];
    }

    public void add(int value) {
        if (back == data.length) {
            resize();
        }

        this.data[back] = value;
        back++;
    }

    private void resize() {
        int[] newData = new int[2 * data.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
