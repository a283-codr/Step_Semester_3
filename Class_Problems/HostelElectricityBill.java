import java.util.Scanner;

public class HostelElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        int n = sc.nextInt();

        int roomsBilled = 0;
        int grandTotal = 0;

        for (int i = 0; i < n; i++) {

            String room = sc.next();
            int units = sc.nextInt();

            if (units < 0) {

                System.out.println(room + ": invalid reading");

            } else {

                int bill;

                if (units <= 100) {
                    bill = units * 3 + 50;

                } else if (units <= 200) {
                    bill = 100 * 3
                            + (units - 100) * 5 + 50;

                } else {
                    bill = 100 * 3
                            + 100 * 5
                            + (units - 200) * 8 + 50;
                }

                System.out.println(
                    room + ": " + units + " units, bill " + bill
                );

                grandTotal += bill;
                roomsBilled++;
            }
        }

        System.out.println(
            "Rooms billed " + roomsBilled
            + ", total " + grandTotal
        );

        // Time Complexity: O(n)

        sc.close();
    }
}
