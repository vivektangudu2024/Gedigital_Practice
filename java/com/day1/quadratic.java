package com.gedigitalday1;

import java.util.*;
public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (delta)
        double delta = b * b - 4 * a * c;

        // Check if roots are real or complex
        if (delta > 0) {
            // Roots are real and distinct
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 of x: " + root1);
            System.out.println("Root 2 of x: " + root2);
        } else if (delta == 0) {
            // Roots are real and equal
            double root = -b / (2 * a);
            System.out.println("Root of x: " + root);
        } else {
            // Roots are complex
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);

            System.out.println("Root 1 of x: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 of x: " + realPart + " - " + imaginaryPart + "i");
        }

        // Close the scanner
        scanner.close();
    }
}
