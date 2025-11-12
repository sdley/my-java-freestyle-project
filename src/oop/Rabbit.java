package oop;

public class Rabbit implements Prey{

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing!");
        System.out.println("\tIt is running away...");
    }
}
