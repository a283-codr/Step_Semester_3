import java.util.Arrays;

public class AssignmentProblem2 {

    public static int prizeTable(int[] marks) {
        int swaps = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] sample1 = {45, 90, 60, 75};
        int swaps1 = prizeTable(sample1);

        System.out.println("Sample Input 1: "
                + Arrays.toString(sample1)
                + " swaps = " + swaps1);

        int[] sample2 = {80, 70, 60};
        int swaps2 = prizeTable(sample2);

        System.out.println("Sample Input 2: "
                + Arrays.toString(sample2)
                + " swaps = " + swaps2);

        int[] custom = {25, 95, 40, 85, 10};
        int customSwaps = prizeTable(custom);

        System.out.println("Custom Input: "
                + Arrays.toString(custom)
                + " swaps = " + customSwaps);
    }
}