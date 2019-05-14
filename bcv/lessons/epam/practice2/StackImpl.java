package com.bcv.lessons.epam.practice2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackImpl implements Stack {
    private int size;
    private StackElement head;
    private StackElement tail;

    static class StackElement {
        private StackElement next;
        private StackElement prev;
        private Object obj;

        StackElement(Object variable) {
            this.obj = variable;
            this.next = null;
            this.prev = null;
        }
    }


    @Override
    public String toString() {
        if (tail == null) {
            return "[]";
        }
        StackElement temp = tail;
        StringBuilder result = new StringBuilder("[");
        while (temp.prev != null) {
            result.append(temp.obj).append(", ");
            temp = temp.prev;
        }
        return result.toString() + temp.obj + "]";

    }

    @Override
    public void push(Object element) {
        StackElement temp = new StackElement(element);
        if (head == null) {
            head = temp;
            tail = temp;
        } else if (size == 1) {
            temp.next = head;
            head = temp;
            tail.prev = temp;
        } else {
            temp.next = head;
            temp.next.prev = temp;
            head = temp;
        }
        this.size++;
    }

    @Override
    public Object pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Object item = head.obj;
        head = head.next;
        if (size > 1) {
            head.prev = null;
        }
        size--;
        return item;
    }

    @Override
    public Object top() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        return head.obj;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    class IteratorImpl implements Iterator<Object> {
        private StackElement next;
        private StackElement last;

        IteratorImpl() {
            next = head;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            last = next;
            next = next.next;
            return last.obj;
        }

        @Override
        public void remove() {
            if (last == null) {
                throw new IllegalStateException();
            }

            StackElement stackNext = last.next;
            StackElement stackPrev = last.prev;

            if (stackPrev == null) {
                head = stackNext;
            } else {
                stackPrev.next = stackNext;
                last.prev = null;
            }
            if (stackNext == null) {
                tail = stackPrev;
            } else {
                stackNext.prev = stackPrev;
                last.next = null;
            }
            last.obj = null;
            size--;
            last = null;
        }
    }
}


