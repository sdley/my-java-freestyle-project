package advanced;

import java.util.Scanner;

public class Enumerations {

    // Enumerations (enums) are a special data type that enables a variable to be a set of predefined constants.
    //              They are a specific kind of class that represents a group of constants (unchangeable variables, like final variables).
    // The variable must be equal to one of the values that have been predefined for it.
    // Commonly used to represent a fixed set of related constants, such as days of the week, states, directions, etc.



    void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week (e.g., SUNDAY, MONDAY, etc.): ");
        String input = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(input);

            System.out.println("Day: " + day);
            System.out.println("Day Number: " + day.getDayNumber());

            switch (day) {
                case SUNDAY, SATURDAY -> System.out.println("It's the weekend!");
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It's a weekday.");
                default -> System.out.println("Unknown day.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid entry.");
        }

        scanner.close();
    }
}
