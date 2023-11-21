package com.gedigitalday1;
import java.util.Scanner;
public class swapNumbers {
    // Function to swap two numbers using references (though Java is pass-by-value, so the original numbers won't be swapped)
    private static void swap(int x, int y) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the original numbers
        System.out.println("Original numbers: ");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        num1 = num1 ^ num2 ^ (num2 = num1);
        System.out.println("After swapping  ");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);



        // Close the scanner to prevent resource leaks
        scanner.close();
    }



}
