package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): "); 
		long str = in.nextLong(); 
		int myindex = 12;
		
	

		if (isValidUPC(str)) 
		System.out.println("UPC is valid"); 
		else 
		System.out.println("UPC is not valid"); 
		} 

		public static boolean isValidUPC(long a) { 
		long copy_of_a = a; 
		int sum = 0; 

		for (int i=11; i>=1; i--) { 
		long l = (long) (Math.pow(10, i)); 
		int n = (int) (a/l);	 
		a -= n * l; 
		 
		if (i%2 == 1) { 
		
		sum += n; 
		} 
		} 
		a = copy_of_a; 

		 

		sum *= 3; 

		for (int i=11; i>=2; i--) { 
		long l = (long) (Math.pow(10, i)); 
		int n = (int) (a/l);	
		a -= n * l; 
		
		if (i%2 == 0) { 
		
		sum += n; 
		} 
		} 
		a = copy_of_a; 

		
		int checkDigit = sum % 10; 

		if (checkDigit != 0) 
		checkDigit = 10-checkDigit; 
		System.out.println("Check Digit should be:  "+checkDigit);
		

		if (checkDigit == a%10) 
		return true; 
		else 
		return false; 
		} 
}	
		
	

