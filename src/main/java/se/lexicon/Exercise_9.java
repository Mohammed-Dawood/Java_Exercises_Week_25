package se.lexicon;

import java.util.Arrays;

public class Exercise_9 {

    public static void exercise_9() {

        int[] array = {10, 20, 30};
        System.out.println("Initial Array: " + Arrays.toString(array));

        array = addElement(array, 40);
        System.out.println("Array after adding 40: " + Arrays.toString(array));

        array = addElement(array, 50);
        System.out.println("Array after adding 50: " + Arrays.toString(array));
    }

    public static int[] addElement(int[] array, int element) {
        // Create a new array with size increased by 1
        int[] newArray = new int[array.length + 1];

        // Copy elements from the old array to the new array
        System.arraycopy(array, 0, newArray, 0, array.length);

        // Add the new element to the end of the new array
        newArray[array.length] = element;

        // Return the new array
        return newArray;
    }
}
