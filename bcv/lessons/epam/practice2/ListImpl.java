package com.bcv.lessons.epam.practice2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListImpl implements List {
    private int sizeNode;
    private Node headNode;
    private Node tailNode;


    private static class Node {
        private Object dataNode;
        private Node nextNode;
        private Node prevNode;

        public Node(Object element) {
            dataNode = element;
            nextNode = null;
            prevNode = null;
        }
    }

    private void delete(Node delete) {
        final Node next = delete.nextNode;
        final Node prev = delete.prevNode;

        if (prev == null) {
            headNode = next;
        } else {
            prev.nextNode = next;
            delete.prevNode = null;
        }

        if (next == null) {
            tailNode = prev;
        } else {
            next.prevNode = prev;
            delete.nextNode = null;
        }
        delete.dataNode = null;
        sizeNode--;
    }

    @Override
    public void addFirst(Object element) {
        Node nodeAddFirst = new Node(element);
        if (headNode == null) {
            headNode = nodeAddFirst;
            tailNode = nodeAddFirst;
        } else if (sizeNode == 1) {
            nodeAddFirst.nextNode = headNode;
            headNode = nodeAddFirst;
            tailNode.prevNode = nodeAddFirst;
        } else {
            nodeAddFirst.nextNode = headNode;
            nodeAddFirst.nextNode.prevNode = nodeAddFirst;
            headNode = nodeAddFirst;
        }
        sizeNode++;
    }


    @Override
    public void addLast(Object element) {
        Node nodeAddLast = new Node(element);

        if (tailNode == null) {
            headNode = nodeAddLast;
            tailNode = nodeAddLast;
        } else if (sizeNode == 1) {
            nodeAddLast.prevNode = tailNode;
            tailNode = nodeAddLast;
            headNode.nextNode = nodeAddLast;
        } else {
            nodeAddLast.prevNode = tailNode;
            tailNode.nextNode = nodeAddLast;
            tailNode = nodeAddLast;
        }
        sizeNode++;
    }

    @Override
    public Object removeFirst() {
        if (headNode == null) {
            throw new NoSuchElementException();
        }

        Object item = headNode.dataNode;
        headNode = headNode.nextNode;
        if (sizeNode > 1) {
            headNode.prevNode = null;
        }
        sizeNode--;
        return item;
    }

    @Override
    public Object removeLast() {
        if (tailNode == null) {
            throw new NoSuchElementException();
        }

        Object item = tailNode.dataNode;
        tailNode = tailNode.prevNode;
        if (sizeNode > 1) {
            tailNode.nextNode = null;
        }
        sizeNode--;

        return item;
    }

    @Override
    public Object getFirst() {
        if (headNode == null) {
            throw new NoSuchElementException();
        }

        return headNode.dataNode;
    }

    @Override
    public Object getLast() {
        if (tailNode == null) {
            throw new NoSuchElementException();
        }

        return tailNode.dataNode;

    }

    @Override
    public Object search(Object element) {
        if (element == null) {
            for (Node temp = headNode; temp != null; temp = temp.nextNode) {
                if (temp.dataNode == null) {
                    return null;
                }
            }
        } else {
            for (Node x = headNode; x != null; x = x.nextNode) {
                if (element.equals(x.dataNode)) {
                    return element;
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object element) {
        if (element == null) {
            for (Node x = headNode; x != null; x = x.nextNode) {
                if (x.dataNode == null) {
                    delete(x);
                    return true;
                }
            }
        } else {
            for (Node x = headNode; x != null; x = x.nextNode) {
                if (element.equals(x.dataNode)) {
                    delete(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        headNode = tailNode = null;
        sizeNode = 0;
    }

    @Override
    public int size() {
        return sizeNode;
    }

    @Override
    public String toString() {
        if (headNode == null) {
            return "[]";
        }
        Node temp = headNode;
        StringBuilder result = new StringBuilder("[");
        while (temp.nextNode != null) {
            result.append(temp.dataNode).append(", ");
            temp = temp.nextNode;
        }
        return result.toString() + temp.dataNode + "]";
    }


    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    class IteratorImpl implements Iterator<Object> {
        private Node nextIter;
        private Node lastReturned;
        private int nextIndex;

        IteratorImpl() {
            nextIter = headNode;
        }


        @Override
        public boolean hasNext() {
            return (nextIter != null);
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = nextIter;
            nextIter = nextIter.nextNode;
            return lastReturned.dataNode;
        }

        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }

            Node lastNext = lastReturned.nextNode;
            delete(lastReturned);
            if (nextIter == lastReturned) {
                nextIter = lastNext;
            } else {
                nextIndex--;
            }
            lastReturned = null;
        }
    }
}