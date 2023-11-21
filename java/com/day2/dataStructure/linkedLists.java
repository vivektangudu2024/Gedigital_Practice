package com.day2.dataStructure;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class linkedLists {
    private Node head;

    public linkedLists() {
        this.head = null;
    }

    // Insert a node at the start of the linked list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Remove a node from the start of the linked list
    public void removeFromStart() {
        if (head != null) {
            head = head.next;
        }
    }

    // Remove a node from the end of the linked list
    public void removeFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Remove a node at a specific index in the linked list
    public void removeAtIndex(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            removeFromStart();
            return;
        }

        Node current = head;
        int count = 0;
        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Invalid index");
            return;
        }

        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedLists linkedList = new linkedLists();

        // Insert at start
        linkedList.insertAtStart(3);
        linkedList.insertAtStart(2);
        linkedList.insertAtStart(1);
        System.out.println("Linked List after insert at start:");
        linkedList.display();

        // Insert at end
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        System.out.println("Linked List after insert at end:");
        linkedList.display();

        // Remove from start
        linkedList.removeFromStart();
        System.out.println("Linked List after remove from start:");
        linkedList.display();

        // Remove from end
        linkedList.removeFromEnd();
        System.out.println("Linked List after remove from end:");
        linkedList.display();

        // Remove at index
        linkedList.removeAtIndex(1);
        System.out.println("Linked List after remove at index 1:");
        linkedList.display();
    }
}
