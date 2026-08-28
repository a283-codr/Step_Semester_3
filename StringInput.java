import java.util.Scanner;

public class StringInput {

    public static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);

        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}