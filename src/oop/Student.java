package oop;

public class Student {

    // Constructor: A special method to initialize objects of a class.
    // It has the same name as the class and no return type.
    //  You can pass arguments to the constructor to set initial values for object attributes.

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        /*
        * this keyword: refers to the current object instance.
        * It is used to distinguish between instance variables (attributes) and parameters when they have the same name.
        * Think of it as:
        *   - student1.name for the object student1.
        *   - and student2.name for the object student2.
        * */
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void enroll(){
        isEnrolled = true;
    }

    void unenroll(){
        isEnrolled = false;
    }

    boolean checkEnrollmentStatus(){
        return isEnrolled;
    }

    void displayInfo(){
        System.out.printf("Name: %s, Age: %d, GPA: %.2f, Enrolled: %b\n", name, age, gpa, isEnrolled);
    }

    void study(){
        System.out.println(name + " is studying.");
    }
}
