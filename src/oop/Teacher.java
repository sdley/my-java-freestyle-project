package oop;

public class Teacher extends Person {

    char grade; // A, B, C, D, F
    String subject;

    Teacher(String firstName, String lastName, char grade, String subject) {
        super(firstName, lastName); // Call the constructor of the parent class (Person)
        this.grade = grade;
        this.subject = subject;
    }

    Teacher(String firstName, String lastName, String subject) {
        this(firstName, lastName, 'A', subject); // Default grade to 'A'

    }

    Teacher(String firstName, String lastName, char grade) {
        this(firstName, lastName, grade, "Unknown"); // Default subject to "Unknown"
    }

    void introduce() {
        super.introduce(); // Call the introduce method of the parent class (Person)
        System.out.println("I teach " + subject + " and my grade is " + grade + ".");
    }
}
