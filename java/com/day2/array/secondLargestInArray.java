package com.day2.array;

import java.util.*;
public class secondLargestInArray {
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

        // Output: Find and print the second largest element
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest element in the array is: " + secondLargest);

        // Close the scanner
        scanner.close();
    }

    private static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return a special value to indicate an error or absence of a second largest element
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
