void main() {

    Scanner scanner = new Scanner(System.in);

    int rows, cols;
    char symbol;

    System.out.print("Enter the number of rows: ");
    rows = scanner.nextInt();

    System.out.print("Enter the number of columns: ");
    cols = scanner.nextInt();

    System.out.print("Enter a symbol to fill the matrix: ");
    scanner.nextLine(); // Consume the leftover newline character
    symbol = scanner.nextLine().charAt(0);

    System.out.println("Generated Matrix:");

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }

    scanner.close();
}