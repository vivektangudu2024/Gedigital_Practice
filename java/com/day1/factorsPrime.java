package com.gedigitalday1;

import java.util.*;
public class factorsPrime {
    private static void primeFactors(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        /* n must be odd at this point. So we can skip one element
         (i = i + 2) in the loop because even numbers can't be prime*/

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // Handle the case when n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= s.nextInt();

        System.out.print("Prime factors of " + n + " are: ");
        primeFactors(n);

        // Close the scanner to prevent resource leaks
        s.close();
    }
}
