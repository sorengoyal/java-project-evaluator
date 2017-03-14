/*
 *Project06.java
 * A simple a Java program that checks UPC strings to see if they are valid.
 * 
 * @author Thomas Huston
 * @version 20170223
 * 
 */
package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int digitTotal = 0;
		int checkDigit = 0;
		
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		String upc = keyboard.nextLine();
		if (upc.length()== 0)
			System.out.println("Goodbye!");
		else
			if (upc.length() == 12){
				int odd = 0;
				int even = 0;
				for (int i=0; i<upc.length(); i++){
					if (i%2 == 0){
						char input = upc.charAt(i);
						odd = odd + Character.getNumericValue(input);
					}
					else if (i<11){
						char input = upc.charAt(i);
						even = even + Character.getNumericValue(input);
					}
						
				}
				digitTotal = ((odd * 3) + even)%10;
				if (digitTotal == 0)
					digitTotal = 0;
				else
					digitTotal = 10 - digitTotal;
				
				checkDigit = Character.getNumericValue(upc.charAt(11));
				
				System.out.println("Check digit should be: " + digitTotal);
				System.out.println("Check digit is: " + checkDigit);
				
				if (digitTotal == checkDigit)
					System.out.println("UPC is valid.");
				else
					System.out.println("UPC is not valid.");
			}
			else
				System.out.println("ERROR! UPC MUST have exactly 12 digits.");
				
	}

}
