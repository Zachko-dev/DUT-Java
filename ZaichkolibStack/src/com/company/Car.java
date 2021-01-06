package com.company;

public class Car {
    int Cost;
    String Name;

    public Car(int cost, String name){
        Cost = cost;
        Name = name;
    }

    @Override
    public String toString(){
        return String.format("Cost: %s Name:%s", Cost, Name);
    }
}
