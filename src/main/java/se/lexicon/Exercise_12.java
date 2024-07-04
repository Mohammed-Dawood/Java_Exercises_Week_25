package se.lexicon;

import java.util.Scanner;

public class Exercise_12 {

    public static void exercise_12() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the 2D array
        System.out.print("Enter the size of the 2D array: ");
        int size = scanner.nextInt();

        // Initialize the 2D array with the given size
        int[][] array = new int[size][size];

        // Populate the first row with user input
        System.out.println("Enter the elements of the first row:");
        for (int j = 0; j < size; j++) {
            System.out.print("Element [0][" + j + "]: ");
            array[0][j] = scanner.nextInt();
        }

        // Populate the first column with user input
        System.out.println("Enter the elements of the first column:");
        for (int i = 1; i < size; i++) {
            System.out.print("Element [" + i + "][0]: ");
            array[i][0] = scanner.nextInt();
        }

        // Compute the remaining elements
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                array[i][j] = array[i][0] * array[0][j];
            }
        }

        // Print the 2D array
        System.out.println("2D array:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Print the diagonal elements
        System.out.print("Diagonal elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
    }

}
