package assignment_Problems;

public class ExceptionTypes {

    public static void checkException() {
        try {
            String text = "Hello";
            int number = Integer.parseInt(text);

            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number format.");
        }
    }

    public static void main(String[] args) {
        checkException();
    }
}