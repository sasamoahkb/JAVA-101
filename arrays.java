public class arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("Accessing Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modifying array elements
        numbers[2] = 100;
        System.out.println("\nAfter modifying element at index 2:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Array Length
        System.out.println("\nLength of the array: " + numbers.length);

        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing multi-dimensional array elements
        System.out.println("\nMulti-dimensional Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
    
}
