void main() {

    double result1, result2, result3, result4, result5, result6,
           result7, result8, result9, result10,
           result11, result12, result13, result14;

    result1 = Math.random(); // Generates a random number between 0.0 and 1.0
    result2 = Math.sqrt(16); // Calculates the square root of 16
    result3 = Math.pow(2, 8); // Calculates 2 raised to the power of 8
    result4 = Math.abs(-42); // Returns the absolute value of -42
    result5 = Math.max(10, 20); // Returns the maximum of 10 and 20
    result6 = Math.min(10, 20); // Returns the minimum of 10 and 20
    result7 = Math.round(4.6); // Rounds 4.6 to the nearest integer
    result8 = Math.ceil(4.2); // Rounds 4.2 up to the nearest integer
    result9 = Math.floor(4.8); // Rounds 4.8 down to the nearest integer
    result10 = Math.sin(Math.PI / 2); // Calculates the sine of π/2 radians
    result11 = Math.cos(0); // Calculates the cosine of 0 radians
    result12 = Math.tan(Math.PI / 4); // Calculates the tangent of π/4 radians
    result13 = Math.log(Math.E); // Calculates the natural logarithm of e
    result14 = Math.exp(2); // Calculates e raised to the power of 1

    System.out.println("pi = " + Math.PI);
    System.out.println("e = " + Math.E);
    System.out.println("Random number: " + result1);
    System.out.println("Square root of 16: " + result2);
    System.out.println("2^8: " + result3);
    System.out.println("Absolute value of -42: " + result4);
    System.out.println("Maximum of 10 and 20: " + result5);
    System.out.println("Minimum of 10 and 20: " + result6);
    System.out.println("Rounded value of 4.6: " + result7);
    System.out.println("Ceiling of 4.2: " + result8);
    System.out.println("Floor of 4.8: " + result9);
    System.out.println("Sine of π/2: " + result10);
    System.out.println("Cosine of 0: " + result11);
    System.out.println("Tangent of π/4: " + result12);
    System.out.println("Natural logarithm of e: " + result13);
    System.out.println("e^2: " + result14);
}