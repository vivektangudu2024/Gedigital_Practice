package com.day2.array;

import java.util.*;
public class equalSumDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        // Check if the array has an even number of elements
        if (size % 2 != 0) {
            System.out.println("Array should have an even number of elements for this program.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = scanner.nextInt();
        }



        // Output: Calculate and check the sum of the first half and second half
        boolean isEqual = checkEqualHalfSums(array);
        if (isEqual) {
            System.out.println("The sum of the first half is equal to the sum of the second half.");
        } else {
            System.out.println("The sum of the first half is not equal to the sum of the second half.");
        }

        // Close the scanner
        scanner.close();
    }

    private static boolean checkEqualHalfSums(int[] array) {
        int length = array.length;
        int half = length / 2;

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        // Calculate the sum of the first half
        for (int i = 0; i < half; i++) {
            firstHalfSum += array[i];
        }

        // Calculate the sum of the second half
        for (int i = half; i < length; i++) {
            secondHalfSum += array[i];
        }

        // Check if the sums are equal
        return firstHalfSum == secondHalfSum;
    }
}
