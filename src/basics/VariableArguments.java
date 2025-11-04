package basics;

public class VariableArguments {

    // Variable Arguments (Varargs): A feature that allows a method to accept zero or more arguments of a specified type.
    //      It makes methods more flexible, no need for overloaded methods.
    //      Like, it provides flexibility in method calls by allowing you to pass a variable number of arguments without explicitly defining an array.
    //      When a method is defined with varargs, the compiler automatically creates an array to hold the arguments passed to the method.
    //      In this case, no need for method overloading to handle different numbers of parameters.
    //      Syntax: dataType... parameterName
    //      Java will pack the arguments into an array of the specified data type.
    //      ... (ellipsis) indicates that the method can accept a variable number of arguments.
    // Example:
    void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    void main() {
        printNumbers(1, 2, 3);          // Output: 1 2 3
        printNumbers(10, 20, 30, 40);   // Output: 10 20 30 40
        printNumbers();                  // Output: (no output)

        int sum1 = add(5, 10, 15);      // sum1 = 30
        int sum2 = add(1, 2, 3, 4, 5); // sum2 = 15
        int sum3 = add();                // sum3 = 0

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);

        double avg1 = average(10.5, 20.5, 30.0); // avg1 = 20.3333...
        double avg2 = average(5.0, 15.0);         // avg2 = 10.0
        double avg3 = average();                   // avg3 = 0.0

        System.out.printf("%nAverage1: %.2f%n", avg1);
        System.out.println("Average2: " + avg2);
        System.out.println("Average3: " + avg3);
    }
}
