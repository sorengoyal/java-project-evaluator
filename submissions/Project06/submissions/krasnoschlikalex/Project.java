/*
 * Project06.java
 * This is a program that checks to see if a UPC string is a valid UPC code.
 * 
 * @author Alex Krasnoschlik
 * @version 20170222
 * 
 */


import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String upcEntered = keyboard.nextLine();
		while (upcEntered.length() != 0) { //repeats as long as user does not enter empty string
			if (upcEntered.length() == 12) { // upc is "valid" or "not valid"
				int pos = 0;
				int sumOdd = 0; //sum of 1st, 3rd, ... , 11th
				int sumEven = 0; //sum of 2nd, 4th, ... , 10th
				int result; //stores result to be used in computation of valid check digit
				while (pos < 11) { //for the length of upc
					if (pos % 2 == 0) {
						sumOdd = sumOdd + Character.getNumericValue(upcEntered.charAt(pos));
					}
					else if (pos % 2 != 0) {
						sumEven = sumEven + Character.getNumericValue(upcEntered.charAt(pos));
					}
					pos = pos +1;
				}
				result = 3*sumOdd + sumEven;
				int computedCheck = 10 - (result % 10); //check digit should be this
				int givenCheck = Character.getNumericValue(upcEntered.charAt(11)); //actual check digit
				System.out.println("Check digit should be: " + computedCheck);
				System.out.println("Check digit is: " + givenCheck);
				if (computedCheck == givenCheck) {
					System.out.println("UPC is valid");
				}
				else {
					System.out.println("UPC is not valid");
				}
			}
			else if (upcEntered.length() > 0) { //UPC is error (not 12 digits)
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
			}
			System.out.println(); // prints a blank line to separate inputs
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			upcEntered = keyboard.nextLine();
		}
		if (upcEntered.length() == 0) { //user entered a blank string
			System.out.println("Goodbye!");
		}
	}

}
