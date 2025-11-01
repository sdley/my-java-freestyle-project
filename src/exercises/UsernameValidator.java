void main() {

    // Username validator
    // A valid username must be between 5 and 15 characters long and contain no spaces
    // Also, it must not hyphen

    Scanner scanner = new Scanner(System.in);

    String username;

    System.out.print("Enter your username: ");
    username = scanner.nextLine();

    if (username.length() >= 5 && username.length() <= 15
            && !username.contains(" ") && !username.contains("-")) {
        System.out.println("Welcome, " + username + "!");
    } else {
        System.out.println("Invalid username. It must be 5-15 characters long, contain no spaces or hyphens.");
    }
}