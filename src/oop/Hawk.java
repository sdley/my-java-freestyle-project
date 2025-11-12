package oop;

public class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting!");
        System.out.println("\tIt is soaring high in the sky...");
    }
}
