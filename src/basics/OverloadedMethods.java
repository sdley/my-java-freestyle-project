package basics;

public class OverloadedMethods {

    // Overloaded method: same method name with different parameter lists (type, number, or both)
    // This allows methods to perform similar functions with different inputs
    // Method overloading improves code readability and reusability
    // signature: method name + parameter list

    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void displayInfo(String name, int age, String country) {
        System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country);
    }

    static void main() {
        displayInfo("Alice");
        displayInfo("Bob", 30);
        displayInfo("Charlie", 25, "USA");
    }
}
