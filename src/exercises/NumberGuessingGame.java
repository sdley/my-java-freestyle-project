void main() {

    // Number Guessing Game
    // The program randomly selects a number between 1 and 100
    // The user has to guess the number
    // The program provides feedback if the guess is too high, too low, or correct

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int min = 1;
    int max = 100;
    int targetNumber = random.nextInt(min, max + 1); // Random number between 1 and 100
    int userGuess;
    int attempts = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.printf("Guess a number between %d and %d: ", min, max);

    do {
        userGuess = scanner.nextInt();
        attempts++;

        if (userGuess < targetNumber) {
            System.out.print("Too low! Try again: ");
        } else if (userGuess > targetNumber) {
            System.out.print("Too high! Try again: ");
        } else {
            System.out.println("Congratulations! You've guessed the number "
                    + targetNumber + " in " + attempts + " attempts.");
        }
    }while (userGuess != targetNumber);

    scanner.close();
}
