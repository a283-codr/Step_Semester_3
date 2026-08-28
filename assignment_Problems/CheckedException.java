package assignment_Problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void readFile() {
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("File opened successfully.");

            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File was not found.");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}