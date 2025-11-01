void main() throws InterruptedException {

    // Count down from a given number to zero

    Scanner scanner = new Scanner(System.in);

    System.out.print("How many seconds to count down from?: ");
    int seconds = scanner.nextInt();

    for (int i = seconds; i > 0; i--) {
        System.out.println(i);
        Thread.sleep(1000); // Pause for 1 second
    }

    System.out.println("Happy New Year!");
    scanner.close();
}