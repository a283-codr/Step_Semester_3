import java.util.Scanner;
import java.util.Arrays;

public class InPlaceArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) numbers[i] = sc.nextInt();

        for (int left = 0, right = n - 1; left < right; left++, right--) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }

        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
