import java.util.Scanner;

void main() {

    // User Input Common Issues and Best Practices

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Consume the leftover newline character

    System.out.print("What is your favorite color: ");
    String color = scanner.nextLine();

    System.out.println("You are " + age + " years old.");
    System.out.println("Your favorite color is: " + color);


    // Close the scanner to prevent resource leaks
    scanner.close();
}
