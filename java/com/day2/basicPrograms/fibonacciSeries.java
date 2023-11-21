package com.day2.basicPrograms;

import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Output: Generate and print the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);

        // Close the scanner
        scanner.close();
    }

    private static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
