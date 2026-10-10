import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean prime = number > 1;

        for (int i = 2; i <= number / i && prime; i++) {
            if (number % i == 0) prime = false;
        }

        System.out.println(prime ? "Prime" : "Not prime");
        sc.close();
    }
}
