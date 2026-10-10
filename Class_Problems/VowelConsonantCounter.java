import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int vowels = 0, consonants = 0;

        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
