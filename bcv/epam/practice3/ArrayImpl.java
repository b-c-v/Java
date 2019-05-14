package com.bcv.epam.practice3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayImpl {

    private static final int DEFAULT_CAPACITY = 20;
    private int size;
    private Object[] arr;

    public ArrayImpl() {
        this.size = 0;
        this.arr = new Object[DEFAULT_CAPACITY];
    }

    private void resize() {
        Object[] newArr = new Object[(arr.length * 2 + 1)];

        for (int i = 0; i < arr.length; ++i) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(arr[i]);
            if (i == size - 1) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }

    public void add(Object element) {
        if (arr.length <= size) {
            resize();
            arr[size++] = element;
        } else {
            arr[size++] = element;
        }

    }

    public void set(int index, Object element) {
        arr[index] = element;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int indexOf(Object element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        System.arraycopy(arr, index + 1, arr, index, size - 1);
        size = size - 1;
    }


    public void clear() {
        arr = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }


    class IteratorImpl implements Iterator<Object> {
        private int iteratorPosition;
        private int lastReturned = -1;

        @Override
        public boolean hasNext() {
            return iteratorPosition != size;

        }

        @Override
        public Object next() {
            int tmp = iteratorPosition;
            if (tmp >= size) {
                throw new NoSuchElementException();
            }
            Object[] arrNext = ArrayImpl.this.arr;
            if (tmp >= arrNext.length) {
                throw new NoSuchElementException();
            }
            iteratorPosition = tmp + 1;
            lastReturned = tmp;
            return arrNext[lastReturned];
        }

        @Override
        public void remove() {
            if (lastReturned < 0) {
                throw new IllegalStateException();
            }
            ArrayImpl.this.remove(lastReturned);
            iteratorPosition = lastReturned;
            lastReturned = -1;
        }
    }
}
