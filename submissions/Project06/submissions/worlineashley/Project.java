/*
 * Project06.java
 * 
 * The program asks the user to enter a UPC code and the program will determine the check
 * digit. The program will print whether the calculated check digit matches the check digit
 * in the code inputed by the user. If the user's check point is equal the one provided in the
 * UPC, the code is valid. If not, the code is not valid. The program will say goodbye to 
 * the user if the user inputs nothing, and will send an error message if the user inputs
 * more than 12 digits. 
 * 
 * @author Ashley Worline
 * @version 20170222
 * 
 */

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		
	
			Scanner keyboard = new Scanner(System.in);
			
			{ System.out.println("Enter a UPC (enter a blank line to quit): ");}
			String UPC = keyboard.nextLine();
			if (UPC.length() == 0){
			System.out.println("Goodbye!");
			}
			
			while (UPC.length() > 0) {
				if (UPC.length() > 12) {
					System.out.println("ERROR! UPC MUST have exactly 12 digits");
					break;
				} else {
					char digit1 = UPC.charAt(0);
						int value1 = Character.getNumericValue(digit1); 
					char digit2 = UPC.charAt(1);
						int value2 = Character.getNumericValue(digit2); 
					char digit3 = UPC.charAt(2);
						int value3 = Character.getNumericValue(digit3); 
					char digit4 = UPC.charAt(3);
						int value4 = Character.getNumericValue(digit4); 
					char digit5 = UPC.charAt(4);
						int value5 = Character.getNumericValue(digit5); 
					char digit6 = UPC.charAt(5);
						int value6 = Character.getNumericValue(digit6); 
					char digit7 = UPC.charAt(6);
						int value7 = Character.getNumericValue(digit7); 
					char digit8 = UPC.charAt(7);
						int value8 = Character.getNumericValue(digit8); 
					char digit9 = UPC.charAt(8);
						int value9 = Character.getNumericValue(digit9); 
					char digit10 = UPC.charAt(9);
						int value10 = Character.getNumericValue(digit10); 
					char digit11 = UPC.charAt(10);
						int value11 = Character.getNumericValue(digit11); 
					int oddTotal = (value1 + value3 + value5 + value7 + value9 + value11)*3;
					int evenTotal = (value2 + value4 + value6 + value8 + value10);
					int total = oddTotal + evenTotal;
					int checkDigit; {

					if (total % 10 == 0){
						checkDigit = 0;
						System.out.println("Check digit should be: " + checkDigit);
					} else {
						checkDigit = 10 - (total % 10);
						System.out.println("Check digit should be: " + checkDigit);
					}
				char digit12 = UPC.charAt(11);
				int value12 = Character.getNumericValue(digit12);
				if (checkDigit == value12){
					System.out.println("Check digit is: " + checkDigit);
					System.out.println("UPC is valid");
					break;
				} else {
					System.out.println("Check digit is: " + UPC.charAt(11));
					System.out.println("UPC is not valid");
				break;
				}
	}
		}
}
	}
}

