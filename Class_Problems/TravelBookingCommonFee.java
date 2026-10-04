import java.util.*;

abstract class Booking {
    protected double distance;

    protected static final double BOOKING_FEE = 50;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    final double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }

    abstract String getMode();
}

class BusBooking extends Booking {
    BusBooking(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2;
    }

    String getMode() {
        return "BUS";
    }
}

class TrainBooking extends Booking {
    TrainBooking(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5;
    }

    String getMode() {
        return "TRAIN";
    }
}

class FlightBooking extends Booking {
    FlightBooking(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4;
    }

    String getMode() {
        return "FLIGHT";
    }
}

public class TravelBookingCommonFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();

            Booking booking;

            switch (mode) {
                case "BUS":
                    booking = new BusBooking(distance);
                    break;
                case "TRAIN":
                    booking = new TrainBooking(distance);
                    break;
                default:
                    booking = new FlightBooking(distance);
            }

            double amount = booking.calculateTotal();
            total += amount;

            System.out.printf("%s: %.2f%n", booking.getMode(), amount);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
