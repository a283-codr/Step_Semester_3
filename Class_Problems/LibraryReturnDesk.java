import java.util.Scanner;

public class LibraryReturnDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pile = new String[3];
        String[] line = new String[3];

        int top = -1;
        int front = 0;
        int rear = 0;
        int size = 0;

        StringBuilder commands = new StringBuilder();

        while (sc.hasNextLine()) {
            commands.append(sc.nextLine()).append(",");
        }

        String[] allCommands = commands.toString().split(",");

        for (String command : allCommands) {
            command = command.trim();

            if (command.isEmpty()) continue;

            String[] parts = command.split("\\s+", 2);
            String action = parts[0].toUpperCase();

            if (action.equals("RETURN")) {
                if (top == 2) {
                    System.out.println(parts[1] + " rejected: pile is full");
                } else {
                    pile[++top] = parts[1];
                    System.out.println(parts[1] + " placed on pile");
                }
            } 
            else if (action.equals("SHELVE")) {
                if (top == -1) {
                    System.out.println("pile is empty");
                } else {
                    System.out.println("shelved " + pile[top]);
                    pile[top--] = null;
                }
            } 
            else if (action.equals("WAIT")) {
                if (size == 3) {
                    System.out.println(parts[1] + " rejected: line is full");
                } else {
                    line[rear] = parts[1];
                    rear = (rear + 1) % 3;
                    size++;
                    System.out.println(parts[1] + " joined the line");
                }
            } 
            else if (action.equals("SERVE")) {
                if (size == 0) {
                    System.out.println("no one waiting");
                } else {
                    System.out.println("served " + line[front]);
                    line[front] = null;
                    front = (front + 1) % 3;
                    size--;
                }
            } 
            else {
                System.out.println("Invalid command: " + command);
            }
        }

        sc.close();
    }
}