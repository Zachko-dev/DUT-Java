package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StringCheck {
    public String getLongestWord(String str) {

        char[] strArr = str.toCharArray();
        int largest = 0, count = 0;
        String largestStr = "";
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i] != ' ') {
                sb.append(strArr[i]);
                count++;
            }

            if (strArr[i] == ' ' || i == strArr.length - 1) {
                if (count > largest) {
                    largest = count;
                    largestStr = sb.toString();
                }
                count = 0;
                sb = new StringBuilder();
            }
        }

        return largestStr;

    }

    public int findBiggestWord2(String string)
    {
        String[] Words = string.split("\\s+");
        System.out.print(Arrays.stream(Words).max(Comparator.comparingInt(String :: length)));
        return Arrays.stream(Words).max(Comparator.comparingInt(String :: length)).get().length();
    }
}