
import java.util.Scanner;

public class LibraryReturnDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pile = new String[3];
        String[] line = new String[3];

        int top = -1;
        int front = 0;
        int rear = -1;
        int size = 0;

        sc.useDelimiter("[,\\r\\n]+");

        while (sc.hasNext()) {
            String command = sc.next().trim();

            if (command.isEmpty()) {
                continue;
            }

            String[] parts = command.split("\\s+", 2);
            String operation = parts[0].toUpperCase();

            if (operation.equals("RETURN")) {
                String book = parts[1];

                if (top == 2) {
                    System.out.println(book + " rejected: pile is full");
                } else {
                    pile[++top] = book;
                    System.out.println(book + " placed on pile");
                }

            } else if (operation.equals("SHELVE")) {
                if (top == -1) {
                    System.out.println("pile is empty");
                } else {
                    System.out.println("shelved " + pile[top]);
                    pile[top] = null;
                    top--;
                }

            } else if (operation.equals("WAIT")) {
                String student = parts[1];

                if (size == 3) {
                    System.out.println(student + " rejected: line is full");
                } else {
                    rear = (rear + 1) % 3;
                    line[rear] = student;
                    size++;

                    System.out.println(student + " joined the line");
                }

            } else if (operation.equals("SERVE")) {
                if (size == 0) {
                    System.out.println("no one waiting");
                } else {
                    System.out.println("served " + line[front]);
                    line[front] = null;
                    front = (front + 1) % 3;
                    size--;
                }
            }
        }

        sc.close();
    }
}

// Time Complexity: O(1) per operation
