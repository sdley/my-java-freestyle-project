package exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    void main() {
        // Rock-Paper-Scissors Game
        // [Pierre-Papier-Ciseaux in French]
        // A simple implementation of the classic Rock-Paper-Scissors game.
        // The player competes against the computer, which makes random choices.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChoice;
        String computerChoice;
        String[] choices = {"rock", "paper", "scissors"};
        char playAgain = 'y';

        System.out.println("****************************************");
        System.out.println("Welcome to the Rock-Paper-Scissors Game!");
        System.out.println("****************************************\n");



        do {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors. ");
                continue; // Restart the loop for a valid input
            }

            int computerIndex = random.nextInt(3);
            computerChoice = choices[computerIndex];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (Y/n): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = !playAgainInput.isEmpty() ? playAgainInput.charAt(0) : '\n';
        } while ((playAgain == 'y' || playAgain == '\n'));

        System.out.println("Thanks for playing! Goodbye.");

        scanner.close();
    }
}
