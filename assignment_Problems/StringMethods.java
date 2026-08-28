package assignment_Problems;

public class StringMethods {

    public static void useStringMethods() {
        String text = "Hello Java";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Contains Java: " + text.contains("Java"));
    }

    public static void main(String[] args) {
        useStringMethods();
    }
}