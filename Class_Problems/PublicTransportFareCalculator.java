import java.util.Scanner;

abstract class Transport {

    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();

    public abstract String getName();
}

class Bus extends Transport {

    public Bus(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {

        double fare = 2 + (0.10 * distance);

        return Math.min(fare, 10);
    }

    @Override
    public String getName() {
        return "BUS";
    }
}

class Train extends Transport {

    public Train(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 3 + (0.15 * distance);
    }

    @Override
    public String getName() {
        return "TRAIN";
    }
}

class Metro extends Transport {

    private double peakHourFactor;

    public Metro(
            double distance,
            double peakHourFactor) {

        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    @Override
    public double calculateFare() {

        return (1.50 + (0.20 * distance))
                * peakHourFactor;
    }

    @Override
    public String getName() {
        return "METRO";
    }
}

public class PublicTransportFareCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();

            Transport transport;

            if (type.equals("BUS")) {

                transport = new Bus(distance);

            } else if (type.equals("TRAIN")) {

                transport = new Train(distance);

            } else {

                double peakHourFactor = sc.nextDouble();

                transport = new Metro(
                        distance,
                        peakHourFactor);
            }

            double fare = transport.calculateFare();

            System.out.printf(
                    "%s: %.2f%n",
                    transport.getName(),
                    fare);

            total += fare;
        }

        System.out.printf(
                "Total: %.2f%n",
                total);

        sc.close();
    }
}
