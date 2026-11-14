import java.util.Scanner;
import java.util.Locale;

public class WeeklyRainfall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        double[] rainfall = new double[7];

        double total = 0;
        int wettestIndex = 0;
        int dryDays = 0;

        for (int i = 0; i < 7; i++) {

            rainfall[i] = sc.nextDouble();

            total += rainfall[i];

            if (rainfall[i] > rainfall[wettestIndex]) {
                wettestIndex = i;
            }

            if (rainfall[i] == 0) {
                dryDays++;
            }
        }

        System.out.print("Rainfall (mm): ");

        for (int i = 0; i < 7; i++) {
            System.out.print(rainfall[i] + " ");
        }

        double average = total / 7;

        System.out.printf(Locale.US,
                "%n%nTotal Rainfall: %.1f mm%n", total);

        System.out.printf(Locale.US,
                "Average Rainfall: %.2f mm%n", average);

        System.out.printf(Locale.US,
                "Wettest Day: Day %d (%.1f mm)%n",
                wettestIndex + 1, rainfall[wettestIndex]);

        System.out.println("Total Dry Days: " + dryDays);

        // Time Complexity: O(7) = O(1)
        // Space Complexity: O(7) = O(1)

        sc.close();
    }
}
