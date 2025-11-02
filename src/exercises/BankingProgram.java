package exercises;

import java.util.Scanner;

public class BankingProgram {

    Scanner scanner = new Scanner(System.in);


    void main() {

        // Java Banking Program for beginners

        // Variables
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        System.out.println("***************      ***************");
        System.out.println("** Welcome to the Java Bank! **");
        System.out.println("***************      ***************");

        while (isRunning) {
            // Menu
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");

            System.out.print("Please enter your choice (1-4): ");
            choice = scanner.nextInt();

            // Choices
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    System.out.println("Thank you for banking with us. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // showBalance()
    void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f%n%n", balance);
    }

    // depositFunds()
    double deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            System.out.printf("Successfully deposited $%.2f%n%n", amount);
            return amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.\n");
            return 0.0;
        }
    }

    // withdrawFunds()
    double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            System.out.printf("Successfully withdrew $%.2f%n%n", amount);
            return amount;
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.\n");
            return 0.0;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.\n");
            return 0.0;
        }
    }
}
