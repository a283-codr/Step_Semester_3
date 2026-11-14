import java.util.HashSet;
import java.util.Set;

public class Problem5_PairWithTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;
        Set<Integer> seen = new HashSet<>();
        boolean found = false;

        for (int number : numbers) {
            int needed = target - number;

            if (seen.contains(needed)) {
                System.out.println("Pair: " + needed + " and " + number);
                found = true;
                break;
            }
            seen.add(number);
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}