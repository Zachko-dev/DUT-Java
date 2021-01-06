package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ArrayListControl<T> {
    T[] arrayList;


    public ArrayListControl(int capacity)
    {
        arrayList = (T[]) new Object[capacity];
    }

    public ArrayListControl()
    {
        this(0);
    }

    public int IndexOf(T object)
    {
        for(int i = 0; i < arrayList.length; i++)
        {
            if (arrayList[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public void Add(T element)
    {
        T[] newArrayList = (T[])new Object[arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++)
        {
            newArrayList[i] = arrayList[i];
        }
        newArrayList[newArrayList.length - 1] = element;
        arrayList = newArrayList;
    }


    public int Size()
    {
        return arrayList.length;
    }

    public void Remove(int index) throws Exception
    {
        if(index < 0 || index > arrayList.length - 1)
        {
            throw new Exception("Index out of bounce");
        }
        T[] newArrayList = (T[])new Object[arrayList.length - 1];

        for (int i = 0; i < index; i++)
        {
            newArrayList[i] = arrayList[i];
        }

        for (int i = index; i < newArrayList.length; i++)
        {
            newArrayList[i] = arrayList[i + 1];
        }
        arrayList = newArrayList;
    }

    public void Remove(T object) throws Exception
    {
        int index = IndexOf(object);

        if(index == -1)
        {
            throw new Exception("Object is not exist");
        }

        T[] newArrayList = (T[])new Object[arrayList.length - 1];

        for (int i = 0; i < index; i++)
        {
            newArrayList[i] = arrayList[i];
        }

        for (int i = index; i < newArrayList.length; i++)
        {
            newArrayList[i] = arrayList[i + 1];
        }
        arrayList = newArrayList;
    }

    public boolean Contains(T object)
    {
        return IndexOf(object) >= 0;
    }

    public void Show()
    {
        for (int i = 0; i < arrayList.length; i++)
        {
            System.out.print(arrayList[i] + " ");
        }
    }
}