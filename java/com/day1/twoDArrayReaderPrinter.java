package com.gedigitalday1;

import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class twoDArrayReaderPrinter {

    // Function to read a 2D array of integers
    private static int[][] readIntArray(int rows, int cols, Scanner scanner) {
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    // Function to print a 2D array of integers
    private static void printIntArray(int[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);
        writer.println("2D Array (Integers):");
        for (int[] row : array) {
            for (int element : row) {
                writer.print(element + "\t");
            }
            writer.println();
        }
    }

    // Function to read a 2D array of doubles
    private static double[][] readDoubleArray(int rows, int cols, Scanner scanner) {
        double[][] array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }

    // Function to print a 2D array of doubles
    private static void printDoubleArray(double[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);
        writer.println("2D Array (Doubles):");
        for (double[] row : array) {
            for (double element : row) {
                writer.print(element + "\t");
            }
            writer.println();
        }
    }

    // Function to read a 2D array of booleans
    private static boolean[][] readBooleanArray(int rows, int cols, Scanner scanner) {
        boolean[][] array = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextBoolean();
            }
        }
        return array;
    }

    // Function to print a 2D array of booleans
    private static void printBooleanArray(boolean[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);
        writer.println("2D Array (Booleans):");
        for (boolean[] row : array) {
            for (boolean element : row) {
                writer.print(element + "\t");
            }
            writer.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int cols = scanner.nextInt();

        // Input the type of data (1 for integers, 2 for doubles, 3 for booleans)
        System.out.println("Choose the type of data:");
        System.out.println("1. Integers");
        System.out.println("2. Doubles");
        System.out.println("3. Booleans");
        int dataTypeChoice = scanner.nextInt();

        // Input the 2D array
        System.out.println("Enter the elements of the 2D array:");

        // Create a 2D array based on the data type
        switch (dataTypeChoice) {
            case 1:
                int[][] intArray = readIntArray(rows, cols, scanner);
                printIntArray(intArray);
                break;
            case 2:
                double[][] doubleArray = readDoubleArray(rows, cols, scanner);
                printDoubleArray(doubleArray);
                break;
            case 3:
                boolean[][] booleanArray = readBooleanArray(rows, cols, scanner);
                printBooleanArray(booleanArray);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

}
