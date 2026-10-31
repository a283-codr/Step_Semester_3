import java.util.Arrays;

public class AssignmentProblem3 {

    static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;

            System.out.println("After placing " + key + ": "
                    + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        int[] books1 = {30, 10, 40, 20};

        System.out.println("Sample Input: [30, 10, 40, 20]");
        shelf(books1);

        System.out.println();

        int[] books2 = {5, 3, 8, 1};

        System.out.println("Custom Input: [5, 3, 8, 1]");
        shelf(books2);
    }
}