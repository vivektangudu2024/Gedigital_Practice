package com.day2.strings;

import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: String to be reversed
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        //inputString += "Great";
        // Output: Reverse the string and print the result
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from start to end
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }
}
