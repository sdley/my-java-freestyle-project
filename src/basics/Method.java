package basics;

public class Method {

    // Method: A block of code that performs a specific task and can be reused
    // Method Declaration Syntax:
    // accessModifier returnType methodName(parameterType parameterName) {
    //     // method body
    //     // optional return statement
    // }

    // Access Modifiers:
    // public: accessible from any other class
    // private: accessible only within the same class
    // protected: accessible within the same package and subclasses
    // default (no modifier): accessible only within the same package

    // Return Types:
    // void: method does not return any value
    // data type (int, double, String, etc.): method returns a value of the specified type

    // Parameters:
    // Used to pass data into a method
    // Multiple parameters are separated by commas

    // Method Call Syntax:
    // methodName(argument1, argument2);

    // Methods can be called from other methods, including the main method

    // Methods help in code reusability, organization, and modularity

    // Example of a void method
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Example Method
    public static int add(int a, int b) {
        return a + b;
    }

    static void main() {

        int a = 5;
        int b = 10;

        greet("Souleymane");

        int sum = add(a, b);
        System.out.printf("The sum of %d and %d is: %d%n ", a, b, sum);
    }
}
