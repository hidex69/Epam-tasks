package by.epamtc.task1.util;

import java.util.NoSuchElementException;

public class Array {
    private int capacity = 16;
    private int[] data  = new int[capacity];
    private int pointer = 0;

    public Array(int[] data) {
        if (data.length > this.capacity) {
            resize();
            new Array(data);
        }
        this.data = data;
    }

    public Array() {
    }

    public int[] getData() {
        return data;
    }

    public void add(int element) {
        if (pointer == capacity) {
            this.resize();
            data[pointer++] = element;
        } else {
            data[pointer++] = element;
        }
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(data, 0, newArray, 0, data.length);
        data = newArray;
    }

    public int size() {
        return pointer;
    }

    public int get(int index) throws NoSuchElementException {
        if (index < 0 || index >= this.pointer) {
            throw new NoSuchElementException();
        }

        return data[index];
    }

    @Override
    public String toString() {
        if (pointer == 0) {
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < pointer - 1; i++) {
            result += data[i] + ", ";
        }
        result += data[pointer - 1] + "]";
        return result;
    }
}



