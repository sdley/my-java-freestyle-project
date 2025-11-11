package oop;

public class Computer {

    String model;
    String color;

    // Constructor
    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void turnOn() {
        System.out.println("The " + color + " " + model + " computer is now ON.");
    }
}
