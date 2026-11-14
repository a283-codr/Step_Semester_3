import java.util.Scanner;

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int total = 0;

        for (int i = 0; i < 3; i++) total += sc.nextInt();

        double average = total / 3.0;
        char grade;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';

        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(), average, grade);
        sc.close();
    }
}
