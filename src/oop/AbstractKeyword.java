package oop;

public class AbstractKeyword {

    // abstract: Used to declare a class or method as abstract.
    // Abstraction is the process of hiding implementation details and showing only **essential features** of an object.
    // It allows you to focus on what an object does instead of how it does it.
    // An abstract class cannot be instantiated directly and may contain abstract methods (methods without a body).
    // Abstract methods must be implemented by subclasses.
    // It also can contain concrete methods (methods with a body).

    static abstract class Shape {
        abstract double area();

        void display() {
            System.out.printf("This is a shape of %s. %n", this.getClass().getSimpleName());
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    static void main() {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        System.out.println("Area of Circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }


}
