void main() {

    Scanner scanner = new Scanner(System.in);

    double num1, num2, result;
    char operator;

    System.out.print("Enter the first number: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter an operator (+, -, *, /, ^, %): ");
    operator = scanner.next().charAt(0);

    System.out.print("Enter the second number: ");
    num2 = scanner.nextDouble();

    switch (operator) {
        case '+' -> result = num1 + num2;
        case '-' -> result = num1 - num2;
        case '*' -> result = num1 * num2;
        case '/' -> {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return;
            }
        }
        case '^' -> result = Math.pow(num1, num2);
        case '%' -> result = num1 % num2;
        default -> {
            System.out.println("Error: Invalid operator.");
            scanner.close();
            return;
        }
    }

    System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);

    scanner.close();
}