import java.util.*;

abstract class Connection {
    protected double units;

    Connection(double units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class HomeConnection extends Connection {
    HomeConnection(double units) {
        super(units);
    }

    double calculateBill() {
        if (units <= 100)
            return units * 5;

        return 500 + (units - 100) * 7;
    }
}

class ShopConnection extends Connection {
    ShopConnection(double units) {
        super(units);
    }

    double calculateBill() {
        return units * 8 + 100;
    }
}

class FactoryConnection extends Connection {
    FactoryConnection(double units) {
        super(units);
    }

    double calculateBill() {
        return Math.max(units * 6, 1000);
    }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units = sc.nextDouble();

            Connection connection;

            switch (type) {
                case "HOME":
                    connection = new HomeConnection(units);
                    break;
                case "SHOP":
                    connection = new ShopConnection(units);
                    break;
                default:
                    connection = new FactoryConnection(units);
            }

            double bill = connection.calculateBill();
            total += bill;

            System.out.printf("%s: %.2f%n", type, bill);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
