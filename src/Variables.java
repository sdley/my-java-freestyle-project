void main() {

    // Variable: A container that holds data that can be changed during program execution

    // Primitive: simple value stored directly in memory (stack)
    // Reference: memory address (stack) that points to the actual data stored in heap memory

    // Primitive vs Reference Variables:
    // ---------    -------------------
    // int          string
    // double       array
    // float        class
    // char         interface
    // boolean      object
    // byte         etc.
    // short
    // long

    // 2 steps to create a variable
    // ----------------------------------------
    // 1. Declare the variable
    // 2. Initialize the variable (Assign a value)

    int year = 2025;
    int month = 10;
    int day = 28;

    double price = 10200.25;
    float tax = 0.07f;
    char grade = 'A';

    boolean isActive = true;
    boolean isStudent = true;
    boolean isOnline = false;

    String currency = "XOF";
    String country = "Senegal";


    System.out.println("Today is: " + day + "/" + month + "/" + year);
}

