package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    // Exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions.
    // They are used to handle errors and other exceptional conditions in a controlled manner.
    //          (e.g., file not found, invalid input, division by zero).
    //          Surround code that might throw an exception with try-catch blocks to handle them gracefully.
    //         Use finally block to execute code that must run regardless of whether an exception occurred or not.

    // In Java, exceptions can be categorized into two main types: checked exceptions and unchecked exceptions.
    // Checked exceptions are checked at compile-time, while unchecked exceptions are checked at runtime.
    // Common exceptions include:
    // - IOException: occurs during input/output operations.
    // - NullPointerException: occurs when trying to access a method or property of a null object.
    // - ArrayIndexOutOfBoundsException: occurs when trying to access an array with an invalid index.
    // - ArithmeticException: occurs during arithmetic operations, such as division by zero.
    // - ClassNotFoundException: occurs when trying to load a class that cannot be found.

    void main() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to divide 100 by: ");
            int number = scanner.nextInt();

            int result = 100 / number;
            System.out.println("100 / " + number + " = " + result);

//            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            // Safety net for any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
