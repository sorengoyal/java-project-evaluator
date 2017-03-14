/*
 * @Author Hangyi Lai
 * @Date 2017.02.22
 */

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String number = in.nextLine();
		while (number.length() != 0) {

			if (number.length() != 12) {
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println("");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				number = in.nextLine();
			} else {
				int i = 1;
				int result1 = 0;
				while (i < number.length() - 1) {
					result1 = result1 + Character.getNumericValue(number.charAt(i));
					i = i + 2;
				}
				int j=0;
				int result2 =0;
				while (j < number.length()) {
					result2 = result2 + Character.getNumericValue(number.charAt(j));
					j = j + 2;
				}
				int result = (result1) * 3 + result2;
				int remainder = result % 10;
				int checkDigit;
				if (remainder != 0) {
					checkDigit = 10 - remainder;
				} else {
					checkDigit = 0;
				}
				System.out.println("Check digit should be: " + checkDigit);
				int lastDigit = Character.getNumericValue(number.charAt(11));
				System.out.println("Check digit is: " + lastDigit);
				if (lastDigit == checkDigit) {
					System.out.println("UPC is valid");
				} else {
					System.out.println("UPC is not valid");
				}
			}
			System.out.println();
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			number = in.nextLine();
		}
		System.out.println("Goodbye!");

	}

}
