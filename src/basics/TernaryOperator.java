void main() {

    // Ternary operator ?: return one of two values based on a condition

    // variable = (condition) ? valueIfTrue : valueIfFalse;

    int score = 75;
    String result = (score >= 50) ? "Pass" : "Fail";

    int number = 101;
    String parity = (number % 2 == 0) ? "Even" : "Odd";

    System.out.println("Your result is: " + result);
    System.out.println("The number is: " + parity);

}
