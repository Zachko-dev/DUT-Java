package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;

public class ArrayStream {
    public int[] fillArrayRandom(int size) {
        int[] Array = new int[size];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < size; i++)
        {
            Array[i] = (int)(Math.random()*9);
        }
        return Array;
    }

    public OptionalDouble calcAverage(int[] array){
        return Arrays.stream(array)
                .filter(s -> s % 2 == 0)
                .average();
    }
}