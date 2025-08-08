// Main class to demonstrate the LinkedList functionality

public class Main {
    public static void main(String[] args) {
        LinkedList waitlist = new LinkedList();

        // Adding regular customers
        waitlist.addCustomer("Alice", "Party of 2");
        waitlist.addCustomer("Bob", "Party of 3");

        // Adding VIP customers
        waitlist.addVIPCustomer("VIP Charlie", "Party of 1");
        waitlist.addVIPCustomer("VIP Dave", "Party of 4");

        // Adding another regular customer
        waitlist.addCustomer("Eve", "Party of 2");

        // Displaying the final waitlist
        waitlist.printList();
    }
}

// Private static Node class to represent each customer in the waitlist
private static class Node {
    String name;    // Customer's name
    String details; // Additional details (e.g., party size)
    Node next;      // Reference to the next customer in the list

    // Constructor to initialize the node with customer information
    Node(String name, String details) {
        this.name = name;
        this.details = details;
        this.next = null;
    }
}

// LinkedList class to manage the customer waitlist
class LinkedList {
    Node head; // Reference to the first customer in the waitlist

    // Constructor to initialize an empty waitlist
    LinkedList() {
        this.head = null;
    }

    /**
     * Method to add a regular customer to the end of the waitlist.
     *
     * @param name    The name of the customer.
     * @param details Additional details about the customer (e.g., party size).
     */
    void addCustomer(String name, String details) {
        Node newNode = new Node(name, details); // Step 1: Create a new node for the customer

        if (head == null) {
            // If the waitlist is empty, the new customer becomes the head
            head = newNode;
        } else {
            // Otherwise, traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node at the end
            current.next = newNode;
        }
    }

    /**
     * Method to add a VIP customer at the beginning of the waitlist.
     *
     * @param name    The name of the VIP customer.
     * @param details Additional details about the VIP customer.
     */
    void addVIPCustomer(String name, String details) {
        // Step 1: Create a new node for the VIP customer
        Node newNode = new Node(name, details);

        // Step 2: Link the new node to the current head of the list
        newNode.next = head;

        // Step 3: Update the head to the new node, making it the first in the list
        head = newNode;
    }

    /**
     * Method to print the current state of the waitlist.
     */
    void printList() {
        Node current = head; // Start from the head of the list
        while (current != null) {
            // Print the current customer's information
            System.out.print(current.name + " (" + current.details + ")");
            current = current.next; // Move to the next customer

            // If there are more customers, print an arrow for clarity
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        // Indicate the end of the list
        System.out.println(" -> null");
    }
}
