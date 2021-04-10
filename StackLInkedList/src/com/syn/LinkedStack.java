package com.syn;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Integer> data;

    public LinkedStack() {
        this.data = new LinkedList<>();
    }

    public void push(int value) {
        data.push(value);
    }

    public Integer peek() {
        if (data.isEmpty()) {
            throw new EmptyStackException();
        }
        return data.peek();
    }

}
