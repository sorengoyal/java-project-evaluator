package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		// Get user inputed UPC code
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank to quit): ");
		String UPC = keyboard.nextLine();
		// While the user has not inputed a blank line
		while (UPC.length() > 0) {
			// If UPC code is length 12, run the algorithm
			if (UPC.length() == 12) {
				// Initialize variables
				int i = 0;
				int j = 1;
				int firstSum = 0;
				int secondSum = 0;
				int checkDigitGuess = 0;
				int checkDigit = 0;
				// Sum all numbers in odd positions
				while (i < 11) {
					int odd = Character.getNumericValue(UPC.charAt(i));
					firstSum = firstSum + odd;
					i = i + 2;
				}
				// Multiply the sum by three to complete first algorithm step
				int firstCheck = 3 * firstSum;
				// Sum all numbers in even positions
				while (j < 10) {
					int even = Character.getNumericValue(UPC.charAt(j));
					secondSum = secondSum + even;
					j = j + 2;
				}
				// Add the second sum to the first step to complete second algorithm step
				int secondCheck = firstCheck + secondSum;
				// If the remainder is not zero, change check digit to 10 - remainder
				if (secondCheck % 10 != 0) {
					checkDigitGuess = 10 - (secondCheck % 10);
				}
				// Output what the guessed check digit is
				System.out.println("Check digit should be: " + checkDigitGuess);
				// Actual check digit is last number
				checkDigit = Character.getNumericValue(UPC.charAt(11));
				System.out.println("Check digit is: " + checkDigit);
				// Check if actual check digit is the same as guessed check digit and output result
				if (checkDigit == checkDigitGuess) {
					System.out.println("UPC is valid");
				}
				else {
					System.out.println("UPC is not valid");
				}
			}
			// If string is less than 12 characters, output error statement
			else {
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.print("\nEnter a UPC (enter a blank line to quit: ");
				UPC = keyboard.nextLine();
		}
		// Ask for a new UPC code to start over again
		System.out.print("\nEnter a UPC (enter a blank line to quit): ");
		UPC = keyboard.nextLine();
	}
	// Once blank line is inputed, say goodbye
	System.out.println("Goodbye!");
	}

}
