/* 
 * Project06.java
 * 	A simple program that takes a UPC and checks it for validity.
 * 	Continues to prompt for another UPC until a blank line is input.
 * 
 * 	@author Alvin Law
 * 	@version 20170223
 * 
 */

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in); //Initializes scanner
		System.out.print("Enter a UPC (enter a blank line to quit): "); //UPC prompt
		String upc=keyboard.nextLine(); //Register UPC input
		
		//Loop until empty string input
		while(upc.length()!=0){ 
			if(upc.length()!=12){ //If string isn't 12 digits long
				System.out.println("ERROR! UPC MUST have exactly 12 digits\n"); //Error message
				System.out.print("Enter a UPC (enter a blank line to quit): "); //Prompt again
				upc=keyboard.nextLine(); //Register new input
			}
			
			//If string is 12 digits long
			else{
				int odd=0, even=0, n=0; //Assign variables
				while(n<=10){ //n will reach the 11th digit, 10th position 
					if(n%2==0){ //If position is an odd number
						odd=Character.getNumericValue(upc.charAt(n))*3+odd; //Multiply by 3 and add to odd total
					}
					else{ //If position is an even number
						even=Character.getNumericValue(upc.charAt(n))+even; //Add to even total
					}
					n=n+1; //Increase n value
				}
				int total=odd+even; //Total calculated value
				
				int calculated=total%10; //Take the remainder of the total divided by 10
				if(calculated!=0){ //If the remainder is not 0 
					calculated=10-calculated; //Subtract remainder from 10 for check digit
				}
				System.out.println("Check digit should be: "+calculated); //Print calculated digit
				
				int correct=Character.getNumericValue(upc.charAt(11)); //Retrieve digit from 11th position
				System.out.println("Check digit is: "+correct); //Print digit from UPC
				
				if(correct==calculated){ //If check digits match
					System.out.println("UPC is valid\n"); //Print valid
				}
				else{ //If check digits do not match
					System.out.println("UPC is not valid\n"); //Print invalid
				}
				
				System.out.print("Enter a UPC (enter a blank line to quit): "); //Prompt again
				upc=keyboard.nextLine(); //Register input again
			}
		}
		System.out.println("Goodbye!"); //Exit message
		
	}

}
