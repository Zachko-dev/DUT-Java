package com.company;

import java.util.Objects;

public class QueueRealization<T> {
    private T[] queue;
    private int maxSize;
    private int rear;

    public QueueRealization (int maxSize) {
        this.maxSize = maxSize;
        queue = (T[])new Object[maxSize];
        rear = -1;
    }

    public void insert(T elem) {
        queue[++rear] = elem;
    }

    public T remove() {
        T element = queue[0];
        for (int i = 0; i < queue.length - 1; i++){
            queue[i] = queue[i + 1];
        }
        queue[rear--] = null;

        return element;
    }

    public T getFront() throws Exception{
        if(rear == -1) {
            throw new Exception("Queue is empty");
        }

        return queue[0];
    }

    public T getRear() throws Exception {
        if(rear == -1) {
            throw new Exception("Queue is empty");
        }

        return queue[rear];
    }

    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public boolean isEmpty() {
        return (rear == - 1);
    }

    public int getSize() {
        return rear + 1;
    }
}
