package assignment_Problems;

public class JavaExceptions {

    public static void divideNumbers(int firstNumber, int secondNumber) {
        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 0;

        divideNumbers(firstNumber, secondNumber);
    }
}