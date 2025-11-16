package advanced;

public class Generics {

    // Generics: a feature in Java that allows you to define classes, interfaces, and methods with a placeholder for the type of data they operate on.
    //           This enables you to create reusable and type-safe code components that can work with different data types without sacrificing type safety.
    //           Generics are commonly used in collections (like ArrayList, HashMap) to ensure that they can store and operate on specific types of objects while providing compile-time type checking.
    //           By using generics, you can avoid the need for type casting and reduce the risk of runtime errors related to type mismatches.
    //           <T> [type parameter] is a common convention for representing a generic type parameter, but you can use any valid identifier.
    //           <String>, <Integer>, <Double> are examples of specific type parameters used with generics.

    void main() {

        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Box contains: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Integer Box contains: " + integerBox.getContent());

        System.out.println();

        Product<String, Double> product = new Product<>("Laptop", 999.99);
        System.out.println("Product Name: " + product.getName() + ", Price: $" + product.getPrice());

        Product<String, Integer> anotherProduct = new Product<>("Smartphone", 799);
        System.out.println("Product Name: " + anotherProduct.getName() + ", Price: $" + anotherProduct.getPrice());
    }
}
