package se.lexicon;

public class Exercise_6 {

    public static void exercise_6() {

        // Initialize the array with the specified values
        int[] numbers = {43, 5, 23, 17, 2, 14};

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the average
        System.out.println("Average is: " + average);
    }
}

