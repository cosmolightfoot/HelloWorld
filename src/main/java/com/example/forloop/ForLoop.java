package com.example.forloop;

public class ForLoop {
    public static void main(String[] args) {
        String[] carManufacturers = {
            "honda",
            "ford",
            "maserati",
            "audi",
            "BMW"
        };
        for (String item: carManufacturers) {
            System.out.println(item);
        }
    }
}
