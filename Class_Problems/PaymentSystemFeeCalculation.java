import java.util.Scanner;

abstract class PaymentMethod {

    public abstract double calculateAmount(double amount);

    public abstract String getName();
}

class CardPayment extends PaymentMethod {

    @Override
    public double calculateAmount(double amount) {
        return amount + (amount * 0.02);
    }

    @Override
    public String getName() {
        return "CARD";
    }
}

class WalletPayment extends PaymentMethod {

    @Override
    public double calculateAmount(double amount) {
        return amount + (amount * 0.01);
    }

    @Override
    public String getName() {
        return "WALLET";
    }
}

class BankTransferPayment extends PaymentMethod {

    @Override
    public double calculateAmount(double amount) {
        return amount;
    }

    @Override
    public String getName() {
        return "BANKTRANSFER";
    }
}

public class PaymentSystemFeeCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double amount = sc.nextDouble();

            PaymentMethod payment;

            if (type.equals("CARD")) {
                payment = new CardPayment();
            } else if (type.equals("WALLET")) {
                payment = new WalletPayment();
            } else {
                payment = new BankTransferPayment();
            }

            double adjustedAmount = payment.calculateAmount(amount);

            System.out.printf("%s: %.2f%n",
                    payment.getName(), adjustedAmount);

            total += adjustedAmount;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
