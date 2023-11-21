package com.day2.algorithm;

import java.util.*;
public class sortingAlgorithms {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        int[] bubbleSortedArray = Arrays.copyOf(array, array.length);
        bubbleSort(bubbleSortedArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortedArray));

        // Insertion Sort
        int[] insertionSortedArray = Arrays.copyOf(array, array.length);
        insertionSort(insertionSortedArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionSortedArray));

        // Selection Sort
        int[] selectionSortedArray = Arrays.copyOf(array, array.length);
        selectionSort(selectionSortedArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSortedArray));

        // Merge Sort
        int[] mergeSortedArray = Arrays.copyOf(array, array.length);
        mergeSort(mergeSortedArray, 0, mergeSortedArray.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(mergeSortedArray));
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Merge Sort
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(arr, middle + 1, middle + 1 + n2);

        // Merge the temporary arrays

        // Initial indexes of the subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
