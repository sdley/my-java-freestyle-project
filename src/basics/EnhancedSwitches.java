void main() {

    // Enhanced switch: a replacement to many chained if-else-if statements
    // (java 14 and later)

    // Given a day of the week, print whether it's a weekday or weekend

    Scanner scanner = new Scanner(System.in);

    String day;
    String typeOfDay;

    System.out.print("Enter a day of the week (e.g., MONDAY): ");
    day = scanner.nextLine().toUpperCase();

    switch (day) {
        case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> typeOfDay = "Weekday 😩";
        case "SATURDAY", "SUNDAY" -> typeOfDay = "Weekend 😁";
        default -> typeOfDay = "Invalid day";
    }

    System.out.println(day + " is a " + typeOfDay);

    scanner.close();
}