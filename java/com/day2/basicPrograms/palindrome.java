package com.day2.basicPrograms;

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to check for palindrome
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
