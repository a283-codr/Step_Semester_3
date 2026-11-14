import java.util.Arrays;
import java.util.Scanner;

public class Problem1_LibraryCatalogLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] isbn = {101, 205, 310, 425, 560, 678};
        System.out.println("ISBN Catalog: " + Arrays.toString(isbn));
        System.out.print("Enter ISBN to search: ");
        int target = sc.nextInt();

        int index = Arrays.binarySearch(isbn, target);

        if (index >= 0) {
            System.out.println("ISBN found at index: " + index);
        } else {
            System.out.println("ISBN not found.");
        }
        sc.close();
    }
}