package com.day1;
import java.util.Scanner;
public class consonantVowel {
    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        // Check if the character is one of the vowels (a, e, i, o, u)
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single alphabet character
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Check if the entered character is a vowel or a consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
