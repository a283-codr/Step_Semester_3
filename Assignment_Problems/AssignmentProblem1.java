import java.util.Arrays;

public class AssignmentProblem1 {

    public static void lineUp(int[] heights) {
        for (int pass = 1; pass < heights.length; pass++) {
            boolean swapped = false;

            for (int j = 0; j < heights.length - pass; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": "
                    + Arrays.toString(heights));

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Sample Input: [4, 2, 5, 1]");
        lineUp(new int[]{4, 2, 5, 1});

        System.out.println("\nSample Input: [1, 3, 2, 4]");
        lineUp(new int[]{1, 3, 2, 4});

        System.out.println("\nCustom Input: [9, 5, 7, 2]");
        lineUp(new int[]{9, 5, 7, 2});
    }
}