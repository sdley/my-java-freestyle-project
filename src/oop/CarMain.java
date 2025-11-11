package oop;

public class CarMain {
    // Main class to run the Car example

    static void main() {
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
        System.out.println("Car Price: $" + myCar.price);
        System.out.printf("%nStarting the car...%n");
        myCar.start();
        System.out.println("Is the car running? " + myCar.isRunning);
        System.out.printf("%nStopping the car...%n");
        myCar.stop();
        System.out.println("Is the car running? " + myCar.isRunning);

        System.out.println("\nCreating a second car instance:");
        System.out.println("Car Make: " + myCar2.make);
        System.out.println("Car Model: " + myCar2.model);
        System.out.println("Car Year: " + myCar2.year);
        System.out.println("Car Price: $" + myCar2.price);
    }
}
