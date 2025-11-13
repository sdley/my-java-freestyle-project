package oop;

import java.util.Scanner;

public class RuntimePolymorphism {

    // Runtime polymorphism: when the method that gets executed is decided
    //                       at runtime based on the actual object type, not the reference type.

    static abstract class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow!");
        }
    }

    static void main() {

        // Exemple 1
        Vehicle myVehicle1 = new Bike(); // Reference type is Vehicle, object type is Bike
        Vehicle myVehicle2 = new Boat(); // Reference type is Vehicle, object type is Boat

        myVehicle1.go(); // Outputs: The bike is riding.
        myVehicle2.go(); // Outputs: The boat is sailing.

        // Exemple 2
        Animal myAnimal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWould you like a Dog or a Cat? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Dog")) {
            myAnimal = new Dog();
            myAnimal.makeSound();
        } else if (choice.equalsIgnoreCase("Cat")) {
            myAnimal = new Cat();
            myAnimal.makeSound();
        } else {
            System.out.println("Unknown animal type.");
        }
    }
}
