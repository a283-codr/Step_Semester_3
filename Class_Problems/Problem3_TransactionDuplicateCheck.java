import java.util.HashSet;
import java.util.Set;

public class Problem3_TransactionDuplicateCheck {
    public static void main(String[] args) {
        int[] transactions = {1001, 1002, 1003, 1002, 1004, 1001};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int id : transactions) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }

        System.out.println("Transactions contain duplicates: " + !duplicates.isEmpty());
        System.out.println("Duplicate transaction IDs: " + duplicates);
    }
}