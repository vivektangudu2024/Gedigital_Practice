package com.day2.basicPrograms;

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number to check for primality
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Output: Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, not a prime number
            }
        }

        return true; // No factors found, it's a prime number
    }
}
