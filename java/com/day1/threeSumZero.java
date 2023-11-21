package com.gedigitalday1;

import java.util.*;
public class threeSumZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Input: Array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Output: Display the entered array
        System.out.print("The entered array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }



        // Output: Number of distinct triplets and the distinct triplets themselves
        findTriplets(array);

        // Close the scanner
        scanner.close();
    }

    private static void findTriplets(int[] array) {
        int count = 0;

        Arrays.sort(array); // Sort the array to make it easier to find distinct triplets

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            int currentNum = array[i];

            while (left < right) {
                int sum = currentNum + array[left] + array[right];

                if (sum == 0) {
                    // Found a triplet
                    System.out.println("Triplet: " + currentNum + ", " + array[left] + ", " + array[right]);
                    count++;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("Number of distinct triplets: " + count);
    }
}
