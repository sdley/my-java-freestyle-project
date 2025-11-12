package oop;

public class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("The fish is fleeing!");
        System.out.println("\tIt is swimming away...");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting!");
        System.out.println("\tIt is chasing smaller fish...");
    }
}
