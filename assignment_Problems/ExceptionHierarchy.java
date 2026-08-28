package assignment_Problems;

public class ExceptionHierarchy {

    public static void handleException() {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[5];

            System.out.println("Result: " + result);
        } catch (RuntimeException exception) {
            System.out.println("Runtime exception occurred.");
        } catch (Exception exception) {
            System.out.println("Exception occurred.");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}