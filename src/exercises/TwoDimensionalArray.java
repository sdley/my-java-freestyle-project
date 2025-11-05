package exercises;

public class TwoDimensionalArray {

    void main() {
        // 2D Array: An array of arrays, used to represent a matrix or grid-like structure.
        // Useful for storing a matrix, table, or grid of data.

        // Declaration and Initialization
        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        System.out.println("Telephone Keypad:");
        for (char[] row : telephone) {
            for (char key : row) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }
}
