package oop;

public class InheritanceMain {

    // Inheritance: A mechanism where a new class (subclass/child class) inherits properties and behaviors (fields and methods) from an existing class (superclass/parent class).
    //              Promotes code reusability and establishes a hierarchical relationship between classes.

    void main(){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        cat.eat();

        dog.bark();
        cat.meow();

        plant.photosynthesize();

        System.out.println("Dog lives: " + dog.lives);
        System.out.println("Cat lives: " + cat.lives);
    }
}
