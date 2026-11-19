
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class PlateStack {
    Node top;
    int size;

    PlateStack() {
        top = null;
        size = 0;
    }

    // Push a plate onto the stack
    void push(String plate) {
        Node newNode = new Node(plate);
        newNode.next = top;
        top = newNode;
        size++;

        System.out.println(
            "push " + plate + " -> top " + top.data + ", size " + size
        );
    }

    // Remove the top plate
    void pop() {
        if (isEmpty()) {
            System.out.println("pop -> stack is empty");
            return;
        }

        String plate = top.data;
        top = top.next;
        size--;

        System.out.println("pop -> " + plate + ", size " + size);
    }

    // View the top plate
    void peek() {
        if (isEmpty()) {
            System.out.println("peek -> stack is empty");
        } else {
            System.out.println("peek -> " + top.data);
        }
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }
}

public class PlateStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PlateStack stack = new PlateStack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();

            if (operation.equalsIgnoreCase("push")) {
                String plate = sc.next();
                stack.push(plate);

            } else if (operation.equalsIgnoreCase("pop")) {
                stack.pop();

            } else if (operation.equalsIgnoreCase("peek")) {
                stack.peek();

            } else if (operation.equalsIgnoreCase("isEmpty")) {
                System.out.println("isEmpty -> " + stack.isEmpty());
            }
        }

        sc.close();
    }
}

// push(): O(1)
// pop(): O(1)
// peek(): O(1)
// isEmpty(): O(1)
// Space Complexity: O(n)
