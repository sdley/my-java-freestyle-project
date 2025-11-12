package oop;

public class ToString {

    // toString() Method: A method inherited from the Object class that returns a string representation of an object.
    // It is often overridden in custom classes to provide meaningful information about the object's state.
    // It is used to provide meaningful details about the object.
    // Useful for debugging and logging purposes, as it allows developers to easily inspect object values.
    // By default, the toString() method returns a string that includes the class name and the object's hash code.
    // Overriding this method enhances readability and provides more context about the object.

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Car {
        String make;
        String model;
        int year;

        Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Car{make='" + make + "', model='" + model + "', year=" + year + "}";
        }
    }

    static void main() {
        Person person = new Person("Alice", 30);
        System.out.println(person.toString()); // Output: Person{name='Alice', age=30}
        System.out.println(person); // Implicitly calls toString(): Person{name='Alice', age=30}

        System.out.println();

        Car car = new Car("Toyota", "Camry", 2020);
        System.out.println(car); // Implicitly calls toString(): Car{make='Toyota', model='Camry', year=2020}
    }
}
