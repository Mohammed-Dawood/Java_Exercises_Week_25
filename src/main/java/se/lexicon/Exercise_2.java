package se.lexicon;

public class Exercise_2 {
    public static void exercise_2() {
        int[] numbers = {1, 2, 5, 7, 9}; // Example array
        int elementToFind = 5;

        // Find the index of the element in the array
        int index = indexOf(numbers, elementToFind);

        // Print the result
        if (index != -1) {
            System.out.println("Index position of number " + elementToFind + " is: " + index);
        } else {
            System.out.println("Element " + elementToFind + " is not found in the array.");
        }
    }

    // Method to find the index of an element in an array
    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }
}



