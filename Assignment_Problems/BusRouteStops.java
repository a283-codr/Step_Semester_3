
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class BusRouteStops {

    // Build the linked list
    static Node build(String[] stops) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < stops.length; i++) {
            Node newNode = new Node(stops[i]);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Print the route
    static void printRoute(Node head) {
        Node current = head;
        int count = 0;
        String first = "";
        String last = "";

        while (current != null) {
            System.out.print(current.data + " -> ");

            if (count == 0) {
                first = current.data;
            }

            last = current.data;
            count++;

            current = current.next;
        }

        System.out.println("null");

        System.out.println(
            "Stops: " + count + ", First: " + first + ", Last: " + last
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] stops = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        Node head = build(stops);

        printRoute(head);

        sc.close();
    }
}

// Building Time Complexity: O(n)
// Printing Time Complexity: O(n)
// Auxiliary Space Complexity: O(1)
