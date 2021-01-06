package com.company;

import java.awt.desktop.SystemSleepEvent;

public class Main {

    public static void main(String[] args) {
        StringCheck stringCheck = new StringCheck();
        System.out.println(stringCheck.getLongestWord("fifthdafd four asdsdsdsd"));
        System.out.print("\n");
        System.out.print(stringCheck.findBiggestWord2("fifthdafd four asdsdsdsd"));
    }
}
