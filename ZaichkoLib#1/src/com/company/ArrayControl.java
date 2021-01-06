package com.company;

public class ArrayControl {
    public void printArray(int[][] array, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int result = Math.min(row, column);
        System.out.println();
        for (int i = 0; i < result; i++) {
            if (array[i][column - i - 1] % 2 == 0 && array[i][column - i - 1] != 0) {
                System.out.print(array[i][column - i - 1] + " [" + i + "] [" + (column - i - 1) + "]");
                System.out.println();
            }
        }
    }

    public int[] fillArray(int begin, int end, int step)
    {
        int[] Array = new int[(1+(end-begin)/step) + 1];
        int i = 1;
        Array[0] = begin;
        System.out.print(Array[0] + " ");

        do {
            Array[i] = Array[i - 1] + step;
            if(end - Array[i] >= 0)
                System.out.print(Array[i] + " ");
        } while(end - Array[i++] >= 0);
        return  Array;
    }
}
