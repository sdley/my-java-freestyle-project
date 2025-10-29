void main() {

    // if statement: performs a block of code if a specified condition is true

    Scanner scanner = new Scanner(System.in);

    String name;
    int age;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    System.out.print("Are you a student? (true/false): ");
    isStudent = scanner.nextBoolean();

    System.out.println();

    if (name.isEmpty()) {
        System.out.println("You didn't enter a name. 😡");
    } else {
        System.out.println("Hello, " + name + "! 🤓");

    }

    if (age >= 65) {
        System.out.println("You are a senior citizen. 👴");
    }
    else if (age >= 18) {
        System.out.println("You are an adult. 👨");
    } else if (age < 0) {
        System.out.println("You haven't been born yet. 👻");
    } else if (age == 0) {
        System.out.println("You are a newborn. 🧒🏻");
    } else {
        System.out.println("You are a minor. 🧒");
    }

    if (isStudent) {
        System.out.println("You are a student. 🏫");
    }
    else {
        System.out.println("You are not a student. 👨‍💼");
    }

    scanner.close();
}