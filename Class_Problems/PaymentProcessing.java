import java.util.Scanner;

interface PaymentMode {
    double processPayment(double amount);
}

class CashPayment implements PaymentMode {

    public double processPayment(double amount) {
        return amount;
    }
}

class CardPayment implements PaymentMode {

    public double processPayment(double amount) {
        return Math.round(amount * 1.02 * 100) / 100.0;
    }
}

class UpiPayment implements PaymentMode {

    public double processPayment(double amount) {
        return amount;
    }
}

public class PaymentProcessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        int n = sc.nextInt();

        PaymentMode[] payments = new PaymentMode[n];
        String[] modes = new String[n];
        double[] amounts = new double[n];

        for (int i = 0; i < n; i++) {

            String mode = sc.next();
            double amount = sc.nextDouble();

            amounts[i] = amount;

            if (mode.equalsIgnoreCase("Cash")) {
                payments[i] = new CashPayment();
                modes[i] = "Cash";
            } else if (mode.equalsIgnoreCase("Card")) {
                payments[i] = new CardPayment();
                modes[i] = "Card";
            } else {
                payments[i] = new UpiPayment();
                modes[i] = "UPI";
            }
        }

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {

            double processed = payments[i].processPayment(amounts[i]);
            double fee = processed - amounts[i];

            System.out.println(
                modes[i] + ": amount " + amounts[i]
                + ", fee " + fee
                + ", processed " + processed
            );

            grandTotal += processed;
        }

        System.out.println(
            "Total Amount Processed: " + grandTotal
        );

        // Time Complexity: O(n)

        sc.close();
    }
}
