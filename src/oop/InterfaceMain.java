package oop;

public class InterfaceMain {

    // Interface: A reference type in Java, similar to a class, that can contain only constants, method signatures,
    //                                                           default methods, static methods, and nested types.
    // Interfaces cannot contain instance fields or constructors.
    // They are used to achieve abstraction and multiple inheritance in Java.
    // A class can implement **multiple interfaces**, allowing for more flexible code design.

    interface Animal {
        void makeSound(); // abstract method
    }

    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    static void main() {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow
    }
}
