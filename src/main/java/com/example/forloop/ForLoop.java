package com.example.forloop;

public class ForLoop {
    public static void printFullArray() {
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

    public static void printToNthEntry(int index) {
        String[] names = {
            "Alison",
            "Brenda",
            "Carly",
            "Donda",
            "Ellen",
            "Sally"
        };

        for (int i = 0; i < names.length; i++) {
            if (i == index) {
                break;
            }
            System.out.println(names[i]);
        }
    }

    public static void excludeSomeone(String personToExclude) {
        String[] people = {
            "Bob",
            "Jake",
            "Cody",
            "Cory",
            "Ralph"
        };

        for(String person: people) {
            if (person == personToExclude) {
                continue;
            }
            System.out.println(person);
        }
    }
}
