package oop;

public class Engine {

    String type;
    int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void start() {
        System.out.println("Engine started: " + type + " with " + horsepower + " HP");
    }
}
