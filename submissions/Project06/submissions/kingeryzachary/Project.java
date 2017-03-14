/* 
 * This program will read a sequence of 12 numbers and tell you if it's a valid UPC
 * 
 * @author Zach Kingery
 * @version 20170222
 */
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String UPC = keyboard.nextLine();
		boolean Loop = true;
		while (Loop == true){		
		if (UPC.length() == 12){	
			int Odd =  Character.getNumericValue(UPC.charAt(0)) + Character.getNumericValue(UPC.charAt(2)) + Character.getNumericValue(UPC.charAt(4)) + Character.getNumericValue(UPC.charAt(6)) + Character.getNumericValue(UPC.charAt(8)) + Character.getNumericValue(UPC.charAt(10));
			int Even = Character.getNumericValue(UPC.charAt(1)) + Character.getNumericValue(UPC.charAt(3)) + Character.getNumericValue(UPC.charAt(5)) + Character.getNumericValue(UPC.charAt(7)) + Character.getNumericValue(UPC.charAt(9));
			int Result = Odd*3 + Even;
			int Check = Character.getNumericValue(UPC.charAt(11));
			if (Result%10 == 0){
				if (Result%10 == Check){
				System.out.println("Check digit should be: " + Result%10);
				System.out.println("Check digit is: " + Check);
				System.out.println("UPC is valid");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();}
				else {
				System.out.println("Check digit should be: " + Result%10);
				System.out.println("Check digit is: " + Check);
				System.out.println("UPC is not valid");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();}}
			if (Result%10 != 0){
				int Check2 = 10-(Result%10);
				if (Check2 == Check){
				System.out.println("Check digit should be: " + Check2);
				System.out.println("Check digit is: " + Check);
				System.out.println("UPC is valid");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();}
				else {
				System.out.println("Check digit should be: " + Check2);
				System.out.println("Check digit is: " + Check);
				System.out.println("UPC is not valid");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();}}}	
		if (UPC.length() > 0 && UPC.length() < 12 || UPC.length() > 12){
			System.out.println("ERROR! UPC MUST have exactly 12 digits");
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			UPC = keyboard.nextLine();}
		if (UPC.length() == 0){
			Loop = false;
			System.out.print("Goodbye!");}}
		
		
		}}			
			
		
		
		
		
		
			
		
				
		
					
				
				
			
		
		
		
		// TODO Auto-generated method stub

	
