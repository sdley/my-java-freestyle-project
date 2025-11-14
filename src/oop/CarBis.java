package oop;

public class CarBis {

    String model;
    int year;
    Engine engine; // Composition: Car "has-a" Engine

    public CarBis(String model, int year, String engineType, int horsepower) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType, horsepower); // Engine is created as part of Car
    }

    void start() {
        System.out.println("Car started: " + model + " (" + year + ")");
        engine.start(); // Delegating to Engine's start method
    }
}
