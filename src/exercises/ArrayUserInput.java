package exercises;

import java.util.Scanner;

public class ArrayUserInput {

    void main() {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int numberOfFoods;

        do {
            System.out.print("How many foods do you want in your basket/cart? : ");
            numberOfFoods = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character
        } while (numberOfFoods < 0);

        foods = new String[numberOfFoods];

        for (int i = 0; i < numberOfFoods; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        if (foods.length > 0)
            System.out.println("\nYou have added the following foods to your basket/cart:");

        for (String food : foods) {
            System.out.println("- " + food);
        }

        scanner.close();
    }
}
