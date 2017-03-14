/*
 * @author Renzhi Hu
 */
package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String upc = in.nextLine();
		
		while (upc.length() > 0){
			int odd = 0;
			int even = 0;
			
			if (upc.length() != 12){
				System.out.print("ERROR! UPC MUST have exactly 12 digits");
	            System.out.print("Enter a UPC (enter a blank line to quit): ");
	            upc = in.nextLine();
			}
	
			else{
				for (int i=0; i<11; i++){
					if (i % 2 == 0){
						odd = odd + Character.getNumericValue(upc.charAt(i));
					}
					else{
						even = even + Character.getNumericValue(upc.charAt(i));
					}
				}
				
				int remainder = ((odd * 3) + even) % 10;
				int check = 0;
				if (remainder != 0){
					check = 10 - remainder;
				}
				
				int actual = Character.getNumericValue(upc.charAt(11));
				System.out.println("Check digit should be: " + check);
				System.out.println("Check digit is: " + actual);
				
				if (actual == check){
					System.out.println("UPC is valid.");
				}
				else{
					System.out.println("UPC is not valid.");
				}		
			}
            System.out.print("Enter a UPC (enter a blank line to quit): ");
            upc = in.nextLine();
		}
		System.out.print("Goodbye!");

	}

}
