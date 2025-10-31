void main() {

    // printf statement is a method used to format and print data to the console.
    // It allows you to specify the format of the output using format specifiers.
    // The general syntax of a format specifier is as follows:
    // %[flags][width][.precision]conversion-character

    String name = "Spongebob";
    char firstLetter = name.charAt(0);
    int age = 12;
    double height = 4.5;
    boolean isCartoon = true;

    System.out.printf("Name: %s\n", name);
    System.out.printf("First Letter: %c\n", firstLetter);
    System.out.printf("Age: %d\n", age);
    System.out.printf("Height: %.1f feet\n", height);
    System.out.printf("Is Cartoon: %b\n", isCartoon);

    System.out.printf("Name: %-10s Age: %02d Height: %.2f\n", name, age, height);

    System.out.printf("%s is %d years old, %.1f feet tall, and it is %b that he is a cartoon character.\n",
                      name, age, height, isCartoon);
}