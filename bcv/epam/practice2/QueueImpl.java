package com.bcv.epam.practice2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl implements Queue {
    private int size;
    private QueueElement head;
    private QueueElement tail;

    static class QueueElement {
        private QueueElement next;
        private QueueElement prev;
        private Object obj;

        QueueElement(Object variable) {
            this.obj = variable;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        QueueElement temp = head;
        StringBuilder result = new StringBuilder("[");
        while (temp.next != null) {
            result.append(temp.obj).append(", ");
            temp = temp.next;
        }
        return result.toString() + temp.obj + "]";
    }

    @Override
    public void enqueue(Object element) {
        QueueElement temp = new QueueElement(element);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else if (size == 1) {
            temp.prev = tail;
            tail = temp;
            head.next = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        this.size++;


    }


    @Override
    public Object dequeue() {
        if (size == 0) {
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
        private QueueElement next;
        private QueueElement last;

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

            QueueElement queueNext = last.next;
            QueueElement queuePrev = last.prev;

            if (queuePrev == null) {
                head = queueNext;
            } else {
                queuePrev.next = queueNext;
                last.prev = null;
            }
            if (queueNext == null) {
                tail = queuePrev;
            } else {
                queueNext.prev = queuePrev;
                last.next = null;
            }
            last.obj = null;
            size--;

            last = null;

        }
    }
}
