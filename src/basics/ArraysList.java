package basics;

import java.util.Arrays;

public class ArraysList {

    // Array: A collection of elements of the same data type stored in contiguous memory locations
    // Arrays have a fixed size and can be of primitive or reference data types
    // Arrays are zero-indexed, meaning the first element is at index 0
    // Think of it as a variable that can hold multiple values

    void main() {

        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element in the array
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Looping through the array
        System.out.println("All elements in the array:");
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        for (int number : numbers) { // Enhanced for loop
            System.out.print(number + " ");

            // Checking the last element to print a new line after the loop
            if (number == numbers[numbers.length - 1]) {
                System.out.printf("%n%n");
            }
        }

        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Orange", "Coconut", "Banana", "Cherry"};

        fruits[0] = "Pineapple";
        // int len = fruits.length;
        Arrays.sort(fruits); // Sorting the array in alphabetical order
        // Arrays.fill(fruits, "Apple"); // Filling the array with the same value

        // Accessing elements in the string array
        System.out.println("First fruit: " + fruits[0]);

        // Looping through the string array
        System.out.print("All fruits: ");
        for (String fruit : fruits) { // Enhanced for loop
            System.out.print(fruit + " ");
        }
    }
}
