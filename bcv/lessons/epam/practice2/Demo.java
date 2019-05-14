package com.bcv.lessons.epam.practice2;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        /*
        Test array implementation
        */
        System.out.println("Start Array implementation");
        ArrayImpl array = new ArrayImpl();

        // Add the specified element to the end.
        array.add("A");
        array.add("B");
        array.add("C");

        // Sets the element at the specified position.
        array.set(1, "D");

        // Returns the element at the specified position.
        array.get(1);

        // Returns the index of the first occurrence of the specified element,
        // or -1 if this array does not contain the element.
        // (use 'equals' method to check an occurrence)
        array.indexOf("C");

        // Removes the element at the specified position.
        array.remove(1);

        // Returns the number of elements.
        array.size();

        // Returns a string representation of this container.
        System.out.println(array);

        // Removes all of the elements.
        array.clear();

        array.add("A");
        array.add("B");
        array.add("C");

        Iterator arrayIterator = array.iterator();
        arrayIterator.hasNext();
        arrayIterator.next();
        arrayIterator.remove();
        for (Object element : array) {
            System.out.print(element);
        }

       /*
        Test list implementation
        */
        System.out.println("Start List implementation");
        ListImpl list = new ListImpl();
        // Inserts the specified element at the beginning.
        list.addFirst("A");
        list.addFirst("B");

        // Appends the specified element to the end.
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");

        // Removes the first element.
        list.removeFirst();

        // Removes the last element.
        list.removeLast();

        // Returns the first element.
        list.getFirst();

        // Returns the last element.
        list.getLast();

        // Returns the first occurrence of the specified element.
        // Returns null if no such element.
        // (use 'equals' method to check an occurrence)
        list.search("B");

        // Removes the first occurrence of the specified element.
        // Returns true if this list contained the specified element.
        // (use 'equals' method to check an occurrence)
        list.remove("C");

        // Returns a string representation of this container.
        System.out.println(list);

        // Removes all of the elements.
        list.clear();

        // Returns the number of elements.
        list.size();


        /*
        Test Queue implementation
        */
        System.out.println("Start Queue implementation");
        QueueImpl queue = new QueueImpl();
        // Appends the specified element to the end.
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        // Removes the head.
        queue.dequeue();

        // Returns the head.
        queue.top();

        // Returns the number of elements.
        queue.size();

        // Returns a string representation of this container.
        System.out.println(queue);

        // Removes all of the elements.
        queue.clear();

        // Returns an iterator over elements.
        // Iterator must implements the remove method.
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        Iterator queueIterator = queue.iterator();
        queueIterator.hasNext();
        queueIterator.next();
        queueIterator.remove();
        for (Object element : queue) {
            System.out.print(element);
        }

        /*
        Test Stack implementation
        */
        System.out.println("Start Stack implementation");
        StackImpl stack = new StackImpl();

        // Pushes the specified element onto the top.
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Removes and returns the top element.
        stack.pop();

        // Returns the top element.
        stack.top();

        // Returns a string representation of this container.
        System.out.println(stack);

        // Removes all of the elements.
        stack.clear();

        // Returns the number of elements.
        stack.size();


        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("C");
        stack.push("C");
        Iterator stackIterator = stack.iterator();
        stackIterator.next();
        stackIterator.hasNext();

        stackIterator.remove();
        for (Object element : stack) {
            System.out.print(element);
        }


    }
}