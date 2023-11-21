package com.gedigitalday1;
import java.util.Scanner;
public class evenOdd {

    private static boolean isEven(int num) {
        // If the remainder when divided by 2 is 0, then the number is even
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the function to check if the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
