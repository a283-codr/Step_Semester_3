public class HackathonSeatingGridOptimizer {

    private static double rowAverage(int[] row) {

        int total = 0;

        for (int score : row) {
            total += score;
        }

        return (double) total / row.length;
    }

    public static String classifyRows(int[][] seatingScores, int threshold) {

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result += "Row " + i + ": Quiet Zone";
            } else {
                result += "Row " + i + ": Buzzing Zone";
            }

            if (i < seatingScores.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {50, 60, 55},
            {80, 90, 85},
            {40, 45, 50, 55}
        };

        int threshold = 65;

        System.out.println(classifyRows(seatingScores, threshold));
    }
}