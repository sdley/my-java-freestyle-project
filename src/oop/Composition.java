package oop;

public class Composition {

    // Composistion: represents a "part-of" relationship where the part cannot exist independently of the whole.
    //               For example, a "Car" class may have an "Engine" class as a part of it. If the Car is destroyed, the Engine cannot exist independently.
    //               Allows complex objects to be built from simpler ones, promoting code reuse and modularity.

    void main() {
        CarBis car = new CarBis("Toyota Camry", 2020, "V6", 301);
        car.start();
    }


}
