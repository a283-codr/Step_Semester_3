
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class CancelBooking {

    static Node removeFirst(Node head, String booking) {

        // If the first node contains the booking
        if (head != null && head.data.equals(booking)) {
            return head.next;
        }

        Node current = head;

        // Find the node before the matching booking
        while (current != null && current.next != null) {

            if (current.next.data.equals(booking)) {
                current.next = current.next.next;
                return head;
            }

            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create the linked list
        for (int i = 0; i < n; i++) {
            String booking = sc.next();

            Node newNode = new Node(booking);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        String cancel = sc.next();

        // Check whether the booking exists
        boolean found = false;
        Node temp = head;

        while (temp != null) {
            if (temp.data.equals(cancel)) {
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println(cancel + " not found");
        } else {
            head = removeFirst(head, cancel);
        }

        // Display the updated linked list
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

        sc.close();
    }
}

// Time Complexity:
// Booking at head: O(1)
// Booking at end: O(n)
