package oop;

public class MethodOverriding {

    // Method Overriding: A subclass provides a specific implementation of a method that is already defined in its superclass.
    // It allows a subclass to modify the behavior of an inherited method.
    // Allows code reusability with specific implementations for different subclasses.
    // The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
    // This is a key feature of polymorphism in object-oriented programming.

    static class Animal {

        void move() {
            System.out.println("The " + this.getClass().getSimpleName() + " is moving... ");
        }


        void makeSound() {
            System.out.println("Animal makes a sound");
        }
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

    static class  Fish extends Animal {

        @Override
        void move() {
            System.out.println("The fish is swimming...");
        }

        @Override
        void makeSound() {
            System.out.println("Blub!");
        }
    }

    static void main() {
        Animal myDog = new Dog();
        myDog.move();
        myDog.makeSound(); // Output: Woof!

        Animal myCat = new Cat();
        myCat.move();
        myCat.makeSound(); // Output: Meow!

        Animal myFish = new Fish();
        myFish.move(); // Output: The fish is swimming...
        myFish.makeSound(); // Output: Blub!
    }
}
