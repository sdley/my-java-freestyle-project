package oop;

public class User {

    // Overloaded constructors: Multiple constructors with different parameter lists.
    // This allows creating User objects in different ways.
    // Enable objects to be initialized in various ways.
    // Useful for providing flexibility in object creation.

    String username;
    String email;
    String name;
    int age;

    // Constructor 1: No parameters
    public User() {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    // Constructor 2: Two parameters
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Constructor 3: Three parameters
    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    User(String username, String email, String name) {
        this.username = username;
        this.email = email;
        this.name = name;
    }

    //  Constructor 4: Four parameters
    public User(String username, String email, String name, int age) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.age = age;
        }


}
