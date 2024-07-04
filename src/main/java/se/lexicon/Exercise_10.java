package se.lexicon;

public class Exercise_10 {

    public static void exercise_10() {

        int size = 10; // Size of the multiplication table
        int[][] multiplicationTable = new int[size][size];

        // Fill the multiplication table
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
