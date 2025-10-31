void main() {

    // printf statement is a method used to format and print data to the console.
    // It allows you to specify the format of the output using format specifiers.
    // The general syntax of a format specifier is as follows:
    // %[flags][width][.precision]conversion-character

    // flags
    // - : left-justify within the given field width
    // + : forces to precede the result with a plus or minus sign
    // 0 : zero-pads the number
    // , : includes locale-specific grouping separators
    // ( : encloses negative numbers in parentheses
    // space : leaves a blank space before positive numbers
    // width : minimum number of characters to be written to the output
    // .precision : for floating-point numbers, it specifies the number of digits after the decimal point
    // conversion-character : specifies the type of data to be formatted
    // d : decimal integer
    // f : floating-point number
    // s : string
    // c : character
    // b : boolean

    double price1 = 9.99;
    double price2 = 1999.99;
    double price3 = -49.95;

    System.out.printf("Price 1: $%,.1f\n", price1);
    System.out.printf("Price 2: $%,.2f\n", price2);
    System.out.printf("Price 3: $(%,.2f)\n", price3);

    System.out.printf("%nPrice 1: %+,.1f\n", price1);
    System.out.printf("Price 2: %+,.2f\n", price2);
    System.out.printf("Price 3: %+,.2f\n", price3);

    System.out.printf("%nPrice 1: %,.1f\n", price1);
    System.out.printf("Price 2: %.2f\n", price2);
    System.out.printf("Price 3: %.2f\n", price3);

    System.out.printf("%nPrice 1: % ,.1f\n", price1);
    System.out.printf("Price 2: % .2f\n", price2);
    System.out.printf("Price 3: % .2f\n", price3);



}