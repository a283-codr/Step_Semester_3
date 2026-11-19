
import java.util.Scanner;

public class WeeklyRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] rainfall = new double[7];
        double total = 0;
        int dryDays = 0;
        int wettestDay = 0;

        for (int i = 0; i < 7; i++) {
            rainfall[i] = sc.nextDouble();
            total += rainfall[i];

            if (rainfall[i] == 0) {
                dryDays++;
            }

            if (rainfall[i] > rainfall[wettestDay]) {
                wettestDay = i;
            }
        }

        System.out.print("Rainfall (mm): ");

        for (int i = 0; i < 7; i++) {
            System.out.print(rainfall[i]);

            if (i < 6) {
                System.out.print(" ");
            }
        }

        double average = total / 7.0;

        System.out.printf("%n%nTotal Rainfall: %.1f mm%n", total);
        System.out.printf("Average Rainfall: %.2f mm%n", average);

        System.out.printf(
            "Wettest Day: Day %d (%.1f mm)%n",
            wettestDay + 1, rainfall[wettestDay]
        );

        System.out.println("Total Dry Days: " + dryDays);

        sc.close();
    }
}

// Time Complexity: O(1), as exactly 7 days are processed.
// Space Complexity: O(1), as the array size is fixed.
