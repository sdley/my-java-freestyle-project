package oop;

public class Getters_n_Setters {

    // Getters and Setters: Methods that provide controlled access to an object's properties.
    // Getters retrieve property values, while Setters modify them.

    static void main() {
        PersonBis person = new PersonBis("Amadou", 20, "Senegal" );

        // Using Getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        // Using Setters
        person.setName("Amadou Sadio");
        person.setAge(22);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }

}
