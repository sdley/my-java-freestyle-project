void main() {

    // printf statement is a method used to format output.
    // It allows you to specify the format of the output using format specifiers.
    // The general syntax of a format specifier is as follows:
    // %[flags][width][.precision]conversion-character

    // width : minimum number of characters to be written to the output
    //         O: zero padding
    //         number: minimum width of number characters
    //              positive number: right-justified padding with spaces
    //              negative number: left-justified padding with spaces
    //              Example:
    //                  %05d : minimum width of 5 characters, pad with leading zeros
    //                  %-5d : minimum width of 5 characters, left-justified
    //                  5: minimum width of 5 characters

    int num1 = 1;
    int num2 = 23;
    int num3 = 456;
    int num4 = 7890;

    System.out.printf("Number 1: %05d\n", num1);
    System.out.printf("Number 2: %05d\n", num2);
    System.out.printf("Number 3: %05d\n", num3);
    System.out.printf("Number 4: %05d\n", num4);

    System.out.printf("%nNumber 1: %04d\n", num1);
    System.out.printf("Number 2: %04d\n", num2);
    System.out.printf("Number 3: %04d\n", num3);
    System.out.printf("Number 4: %04d\n", num4);

    System.out.printf("%nNumber 1: %4d\n", num1);
    System.out.printf("Number 2: %4d\n", num2);
    System.out.printf("Number 3: %4d\n", num3);
    System.out.printf("Number 4: %4d\n", num4);

    System.out.printf("%nNumber 1: %-4d\n", num1);
    System.out.printf("Number 2: %-4d\n", num2);
    System.out.printf("Number 3: %-4d\n", num3);
    System.out.printf("Number 4: %-4d\n", num4);


}