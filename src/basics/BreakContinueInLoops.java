void main() {

    // break: breaks out of the nearest enclosing loop (STOP)
    // continue: skips the current iteration of the nearest enclosing loop (SKIP)

    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            System.out.println("Skipping number 5");
            continue; // Skip the rest of the loop when i is 5
        }
        if (i == 8) {
            System.out.println("Breaking out of the loop at number 8");
            break; // Exit the loop when i is 8
        }
        System.out.println("Current number: " + i);
    }

}