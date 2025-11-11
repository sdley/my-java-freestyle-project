package oop;

public class StudentMain {

    void main() {
        // Create Student objects using the constructor
        Student student1 = new Student("Alice", 20, 3.8);
        Student student2 = new Student("Bob", 22, 3.5);

        // Display student information
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", GPA: " + student1.gpa);
        student1.study();

        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", GPA: " + student2.gpa);
    }
}
