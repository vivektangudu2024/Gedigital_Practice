package com.gedigitalday1;

import java.util.*;
public class powerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("Input out of range. Please provide a value between 0 and 30.");
            return;
        }

        System.out.println("Powers of 2 that are less than or equal to 2^" + N + ":");
        int power = 1;
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
