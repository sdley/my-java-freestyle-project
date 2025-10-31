void main() {

    // Scanner: a scanner is an object that allows us to accept user input in java
    //          It is a good practice to close the scanner after use to free up system resources.
    //          Unclosed scanners can lead to resource leaks and potential memory issues in larger applications.
    //          So, it can lead to unexpected behavior if not handled properly that's why it is a good practice to close it at the end.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("What is your gpa: ");
    double gpa = scanner.nextDouble();

    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.print("What is your favorite programming language? ");
    String language = scanner.next();

    System.out.println("Hello, " + name + "! \nWelcome to Java programming.");
    System.out.println("You are " + age + " years old.");
    System.out.println("Your GPA is: " + gpa);
    System.out.println("Your favorite programming language is: " + language);

    if (isStudent) {
        System.out.println("You are a student.");
    } else {
        System.out.println("You are not a student.");
    }


    scanner.close();


}
