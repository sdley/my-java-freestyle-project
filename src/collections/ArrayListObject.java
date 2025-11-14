package collections;

import java.util.ArrayList;

public class ArrayListObject {

    // ArrayList is a resizable array implementation in Java's Collections Framework.
    // It allows dynamic resizing, meaning it can grow and shrink as elements are added or removed.
    // It provides methods to manipulate the list, such as adding, removing, and accessing elements.
    //             Arrays are fixed in size, while ArrayLists can change size dynamically.

    // ArrayList maintains the order of elements and allows duplicate entries.
    // It provides fast random access to elements using an index, but adding or removing elements (except at the end) can be slower due to shifting elements.
    // ArrayList is part of the java.util package and implements the List interface.

    void main() {

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(1, 15); // Insert 15 at index 1
//
//        System.out.println("ArrayList: " + list); // [10, 15, 20, 30]

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Grapes"); // Insert "Grapes" at index 1

        System.out.println("Fruits: " + fruits); // [Apple, Grapes, Banana, Orange]

        fruits.remove("Banana"); // Remove "Banana"
        fruits.remove(0); // Remove element at index 0 ("Apple")

        System.out.println("Fruits after removal: " + fruits); // [Grapes, Orange]

        String fruitAtIndex0 = fruits.get(0); // Access element at index 0
        System.out.println("Fruit at index 0: " + fruitAtIndex0); // Grapes

        fruits.set(0, "Pineapple"); // Update element at index 0
        System.out.println("Fruits after update: " + fruits); // [Pineapple, Orange]

        int size = fruits.size(); // Get the size of the ArrayList
        System.out.println("Size of fruits list: " + size); // 2

        // Sorting the ArrayList
        fruits.add("Mango");
        fruits.add("Apple");
        System.out.println("Fruits before sorting: " + fruits); // [Pineapple, Orange, Mango, Apple]
        fruits.sort(String::compareTo);
        System.out.println("Fruits after sorting: " + fruits); // [Apple, Mango, Orange, Pineapple]

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
