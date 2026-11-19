
import java.util.Scanner;

public class HostelElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rooms = sc.nextInt();
        int roomsBilled = 0;
        int grandTotal = 0;

        for (int i = 0; i < rooms; i++) {
            String roomNumber = sc.next();
            int units = sc.nextInt();

            if (units < 0) {
                System.out.println(roomNumber + ": invalid reading");
                continue;
            }

            int bill;

            if (units <= 100) {
                bill = units * 3 + 50;
            } else if (units <= 200) {
                bill = 100 * 3 + (units - 100) * 5 + 50;
            } else {
                bill = 100 * 3 + 100 * 5
                    + (units - 200) * 8 + 50;
            }

            System.out.println(
                roomNumber + ": " + units + " units, bill " + bill
            );

            roomsBilled++;
            grandTotal += bill;
        }

        System.out.println(
            "Rooms billed " + roomsBilled + ", total " + grandTotal
        );

        sc.close();
    }
}

// Time Complexity: O(n)
