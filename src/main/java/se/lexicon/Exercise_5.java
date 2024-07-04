package se.lexicon;

public class Exercise_5 {
    public static void exercise_5() {
        // Create a 2-dimensional string array with dimensions 2x2
        String[][] countryCityArray = new String[2][2];

        // Assign values to the array
        countryCityArray[0][0] = "France";
        countryCityArray[0][1] = "Paris";
        countryCityArray[1][0] = "Sweden";
        countryCityArray[1][1] = "Stockholm";

        // Print the values in the array
        for (String[] strings : countryCityArray) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
}
