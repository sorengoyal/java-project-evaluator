package osu.cse1223;

/* This code will read a UPC number, then will run an algorithm to make sure
 * it is a valid UPC code.
 * 
 * 
 * @author Garrett Maag
 * @version 20170223
 */

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		int length = 1;
		while (length > 0) {
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			Scanner keyboard = new Scanner(System.in);
			String UPC = keyboard.nextLine();
			length = UPC.length();
			if (length != 12 && length != 0) {
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println();
				}
			else if (length > 0) {
				int i = 1;
				int oddSum = 0;		
				while (i < 13) {
					char odd = UPC.charAt(i);
					int oddInt = Character.getNumericValue(odd);
					oddSum = oddSum + oddInt;
					i = i + 2;
				}
				oddSum = oddSum * 3;
				i = 0;
				int evenSum = 0;		
				while (i < 12) {
					char even = UPC.charAt(i);
					int evenInt = Character.getNumericValue(even);
					evenSum = evenSum + evenInt;
					i = i + 2;
				}
				int total = oddSum + evenSum;
				int x = total % 10;
				int check = 0;
				if (x > 0) {
					check = 10 - x;
				}
				System.out.println("Check digit should be: " + check);
				char realCheck = UPC.charAt(11);
				int actualCheck = Character.getNumericValue(realCheck);
				System.out.println("Check digit is: " + actualCheck);
				if (check == actualCheck) {
					System.out.println("UPC is valid");
				}
				else {
					System.out.println("UPC is not valid");
				}
				System.out.println();
			}
		}
		System.out.print("Goodbye!");
		
	}

}
