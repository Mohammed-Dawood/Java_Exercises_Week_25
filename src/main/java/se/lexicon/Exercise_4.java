package se.lexicon;

import java.util.Arrays;

public class Exercise_4 {

    public static void exercise_4() {
        // Define the first array
        int[] firstArray = {1, 15, 20};

        // Create the second array of the same length
        int[] secondArray = new int[firstArray.length];

        // Copy elements from first array to second array using a loop
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);

        // Print elements of the first array
        System.out.println("Elements from first array: " + Arrays.toString(firstArray));

        // Print elements of the second array
        System.out.println("Elements from second array: " + Arrays.toString(secondArray));

    }
}

