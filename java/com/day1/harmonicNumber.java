package com.gedigitalday1;

import java.util.*;
public class harmonicNumber {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.print("Enter the harmonic value N ");
        int n= s.nextInt();
        if(n<=0){
            System.out.println("Number should be a positive number");
            return ;
        }

        double result = 0;

        for(int i=1; i<=n; i++){

            result+= 1.0/i;

        }

        System.out.println("The "+n+"th Harmonic value is "+result);

        // Close the scanner to prevent resource leaks
        s.close();
    }
}
