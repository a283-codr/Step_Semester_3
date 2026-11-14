import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int mark1, mark2, mark3;

    Student(String name) {
        this.name = name;
    }

    boolean setMarks(int a, int b, int c) {

        if (a < 0 || a > 100 ||
            b < 0 || b > 100 ||
            c < 0 || c > 100) {
            return false;
        }

        mark1 = a;
        mark2 = b;
        mark3 = c;

        return true;
    }

    int getTotal() {
        return mark1 + mark2 + mark3;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    String getGrade() {

        double avg = getAverage();

        if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 40)
            return "D";
        else
            return "F";
    }

    public String toString() {
        return name + " total=" + getTotal()
                + " avg=" + String.format("%.2f", getAverage())
                + " grade=" + getGrade();
    }
}

public class ClassReportCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String name = sc.next();

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Student s = new Student(name);

            if (s.setMarks(a, b, c)) {
                students.add(s);
            } else {
                System.out.println(
                    name + " skipped: marks must be 0 to 100"
                );
            }
        }

        // Bubble sort in descending order of total marks.
        int passes = 0;

        for (int i = 0; i < students.size() - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < students.size() - i - 1; j++) {

                if (students.get(j).getTotal()
                        < students.get(j + 1).getTotal()) {

                    Student temp = students.get(j);

                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);

                    swapped = true;
                }
            }

            if (!swapped)
                break;

            passes++;
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(
                (i + 1) + ". " + students.get(i)
            );
        }

        System.out.println("Sorted in " + passes + " passes");

        // Best Case: O(n)
        // Worst Case: O(n^2)

        sc.close();
    }
}
