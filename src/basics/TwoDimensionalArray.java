package basics;

public class TwoDimensionalArray {

    void main() {
        // 2D Array: An array of arrays, used to represent a matrix or grid-like structure.
        // Declaration and Initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        String[][] groceries = {
                {"Apple", "Banana", "Cherry"},
                {"Carrot", "Potato", "Onion"},
                {"Chicken", "Beef", "Fish"}
        };

        System.out.println("Groceries List:");

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix elements:");
        // Accessing elements
        System.out.println("Element at (0,0): " + matrix[0][0]); // Output: 1
        System.out.println("Element at (1,2): " + matrix[1][2]); // Output: 6

        // Iterating through a 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
