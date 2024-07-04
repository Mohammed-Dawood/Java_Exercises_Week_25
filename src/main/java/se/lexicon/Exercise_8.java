package se.lexicon;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise_8 {

    public static void exercise_8() {

        // Step 1: Create the initial array with duplicate elements
        int[] arrayWithDuplicates = {20, 20, 40, 20, 30, 40, 50, 60, 50};

        // Display the original array
        System.out.print("Array: ");
        for (int num : arrayWithDuplicates) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 2: Remove duplicates
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        // Display the array without duplicate values
        System.out.print("Array without duplicate values: ");
        for (int num : arrayWithoutDuplicates) {
            System.out.print(num + " ");
        }


    }

    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        int[] tempArray = new int[array.length];
        int index = 0;

        for (int num : array) {
            if (!seen.contains(num)) {
                seen.add(num);
                tempArray[index++] = num;
            }
        }

        // Copy the unique elements to a new array of the correct size
        return Arrays.copyOf(tempArray, index);

    }
}




