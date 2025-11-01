void main() {

    // Logical Operators
    // && (AND), || (OR), ! (NOT)

    Scanner scanner = new Scanner(System.in);

    double temp;
    boolean isSunny;

    System.out.print("Enter the temperature in Celsius: ");
    temp = scanner.nextDouble();

    System.out.print("Is it sunny outside? (true/false): ");
    isSunny = scanner.nextBoolean();

    if (temp >= 20 && temp <= 29 && isSunny) {
        System.out.println("The weather is good and it is sunny outside 😁");
    } else if (temp >= 20 && temp <= 29 && !isSunny ) {
        System.out.println("The weather is good but it is cloudy outside ☁️");
    } else if (temp <= 0 || temp >= 30) {
        System.out.println("The weather is bad 😩");
    } else System.out.println("The weather is freezing ❄️");

    scanner.close();

}