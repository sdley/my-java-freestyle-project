void main () {

    Random random = new Random();

    int number1;
    int number2;
    int number3;

    int randomInt = random.nextInt(100); // Random integer between 0 and 99
    double randomDouble = random.nextDouble(); // Random double between 0.0 and 1.0
    boolean randomBoolean = random.nextBoolean(); // Random boolean value
    boolean isHeads = random.nextBoolean(); // Simulate a coin flip

    number1 = random.nextInt(1, 7);
    number2 = random.nextInt(1, 7);
    number3 = random.nextInt(1, 7);

    System.out.println("Random Integer: " + randomInt);
    System.out.println("Random Double: " + randomDouble);
    System.out.println("Random Boolean: " + randomBoolean);
    System.out.println("Coin Flip (is Heads?): " + isHeads);
    System.out.println("Three random numbers between 1 and 6: " + number1 + ", " + number2 + ", " + number3);
}