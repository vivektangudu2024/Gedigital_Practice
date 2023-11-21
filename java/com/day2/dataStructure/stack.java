package com.day2.dataStructure;

import java.util.*;
class Stack {
    private static final int MAX_SIZE = 100;
    private int top;
    private int[] array;

    public Stack() {
        top = -1;
        array = new int[MAX_SIZE];
    }

    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow: Cannot push element. Stack is full.");
        } else {
            array[++top] = value;
            System.out.println(value + " pushed to the stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element. Stack is empty.");
        } else {
            int poppedValue = array[top--];
            System.out.println(poppedValue + " popped from the stack.");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
