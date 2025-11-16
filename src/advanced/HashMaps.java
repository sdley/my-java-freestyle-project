package advanced;

import java.util.HashMap;

public class HashMaps {

    // HashMap: A data structure in Java that implements the Map interface and stores key-value pairs.
    //          It allows for efficient retrieval, insertion, and deletion of values based on their associated keys.
    //          HashMaps use a hash table to organize and manage the data, which provides average constant-time complexity (O(1)) for basic operations like get() and put().
    //          Keys in a HashMap must be unique, while values can be duplicated.
    //          HashMaps are commonly used for tasks such as caching, indexing, and implementing associative arrays.
    //          HashMap<KeyType, ValueType> is the syntax used to define a HashMap with specific types for keys and values.

    void main() {

        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Orange", 300);

        System.out.println("HashMap: " + map);

        // Retrieving values based on keys
        System.out.println("Price of Apple: " + map.get("Apple"));
        System.out.println("Price of Banana: " + map.get("Banana"));

        // Removing a key-value pair
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        // Iterating through the HashMap
        System.out.println("\nIterating through HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Checking if a key exists
        System.out.println("\nContains key 'Apple': " + map.containsKey("Apple"));
        System.out.println("Contains key 'Orange': " + map.containsKey("Orange"));

        // Checking the size of the HashMap
        System.out.println("\nSize of HashMap: " + map.size());

        // Getting all keys as a comma-separated string
        String keys = String.join(", ", map.keySet());
        System.out.println("\nKeys in HashMap: " + keys);

        String keys2 = map.keySet().toString();
        System.out.println("Keys in HashMap (using toString): " + keys2);

        // Getting all values as a comma-separated string;
        String values = map.values().toString();
        System.out.println("Values in HashMap: " + values);

    }
}
