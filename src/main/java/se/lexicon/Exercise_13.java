package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_13 {

    public static void exercise_13() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the arrays with the specified size
        int[] originalArray = new int[size];
        int[] rearrangedArray = new int[size];

        Random random = new Random();

        // Fill the original array with random numbers
        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(100); // Random numbers between 0 and 99
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Rearrange the array with odds in the front and evens in the rear
        int oddIndex = 0;
        int evenIndex = size - 1;

        for (int i = 0; i < size; i++) {
            if (originalArray[i] % 2 == 0) {
                rearrangedArray[evenIndex] = originalArray[i];
                evenIndex--;
            } else {
                rearrangedArray[oddIndex] = originalArray[i];
                oddIndex++;
            }
        }

        // Print the rearranged array
        System.out.println("Rearranged array: " + Arrays.toString(rearrangedArray));
    }

}
