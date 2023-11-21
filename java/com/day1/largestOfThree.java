package com.gedigitalday1;
import java.util.Scanner;
public class largestOfThree {

    private static int findLargest(int a, int b, int c) {
        // Using the ternary operator to find the maximum of three numbers
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call the function to find the largest number
        int largest = findLargest(num1, num2, num3);

        // Display the result
        System.out.println("The largest number is: " + largest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
