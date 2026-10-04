interface NightService {
    double nightFare(double fare);
}

abstract class Cab {
    protected double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRate();
    abstract String getType();

    final double calculateBaseFare() {
        return Math.max(km * getRate(), 100);
    }
}

class MiniCab extends Cab {
    MiniCab(double km) {
        super(km);
    }

    double getRate() {
        return 10;
    }

    String getType() {
        return "MINI";
    }
}

class SedanCab extends Cab implements NightService {
    SedanCab(double km) {
        super(km);
    }

    double getRate() {
        return 14;
    }

    String getType() {
        return "SEDAN";
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

class SUVCab extends Cab implements NightService {
    SUVCab(double km) {
        super(km);
    }

    double getRate() {
        return 18;
    }

    String getType() {
        return "SUV";
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab cab;

            switch (type) {
                case "MINI":
                    cab = new MiniCab(km);
                    break;
                case "SEDAN":
                    cab = new SedanCab(km);
                    break;
                default:
                    cab = new SUVCab(km);
            }

            if (time.equals("NIGHT") && !(cab instanceof NightService)) {
                System.out.println(cab.getType() +
                    ": night service not available");
                continue;
            }

            double fare = cab.calculateBaseFare();

            if (time.equals("NIGHT")) {
                fare = ((NightService) cab).nightFare(fare);
            }

            total += fare;

            System.out.printf("%s: %.2f%n", cab.getType(), fare);
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
