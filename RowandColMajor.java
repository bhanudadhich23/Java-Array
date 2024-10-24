public class RowandColMajor {
    public static void main(String[] args) {
        // Example 2D array (3 rows and 4 columns)
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Row-major order traversal
        System.out.println("Row-Major Order:");
        for (int i = 0; i < arr.length; i++) {  // Iterate over rows
            for (int j = 0; j < arr[0].length; j++) {  // Iterate over columns in each row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }

        // Column-major order traversal
        System.out.println("\nColumn-Major Order:");
        for (int j = 0; j < arr[0].length; j++) {  // Iterate over columns
            for (int i = 0; i < arr.length; i++) {  // Iterate over rows in each column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // New line after each column
        }
    }
}
