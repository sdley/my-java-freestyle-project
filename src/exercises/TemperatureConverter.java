void main() {

    Scanner scanner = new Scanner(System.in);

    double temp;
    double newTemp;
    String unit;

    System.out.print("Enter the temperature value to convert: ");
    temp = scanner.nextDouble();

    System.out.print("Enter the unit to convert to (C for Celsius, F for Fahrenheit): ");
    unit = scanner.next().toUpperCase();

    // (condition) ? value_if_true : value_if_false;
    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
    System.out.printf("%.2f°%s is equal to %.2f°%s\n", temp, unit.equals("C") ? "F" : "C", newTemp, unit);

    // Alternative using if-else
    /*
    if (unit.equals("C")) {
        newTemp = (temp - 32) * 5 / 9;
        System.out.printf("%.2f°F is equal to %.2f°C\n", temp, newTemp);
    } else if (unit.equals("F")) {
        newTemp = (temp * 9 / 5) + 32;
        System.out.printf("%.2f°C is equal to %.2f°F\n", temp, newTemp);
    } else {
        System.out.println("Invalid unit. Please enter C or F.");
    }

     */

    scanner.close();
}