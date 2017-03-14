/*
 * Project06.java
 * Program that checks to see if a UPC string is a valid UPC code.
 * Used to practice nested loops.
 * 
 * @author Isabel Pena
 * @version 20170223
 * 
 */


import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String str = "121212121212";
		int actual = 0; // what the check digit should be
		char char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11, char12;
		int int1=0;
		int int2=0;
		int int3=0;
		int int4=0;
		int int5=0;
		int int6=0;
		int int7=0;
		int int8=0;
		int int9=0;
		int int10=0;
		int int11=0;
		int int12=0;
		while (str.length() != 0) {
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			str = keyboard.nextLine();
			if(str.length() == 12) {
			char1 = str.charAt(0); // start count at 1
	        int1 = Character.getNumericValue(char1); 
	        char2 = str.charAt(1);
	        int2 = Character.getNumericValue(char2); 
	        char3 = str.charAt(2);
	        int3 = Character.getNumericValue(char3);
	        char4 = str.charAt(3);
	        int4 = Character.getNumericValue(char4); 
	        char5 = str.charAt(4);
	        int5 = Character.getNumericValue(char5); 
	        char6 = str.charAt(5);
	        int6 = Character.getNumericValue(char6); 
	        char7 = str.charAt(6);
	        int7 = Character.getNumericValue(char7);
	        char8 = str.charAt(7);
	        int8 = Character.getNumericValue(char8); 
	        char9 = str.charAt(8);
	        int9 = Character.getNumericValue(char9); 
	        char10 = str.charAt(9);
	        int10 = Character.getNumericValue(char10); 
	        char11 = str.charAt(10);
	        int11 = Character.getNumericValue(char11); 
	        char12 = str.charAt(11);
	        int12 = Character.getNumericValue(char12); // all characters in string to appropriate int
			int a = (int1 + int3 + int5 + int7 + int9 + int11) * 3; // step 1 in algorithm
			int b = a + (int2 + int4 + int6 + int8 + int10); // step 2
			if (b % 10 != 0) {
				actual = 10 - (b % 10);
			}
			else {
				actual = 0;
			}
			System.out.println("Check digit should be: " + actual);
			System.out.println("Check digit is: " + int12);
			if (actual == int12) {
				System.out.println("UPC is valid");;
			}
			else {
				System.out.println("UPC is not valid");
			}
			System.out.println();
			}
			else if(str.length() != 12 && str.length() != 0){
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println();
			}
			
		}
		System.out.println("Goodbye!");
	}

}