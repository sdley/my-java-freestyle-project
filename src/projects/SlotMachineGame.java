package projects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {

    // Java Slot Machine Game

    void main() {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("**************************************");
        System.out.println("    Welcome to the Slot Machine!      ");
        System.out.println("    Symbols: ????????🔔");
        System.out.println("**************************************");

        while (balance > 0) {
            System.out.print("Current Balance: $" + balance + "\n");
            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            if (bet > balance) {
                System.out.println("Insufficient balance to place that bet.");
                continue;
            }
            else if(bet <= 0) {
                System.out.println("Bet must be greater than 0 to play.");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                balance += payout;
                System.out.println("Congratulations! You won $" + payout + "!");
            } else {
                System.out.println("Sorry, you didn't win this time.");
            }

            System.out.print("Do you want to play again? (Y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
            if (playAgain.startsWith("n")) {
                break;
            }
        }

        System.out.println("Thanks for playing! Your final balance is $" + balance + ". Goodbye.");

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍊", "🌟", "🔔"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("-----------------");
        System.out.println("  " + String.join(" | ", row));
        System.out.println("-----------------");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 5;
                case "🍉" -> bet * 10;
                case "🍊" -> bet * 15;
                case "🌟" -> bet * 20;
                case "🔔" -> bet * 50;
                default -> 0;
            };
        } else if ((row[0].equals(row[1]))) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🌟" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet;
                case "🍉" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🌟" -> bet * 4;
                case "🔔" -> bet * 5;
                default -> 0;
            };
        } else if (row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🌟" -> bet * 6;
                case "🔔" -> bet * 8;
                default -> 0;
            };
        } else {
            return 0;
        }
    }

}
