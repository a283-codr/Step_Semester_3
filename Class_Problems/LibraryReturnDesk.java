import java.util.Scanner;

public class LibraryReturnDesk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RA2511026011337");

        String[] pile = new String[3];
        String[] queue = new String[3];

        int top = -1;
        int front = 0;
        int rear = 0;
        int size = 0;

        int commands = sc.nextInt();

        for (int i = 0; i < commands; i++) {

            String command = sc.next().replace(",", "").toUpperCase();

            if (command.equals("RETURN")) {

                String book = sc.next().replace(",", "");

                if (top == 2) {
                    System.out.println(book + " rejected: pile is full");
                } else {
                    pile[++top] = book;
                    System.out.println(book + " placed on pile");
                }

            } else if (command.equals("SHELVE")) {

                if (top == -1) {
                    System.out.println("pile is empty");
                } else {
                    System.out.println("shelved " + pile[top]);
                    pile[top] = null;
                    top--;
                }

            } else if (command.equals("WAIT")) {

                String student = sc.next().replace(",", "");

                if (size == 3) {
                    System.out.println(student + " rejected: line is full");
                } else {
                    queue[rear] = student;
                    rear = (rear + 1) % 3;
                    size++;

                    System.out.println(student + " joined the line");
                }

            } else if (command.equals("SERVE")) {

                if (size == 0) {
                    System.out.println("no one waiting");
                } else {
                    System.out.println("served " + queue[front]);

                    queue[front] = null;
                    front = (front + 1) % 3;
                    size--;
                }
            }
        }

        // Stack operations: O(1)
        // Circular queue operations: O(1)
        // Total time for n commands: O(n)

        sc.close();
    }
}
