package assignment_Problems;

public class StringParameter {

    public static void displayMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        String studentName = "Abhinav";
        displayMessage(studentName);
    }
}