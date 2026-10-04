interface SaverMode {
    double applySaver(double units);
}

abstract class Appliance {
    protected double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double getPower();
    abstract String getName();

    final double calculateUnits() {
        return getPower() * hours / 1000;
    }
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    double getPower() {
        return 150;
    }

    String getName() {
        return "FRIDGE";
    }
}

class AirConditioner extends Appliance implements SaverMode {
    AirConditioner(double hours) {
        super(hours);
    }

    double getPower() {
        return 1500;
    }

    String getName() {
        return "AC";
    }

    public double applySaver(double units) {
        return units * 0.75;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    double getPower() {
        return 100;
    }

    String getName() {
        return "TV";
    }
}

class WashingMachine extends Appliance implements SaverMode {
    WashingMachine(double hours) {
        super(hours);
    }

    double getPower() {
        return 500;
    }

    String getName() {
        return "WASHER";
    }

    public double applySaver(double units) {
        return units * 0.75;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            Appliance appliance;

            switch (type) {
                case "FRIDGE":
                    appliance = new Fridge(hours);
                    break;
                case "AC":
                    appliance = new AirConditioner(hours);
                    break;
                case "TV":
                    appliance = new TV(hours);
                    break;
                default:
                    appliance = new WashingMachine(hours);
            }

            if (saver && !(appliance instanceof SaverMode)) {
                System.out.println(
                    appliance.getName() +
                    ": saver mode not supported"
                );
                continue;
            }

            double units = appliance.calculateUnits();

            if (saver) {
                units = ((SaverMode) appliance).applySaver(units);
            }

            double cost = units * 8;
            totalCost += cost;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                appliance.getName(), units, cost
            );
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);

        sc.close();
    }
}
