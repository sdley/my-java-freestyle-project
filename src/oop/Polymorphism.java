package oop;

public class Polymorphism {

    // Polymorphism: The ability of different classes to be treated as instances of the same class through a common interface.
    // It allows methods to do different things based on the object it is acting upon, even though they share the same name.
    // There are two types of polymorphism in Java:
    // 1. Compile-time polymorphism (Method Overloading)
    // 2. Runtime polymorphism (Method Overriding)

    // Polymorphism: "Poly" = "many"
    //               "morph" = "shape"/"forms".
    //               Objects can identify as other objects.
    //               Objects can be treated as objects of a common superclass.


    static void main() {
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car, boat, bike};

        for (Vehicle v : vehicles) {
            v.go(); // Dynamic method dispatch
        }

        System.out.println();


        car.go();  // Outputs: The car is driving.
        boat.go(); // Outputs: The boat is sailing.
        bike.go();   // Outputs: You ride the bike.
    }
}
