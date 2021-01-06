package com.company;

import java.io.Serializable;

public class Game implements Serializable {
    private static final long serialversionUID = 129348938L;
    String Name;
    transient int Price;
    transient boolean Discounted;


    public Game(String name, int price, boolean discounted)
    {
        Name = name;
        Price = price;
        Discounted = discounted;
    }

    @Override
    public String toString() {
        return String.format("Name:" + Name + " Price:" + Price + " Discounted:" + Discounted + "\n");
    }
}
