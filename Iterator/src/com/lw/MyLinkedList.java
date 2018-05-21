package com.lw;

import java.util.LinkedList;

public class MyLinkedList implements Collection{
    Node head;
    Node tail;
    int size = 0;

    @Override
    public void add(Object o) {
        Node node = new Node(o,null);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.setNext(node);
        tail = node;
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator{
        private Node currentNode = head;
        private int nextIndex = 0;

        @Override
        public Object next() {
            Object data = currentNode.getData();
            currentNode = currentNode.getNext();
            nextIndex++;
            return data;
        }

        @Override
        public boolean hasNext() {
            return nextIndex != size;
        }
    }
}
