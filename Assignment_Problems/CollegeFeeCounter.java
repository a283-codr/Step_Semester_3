abstract class Student {
    protected String name;

    protected static final double TUITION = 40000;
    protected static final double TRANSPORT_FEE = 12000;

    Student(String name) {
        this.name = name;
    }

    abstract double calculateFee();
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    double calculateFee() {
        return TUITION + TRANSPORT_FEE;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double calculateFee() {
        return TUITION + 60000;
    }
}

class ScholarshipStudent extends Student {
    ScholarshipStudent(String name) {
        super(name);
    }

    double calculateFee() {
        return (TUITION / 2) + TRANSPORT_FEE;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student student;

            switch (type) {
                case "DAY_SCHOLAR":
                    student = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    student = new Hosteller(name);
                    break;
                default:
                    student = new ScholarshipStudent(name);
            }

            double fee = student.calculateFee();
            total += fee;

            System.out.printf("%s: %.2f%n", student.name, fee);
        }

        System.out.printf("Total Collected: %.2f%n", total);

        sc.close();
    }
}
