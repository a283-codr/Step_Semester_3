import java.util.Scanner;

class Staff {
    private String name;
    private double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getType() {
        return "Staff";
    }
}

class Teacher extends Staff {

    Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return 5000;
    }

    @Override
    public String getType() {
        return "Teacher";
    }
}

class LabAssistant extends Staff {

    LabAssistant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return 2000;
    }

    @Override
    public String getType() {
        return "LabAssistant";
    }
}

public class StaffSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        int n = sc.nextInt();
        Staff[] staff = new Staff[n];

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equalsIgnoreCase("Teacher")) {
                staff[i] = new Teacher(name, salary);
            } else if (type.equalsIgnoreCase("LabAssistant")) {
                staff[i] = new LabAssistant(name, salary);
            } else {
                staff[i] = new Staff(name, salary);
            }
        }

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {

            double base = staff[i].getBaseSalary();
            double bonus = staff[i].getBonus();
            double total = base + bonus;

            System.out.println(
                staff[i].getName() + " (" + staff[i].getType()
                + "): base " + base
                + ", bonus " + bonus
                + ", total " + total
            );

            grandTotal += total;
        }

        System.out.println("Grand Total Salary: " + grandTotal);

        // Time Complexity: O(n)

        sc.close();
    }
}
