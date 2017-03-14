/*
 * Project06.java
 * this code goes through the process of seeing if the upc code is correct or not.
 * 
 * @auhtor Elise Wehmer
 * @version 02192017
 */

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// set up scanner and ask for user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String upcstr = in.nextLine();
		//set up if loop to check for blank line
		if (upcstr.equals("")){
			System.out.println("Goodbye!");
		}
		else if (upcstr.length() > 12){
			System.out.println("ERROR! UPC MUST hvae exactly 12 digits");
			System.out.println("Enter a UPC (enter a blank line to quit): ");
			upcstr = in.nextLine();
		}
		else{
			// code for testing
			int i = 1;
			int total = 0;
			while (i < upcstr.length()){
				total = total + Character.getNumericValue(upcstr.charAt(i));
				i = i + 2;
			}
			i = 0;
			total = total * 3;
			while(i < upcstr.length()){
				total = total + Character.getNumericValue(upcstr.charAt(i));
				i = i + 2;
			}
			int remain = total % 10;
			int correct = 0;
			// check if remainder is 0
			if (remain == 0){
				correct = 0;
			}
			else{
				correct = 10 - remain;
			}
			//get check value in upc
		int checkupc = Character.getNumericValue(upcstr.charAt(upcstr.length() - 1));
		System.out.println("Check digit should be: " + correct);
		System.out.println("Check digit is: " + checkupc);
		//loop to check if they are the same
		if(correct == checkupc){
			System.out.println("UPC is valid");
		}
		else{
			System.out.println("UPC is not valid");
		}
		}
		

	}

}
