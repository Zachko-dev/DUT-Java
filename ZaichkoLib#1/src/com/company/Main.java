package com.company;
import java.util.Random;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 3;
        int[][] Array = new int[rows][columns];
        ArrayControl arrayControl = new ArrayControl();


        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                Array[i][j] = (int) (Math.random() * 9);
            }
        }

        arrayControl.printArray(Array, rows, columns);
        System.out.println();
        arrayControl.fillArray(0,10,2);
    }
}
