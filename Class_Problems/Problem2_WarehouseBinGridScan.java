public class Problem2_WarehouseBinGridScan {
    public static void main(String[] args) {
        int[][] bins = {
            {4, 8, 2},
            {10, 3, 6},
            {5, 12, 7}
        };

        int total = 0;
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < bins.length; i++) {
            for (int j = 0; j < bins[i].length; j++) {
                total += bins[i][j];

                if (bins[i][j] > max) {
                    max = bins[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Total inventory: " + total);
        System.out.println("Maximum bin value: " + max);
        System.out.println("Position: row " + maxRow + ", column " + maxCol);
    }
}