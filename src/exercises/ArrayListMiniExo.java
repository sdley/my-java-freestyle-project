package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMiniExo {

    void main() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();


        System.out.print("Enter the number of food items you want to add: ");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numOfFoods; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            String foodItem = scanner.nextLine();
            foods.add(foodItem);
        }

        System.out.println("You have entered the following food items:");
        for (String food : foods) {
            System.out.println("- " + food);
        }

    }
}
