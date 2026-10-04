import java.util.*;

abstract class LateFineItem {
    protected String title;
    protected int daysLate;

    LateFineItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double calculateFine();
}

class LateBookItem extends LateFineItem {
    LateBookItem(String title, int daysLate) {
        super(title, daysLate);
    }

    double calculateFine() {
        return daysLate * 2;
    }
}

class LateDVDItem extends LateFineItem {
    LateDVDItem(String title, int daysLate) {
        super(title, daysLate);
    }

    double calculateFine() {
        return Math.min(daysLate * 5, 50);
    }
}

class LateMagazineItem extends LateFineItem {
    LateMagazineItem(String title, int daysLate) {
        super(title, daysLate);
    }

    double calculateFine() {
        return daysLate;
    }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int daysLate = sc.nextInt();

            LateFineItem item;

            switch (type) {
                case "BOOK":
                    item = new LateBookItem(title, daysLate);
                    break;
                case "DVD":
                    item = new LateDVDItem(title, daysLate);
                    break;
                default:
                    item = new LateMagazineItem(title, daysLate);
            }

            double fine = item.calculateFine();
            total += fine;

            System.out.printf("%s: %.2f%n", item.title, fine);
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}
