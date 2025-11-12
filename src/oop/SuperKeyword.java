package oop;

public class SuperKeyword {

    // super: used to refer to parent class members (variables, methods, constructors)
    //        Used in constructors to call parent class constructors
    //        Used to access parent class methods and variables when they are overridden in the child class

    void main() {

        Person person = new Person("John", "Doe");
        Teacher teacher = new Teacher("Jane", "Smith", 'B', "Mathematics");
        Employee employee = new Employee("Alice", "Johnson", 60000);

        person.introduce();
        System.out.println();
        teacher.introduce();
        System.out.println();
        employee.introduce();
    }
}
