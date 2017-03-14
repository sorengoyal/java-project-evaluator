package osu.cse1223;

import java.util.Scanner;

public class Project06 {
	
	/** 
	 * This program has the user input a UPC code.
	 * It checks if this code is valid based on the check digit and length
	 * 
	 *  
	 *  @author Frank Rizzo
	 *  20170221
	 */

	public static void main(String []args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): "); 
		String str = in.nextLine(); //assign code to a string variable
		while (str.length()>0){ //loop testing if string is not blank
			if (str.length() != 12){ //if loop to determine if string has 12 digits
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				str = in.nextLine();
				}
			if (str.length() == 12){ //runs program if code has 12 digits
				int i = 0, j = 1, totaleven = 0, totalodd = 0;
					while (i<=10){ //adds even numbers
						totaleven = totaleven + Character.getNumericValue(str.charAt(i));
						i = i + 2;
					}
					while (j<11){ //adds odd numbers
						totalodd = totalodd + Character.getNumericValue(str.charAt(j));
						j = j + 2;
					}
				int total = ((totaleven * 3) + totalodd)%10; //completes remainder of algorithm
				int check1 = 10 - total;
				if (check1==10){
					check1=0;
				}
				char input= str.charAt(11);
				int inputInt = Character.getNumericValue(input); 
				System.out.println("Check Digit should be: " + check1); //Prints results to screen
				System.out.println("Check Digit is " + inputInt);
				if (check1 == inputInt){
					System.out.println("UPC is valid");
				}
				else {
					System.out.println("UPC is not valid");
				}
			System.out.print("Enter a UPC (enter a blank line to quit): "); //Asks for a new code
			str = in.nextLine();
			}
		}	
		System.out.print("Goodbye"); //ends program
	}
	
}
				
					
						
						
						
					
						
				
			
				
			
	

