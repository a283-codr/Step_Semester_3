import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4_EmployeeIDLookup {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Aarav");
        employees.put(102, "Meera");
        employees.put(103, "Rohan");
        employees.put(104, "Priya");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        if (employees.containsKey(id)) {
            System.out.println("Employee: " + employees.get(id));
        } else {
            System.out.println("Employee ID not found.");
        }
        sc.close();
    }
}