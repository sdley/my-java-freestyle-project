void main() {

    // Hypotenuse calculation
    // Given two sides of a right triangle, calculate the hypotenuse
    // c^2 = a^2 + b^2

    Scanner scanner = new Scanner(System.in);

    double a;
    double b;
    double c;

    System.out.print("Enter the length of side a: ");
    a = scanner.nextDouble();

    System.out.print("Enter the length of side b: ");
    b = scanner.nextDouble();

    c = Math.sqrt(a * a + b * b);

    System.out.printf("The length of the hypotenuse c is: %.2fcm\n", c);
}