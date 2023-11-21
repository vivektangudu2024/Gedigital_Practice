package com.gedigitalday1;

import java.util.*;
public class flipCoin {
    public static void main(String[] args) {

        /*Scanner class to take input
         Scanner class must be instantiated using  Scanner Constructor with System.in as parameter
         System.in - denotes that input has to be taken from the keyboard */
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin");
        int n= s.nextInt();
        if(n<=0){
            System.out.println("Number of flips should be a positive number");
            return ;
        }

        int h_count=0, t_count=0;
        /*Random class to generate random number between 0 and 1*/
        Random r= new Random();
        double rand = 0;

        for(int i=0; i<n; i++){

            rand=r.nextDouble();
            System.out.println("Value "+rand);

            if(rand <0.5) t_count++;
            else {
                h_count++;
            }

        }

        double head_percentage = (double) h_count/n*100;
        double tail_percentage = (double) t_count/n*100;
        System.out.println("Percentage of heads vs tails "+head_percentage+ "% vs"+tail_percentage+"%");

        // Close the scanner to prevent resource leaks
        s.close();
    }
}
