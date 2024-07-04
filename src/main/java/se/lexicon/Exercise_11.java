package se.lexicon;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11 {

    public static void exercise_11() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int stopValue = 42; // The specific value the user must enter to stop the input

        System.out.println("Please enter integers. Enter " + stopValue + " to stop.");

        // Step 1: Collect integers from the user until the stopValue is entered
        while (true) {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            if (input == stopValue) {
                break;
            }
            numbers.add(input);
        }

        // Convert ArrayList to array for the next steps
        Integer[] numbersArray = numbers.toArray(new Integer[0]);

        // Step 2: Print the array of entered values
        System.out.print("Array: ");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Step 3: Reverse the array in place
        reverseArray(numbersArray);

        // Step 4: Print the reversed array
        System.out.print("Reversed Array: ");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
    }

    // Method to reverse the array in place
    public static void reverseArray(Integer[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

