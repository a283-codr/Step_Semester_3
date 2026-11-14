import java.util.Arrays;

public class Problem10_RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = numbers.length;

        if (length == 0) {
            System.out.println("No elements.");
            return;
        }

        int unique = 1;

        for (int i = 1; i < length; i++) {
            if (numbers[i] != numbers[unique - 1]) {
                numbers[unique] = numbers[i];
                unique++;
            }
        }

        System.out.println("Unique count: " + unique);
        System.out.println("Unique elements: " +
            Arrays.toString(Arrays.copyOf(numbers, unique)));
    }
}