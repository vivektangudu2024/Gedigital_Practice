package com.day2.array;

import java.util.*;
public class largestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Find and print the largest element
        int largestElement = findLargestElement(array);
        System.out.println("The largest element in the array is: " + largestElement);

        // Close the scanner
        scanner.close();
    }

    private static int findLargestElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }
}
