package oop;

public class WrapperClasses {

    // Wrapper classes in Java provide a way to use primitive data types (int, char, etc.) as objects.
    // Notice: don't wrap primitives unless you need it as an object (e.g., in collections like ArrayList).
    // This is because wrapper classes introduce additional overhead and can lead to performance issues if overused
    // Each primitive type has a corresponding wrapper class in the java.lang package:
    // - int -> Integer
    // - char -> Character
    // - boolean -> Boolean
    // - byte -> Byte
    // - short -> Short
    // - long -> Long
    // - float -> Float
    // - double -> Double
    // - void -> Void

    void main() {
        // Autoboxing: automatic conversion of primitive types to their corresponding wrapper class
//        int a = 10;
//        Integer wrappedInt = a; // Autoboxing
//
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//
//        // Unboxing: automatic conversion of wrapper class back to primitive type
//        Integer anotherWrappedInt = 20;
//        int anotherPrimitiveInt = anotherWrappedInt; // Unboxing
//        boolean x = d;

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Boolean.toString(true);
        String d = Character.toString('@');

        String x = a + " " + b + " " + c + " " + d;

        System.out.println(x);

        char letter = 'b';

        System.out.println(Character.isLetter(letter)); // true
        System.out.println(Character.toUpperCase(letter)); // 'B'
        System.out.println(Character.isLowerCase(letter));
        System.out.println(Character.getNumericValue('7')); // 7



    }

}
