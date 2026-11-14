import java.util.Arrays;

public class AssignmentProblem5 {

    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        // Count each dice value from 1 to 6
        for (int roll : rolls) {
            if (roll < 1 || roll > 6) {
                throw new IllegalArgumentException(
                    "Dice values must be between 1 and 6."
                );
            }
            count[roll]++;
        }

        // Print the counts
        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i]);
            if (i < 6) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Build the sorted array using the counts
        int[] result = new int[rolls.length];
        int index = 0;

        for (int value = 1; value <= 6; value++) {
            for (int j = 0; j < count[value]; j++) {
                result[index++] = value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] rolls1 = {4, 1, 6, 4, 2, 1, 4};
        System.out.println(
            "Sorted: " + Arrays.toString(diceSort(rolls1))
        );

        // Custom input
        int[] rolls2 = {3, 2, 5, 2};
        System.out.println(
            "Sorted: " + Arrays.toString(diceSort(rolls2))
        );
    }
}