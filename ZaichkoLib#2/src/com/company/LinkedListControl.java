package com.company;

public class LinkedListControl<T> {
    private Node<T> first = null;
    private Node<T> last = null;

    public void Add(T object)
    {
        if(first == null)
        {
            first = new Node(object);
            last = first;
        }

        else
        {
            Node<T> newElement;
            newElement = new Node(object);
            last.Next = newElement;
            newElement.Previous = last;
            last = newElement;
        }
    }

    public void Show()
    {
        Node<T> current = first;
        while(current != null) {
            System.out.print(current.Value);
            current = current.Next;
        }

    }

    public T Remove()
    {
        T Value = first.Value;
        if(first != last)
        {
            first.Next.Previous = null;
            first = first.Next;
        }

        else
            first = last = null;
        return Value;
    }

    public int Size()
    {
        int size = 0;
        Node<T> current = first;
        while(current != null) {
            current = current.Next;
            size++;
        }
        return size;
    }

    public boolean Contains (T object)
    {
        Node<T> current = first;
        while(current != null) {
            if (current.Value.equals(object)) {
                return true;
            }
            current = current.Next;
        }

        return false;
    }

    private class Node<T>
    {
        T Value;
        Node<T> Previous;
        Node<T> Next;

        public Node(T value)
        {
            Value = value;
        }
    }
}
