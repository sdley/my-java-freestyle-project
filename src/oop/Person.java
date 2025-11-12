package oop;

public class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void introduce() {
        System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
    }
}
