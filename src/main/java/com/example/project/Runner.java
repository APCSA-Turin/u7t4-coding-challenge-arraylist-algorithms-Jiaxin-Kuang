package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner{
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(1);
        intList.add(4);
        intList.add(4);
        intList.add(3);
        intList.add(1);
        int[] intArray = new int[6];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        System.out.println(Main.modes(intArray));
    }
}