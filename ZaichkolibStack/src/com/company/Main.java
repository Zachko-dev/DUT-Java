package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List <String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        toUpperCase toUpperCase = new toUpperCase();

        myList.stream()
                .filter(s -> s.charAt(0) == 'c' )
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        System.out.print("Input size of array");
        ArrayStream arrayStream = new ArrayStream();
        Scanner scan = new Scanner(System.in);

        System.out.println(arrayStream.calcAverage(arrayStream.fillArrayRandom(scan.nextInt())));
        scan.close();

        System.out.println(toUpperCase.makeUpperCase("W", 'H', 'T'));

        StackRealization<Car> stackRealization = new StackRealization(3);
        QueueRealization<Car> queueRealization = new QueueRealization(2);
        Car car = new Car(100, "BMW");
        Car car2 = new Car(0, "Lanos");

        stackRealization.push(car);
        stackRealization.push(car2);
        System.out.println("Print is full");
        System.out.println(stackRealization.isFull());
        System.out.println("Print is empty");
        System.out.println(stackRealization.isEmpty());
        System.out.println("Print top object");
        System.out.println(stackRealization.peek());
        System.out.println("Delete and print top object");
        System.out.println(stackRealization.pop());

        queueRealization.insert(car);
        queueRealization.insert(car2);
        System.out.println("Print is full");
        System.out.println(queueRealization.isFull());
        System.out.println("Print is empty");
        System.out.println(queueRealization.isEmpty());
        System.out.println("Print top object");
        try{
            System.out.println(queueRealization.getFront());
        }
        catch (Exception E){
            System.out.println("Array is empty");
        }

        System.out.println("Print rear object");
        try{
            System.out.println(queueRealization.getRear());
        }
        catch (Exception E){
            System.out.println("Array is empty");
        }
        System.out.println("Delete and print first object in queue");
        System.out.println(queueRealization.remove());

    }
}
