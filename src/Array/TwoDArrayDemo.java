package Array;

public class TwoDArrayDemo {

    public static void main(String[] args) {
        // Declaration and Initialization of a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Displaying the elements of the 2D array
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Accessing and updating elements
        int element = matrix[1][2]; // Accessing element at row 1, column 2
        System.out.println("\nElement at matrix[1][2]: " + element);

        matrix[0][1] = 10; // Updating element at row 0, column 1
        System.out.println("\nMatrix after updating element at matrix[0][1]:");
        displayMatrix(matrix);

        // Iterating through the 2D array
        System.out.println("\nIterating through the Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Demo plus two matrix
    }

    // Helper method to display a 2D array
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
