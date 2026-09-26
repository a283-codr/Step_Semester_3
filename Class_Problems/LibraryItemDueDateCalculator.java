import java.time.LocalDate;
import java.util.Scanner;

abstract class LibraryItem {

    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract int getLoanDays();

    public LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26)
                .plusDays(getLoanDays());
    }

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {

    public Book(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 14;
    }
}

class DVD extends LibraryItem {

    public DVD(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {

    public Magazine(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 3;
    }
}

public class LibraryItemDueDateCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] parts = line.split(" ", 2);

            String type = parts[0];
            String title = parts[1];

            title = title.replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }

            System.out.println(
                    item.getTitle() + ": " + item.getDueDate()
            );
        }

        sc.close();
    }
}
