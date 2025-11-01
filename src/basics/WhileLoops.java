void main() {

    // While Loops
    // A while loop repeatedly executes a block of code as long as a specified condition is true

    Scanner scanner = new Scanner(System.in);

    String name = "";

    while(name.isEmpty()){
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }

    System.out.println("Hello, " + name + "!");

    scanner.close();
}