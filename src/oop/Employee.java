package oop;

public class Employee extends Person {

    int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName); // Call the constructor of the parent class (Person)
        this.salary = salary;
    }

    void introduce() {
        super.introduce(); // Call the introduce method of the parent class (Person)
        System.out.println("My salary is $" + salary + ".");
    }

}
