package assignment_Problems;

public class AsciiCharacter {

    public static void displayAsciiCode(char character) {
        int asciiCode = character;

        System.out.println("Character: " + character);
        System.out.println("ASCII Code: " + asciiCode);
    }

    public static void main(String[] args) {
        char character = 'A';

        displayAsciiCode(character);
    }
}