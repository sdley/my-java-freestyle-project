package exercises;

public class LinearSearchInArray {

    int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    void main() {
        int[] numbers = {4, 2, 7, 1, 9, 3};
        int target = 10;

        String[] fruits = {"apple", "banana", "cherry", "date"};
        String targetFruit = "cherry";

        int resultIndex = linearSearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Target number " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Target number " + target + " not found in the array.");
        }

        int fruitIndex = linearSearch(fruits, targetFruit);
        if (fruitIndex != -1) {
            System.out.println("Target fruit \"" + targetFruit + "\" found at index: " + fruitIndex);
        } else {
            System.out.println("Target fruit \"" + targetFruit + "\" not found in the array.");
        }
    }
}
