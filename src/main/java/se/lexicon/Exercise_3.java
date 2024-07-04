package se.lexicon;

import java.util.Arrays;

public class Exercise_3 {
    public static void exercise_3() {
        // Define the string array
        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        // Print the original array
        System.out.println("String array: " + Arrays.toString(cities));

        // Sort the array
        Arrays.sort(cities);

        // Print the sorted array
        System.out.println("Sort string array: " + Arrays.toString(cities));

    }
}
