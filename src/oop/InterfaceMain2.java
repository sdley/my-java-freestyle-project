package oop;

public class InterfaceMain2 {

    // Interface: A reference type in Java, similar to a class, that can contain only constants, method signatures,
    //                                                           default methods, static methods, and nested types.
    // Interfaces cannot contain instance fields or constructors.
    // They are used to achieve abstraction and multiple inheritance in Java.
    // A class can implement **multiple interfaces**, allowing for more flexible code design.

    static void main() {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee(); // Output: The rabbit is fleeing!
        hawk.hunt();   // Output: The hawk is hunting!

        System.out.println();
        fish.flee();   // Output: The fish is fleeing!
        fish.hunt();   // Output: The fish is hunting!
    }

}
