package oop;

public class Car {
    // Class: A blueprint for creating objects that encapsulate data and behavior.
    // Object: An entity that holds data and behavior related to that data (methods).
    // An object is an instance of a class.

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 55000.00;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You started the car.");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the car.");
    }
}
