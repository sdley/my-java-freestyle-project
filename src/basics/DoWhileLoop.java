void main() {

    // Do-While Loop
    // A do-while loop executes a block of code once, and then repeatedly executes it as long as a specified condition is true

    Scanner scanner = new Scanner(System.in);

    int age;

    do {
        System.out.print("Enter your age (must be a positive number): ");
        age = scanner.nextInt();
    } while (age <= 0);

    System.out.println("You are " + age + " years old.");

    scanner.close();
}