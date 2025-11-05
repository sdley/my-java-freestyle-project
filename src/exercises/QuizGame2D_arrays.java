package exercises;

import java.util.Scanner;

public class QuizGame2D_arrays {

    // Java Quizz Game

    void main() {

        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the 'brain'?",
                "What year was Facebook lunched?",
                "Who is known as the father of modern computers?",
                "What was the first programming language?"
        };

        String[][] options = {
                {"A) To connect multiple networks", "B) To store data", "C) To process information", "D) To display graphics"},
                {"A) RAM", "B) CPU", "C) Hard Drive", "D) GPU"},
                {"A) 2002", "B) 2004", "C) 2006", "D) 2008"},
                {"A) Alan Turing", "B) Charles Babbage", "C) John von Neumann", "D) Steve Jobs"},
                {"A) Assembly Language", "B) COBOL", "C) Fortran", "D) Lisp"}
        };

        char[] answers = {'A', 'B', 'B', 'B', 'C'};
        int score = 0;
        char userAnswer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("********************************\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A, B, C, or D): ");
            userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("*************************");
                System.out.println("        Correct!");
                System.out.println("*************************\n");
            } else {
                System.out.println("***************************************************");
                System.out.println("    Wrong! The correct answer was " + answers[i] + ".");
                System.out.println("***************************************************\n");
            }
        }

        System.out.println("Your total score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
