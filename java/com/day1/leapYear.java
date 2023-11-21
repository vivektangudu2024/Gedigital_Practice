package com.gedigitalday1;
import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = s.nextInt();


        //To check if it is a 4-digit number or not
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
        }

        else {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the scanner to prevent resource leaks
        s.close();
    }

}
