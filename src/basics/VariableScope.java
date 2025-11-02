package basics;

public class VariableScope {

    // Variable Scope: The context within which a variable is accessible
    // ------------------------------------------------------------------------
    // 1. Local Scope: Variables declared within a method or block are only accessible within that method or block.
    // 2. Instance Scope: Variables declared within a class but outside any method are accessible to all methods within that class.
    // 3. Static Scope: Variables declared as static are accessible to all instances of the class and can be accessed without creating an instance of the class.

    static int x = 3; // Class scope variable

    void doSomething() {
        int x = 2; // Local scope variable
        System.out.println("Local x: " + x); // Outputs 2
        System.out.println("Class scope x: " + VariableScope.x); // Outputs 3
    }

    void main() {

        int x = 1; // Local scope variable
        System.out.println("Local x in main: " + x); // Outputs 1

        doSomething();
    }
}
