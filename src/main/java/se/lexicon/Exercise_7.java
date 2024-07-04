package se.lexicon;

public class Exercise_7 {

    public static void exercise_7() {

        // Initialize the array with 10 numbers
        int[] numbers = {1, 2, 4, 7, 9, 12, 15, 18, 21, 24};

        // Print the original array
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Print only the odd numbers
        System.out.print("Odd Array: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

    }
}
