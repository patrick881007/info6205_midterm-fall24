package org.example;

import java.lang.classfile.components.ClassPrinter.Node;

public class MyCircularQueue {

    int num;
    Node head;

    static class Node{
        int value;
        Node front;
        Node rear;

        Node(int value){
            this.value = value;
            this.front = null;
            this.rear = null;
        }
    }
    public MyCircularQueue(int k) {
        this.num = k;  
        this.head = null;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean enQueue(int value) {
        Node newNode = new Node(value);
        newNode.rear = head;
        head = newNode;
        
        throw new UnsupportedOperationException("Not implemented yet");        
    }

    public boolean deQueue() {

        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int Front() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int Rear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isFull() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
