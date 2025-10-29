void main () {

    // Shoping cart program
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    System.out.print("What item would you like to purchase?: ");
    item = scanner.nextLine();

    System.out.print("What is the price of the " + item +  "?: ");
    price = scanner.nextDouble();

    System.out.print("How many " + item + " would you like to buy?: ");
    quantity = scanner.nextInt();

    total = price * quantity;

    System.out.println("\nYou have purchased " + quantity + " " + item + "(s) for a total of " + currency + total);

    scanner.close();
}