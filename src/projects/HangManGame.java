package projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangManGame {

    static void main() {
        // Java Hangman Game

        String filePath = "src/projects/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }catch(FileNotFoundException e) {
            System.out.println("Words file not found: " + e.getMessage());
            return;
        }
        catch (Exception e) {
            System.out.println("Error reading words file: " + e.getMessage());
            return;
        }


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));


        String hiddenWord = "_".repeat(word.length());
        int attempts = 6;

        System.out.println("****************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("****************************");


        while (attempts > 0 && hiddenWord.contains("_")) {
            System.out.println("Word: " + hiddenWord);
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");

            char guess = scanner.nextLine().charAt(0);
            boolean correctGuess = false;

            StringBuilder newHiddenWord = new StringBuilder(hiddenWord);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    newHiddenWord.setCharAt(i, guess);
                    correctGuess = true;
                }
            }

            hiddenWord = newHiddenWord.toString();

            if (!correctGuess) {
                attempts--;
                System.out.println("Wrong guess!");
            } else {
                System.out.println("Good guess!");
            }
        }

        if (!hiddenWord.contains("_")) {
            System.out.println("Congratulations! You've guessed the word: " + word);
        } else {
            System.out.println("Game over! The word was: " + word);
        }

        scanner.close();
    }
}
