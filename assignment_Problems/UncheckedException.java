package assignment_Problems;

public class UncheckedException {

    public static void accessArray() {
        try {
            int[] numbers = {10, 20, 30};
            int value = numbers[5];

            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index.");
        }
    }

    public static void main(String[] args) {
        accessArray();
    }
}