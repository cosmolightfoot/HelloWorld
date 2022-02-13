package com.example.printarray;

public class PrintArray {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "apple";
        stringArray[1] = "banana";
        stringArray[2] = "cherry";

        System.out.println("At index 0 the value is " + stringArray[0]);
        System.out.println("At index 1 the value is " + stringArray[1]);
        System.out.println("At index 0 the value is " + stringArray[2]);
    }
}
