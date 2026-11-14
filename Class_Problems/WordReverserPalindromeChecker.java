import java.util.Scanner;

public class WordReverserPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Reversed: " + reversed);
        System.out.println(word.equalsIgnoreCase(reversed)
                ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}
