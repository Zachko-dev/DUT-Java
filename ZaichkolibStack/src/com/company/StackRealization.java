package com.company;

public class StackRealization<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public StackRealization(int max){
        this.maxSize = max;
        stackArray = (T[])new Object[maxSize];
        top = -1;
    }

    public void push(T element){
        stackArray[++top] = element;
    }

    public T pop(){
        T result = stackArray[top];
        stackArray[top--] = null;
        return result;
    }

    public T peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}

