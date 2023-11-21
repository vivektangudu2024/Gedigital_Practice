package com.gedigitalday1;

import java.util.*;
public class quotientRemainder {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend= s.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor= s.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;

        System.out.println("Quotient is "+quotient );
        System.out.println("Remainder is "+remainder);

        // Close the scanner to prevent resource leaks
        s.close();
    }
}
