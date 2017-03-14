/*
 * Project06a.java
 * 
 * @version 02232107
 * @author Melissa Liang
 * 
 */
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		String UPC = in.nextLine();
		int length = UPC.length();
		int last = length -1;
		int start = 1;
		int start2 = 0;
		int a = 0;
		int o = 0;
		int e = 0;
		int b = 0;
		int total = 0;
		char check = UPC.charAt(last);
		int checkdigit = Character.getNumericValue(check);
		if (UPC == "")
		{
			System.out.println("Goodbye!");
		}
		if (length != 12)
		{
			System.out.println("ERROR! UPC MUST have exactly 12 digits");
		}
		else
		{
			System.out.println("Check digit should be: " + checkdigit);
			while (start <= last)
			{
				char odd = UPC.charAt(start);
				a = Character.getNumericValue(odd);
				o= a + o;
				start = start + 2;
				
			}
			while (start2 <= last)
			{
				char even = UPC.charAt(start2);
				b = Character.getNumericValue(even);
				e = e + b;
				start2 = start2 + 2;
			}
			o = o*3;	
			total = o + e;
			int result = total % 10;
			if( result != 0)
			{
				result = 10 - result;
			}
			else
			{
				result = result;
			}
			System.out.println("Check digit is: " + result);
			if (result == checkdigit)
			{
					System.out.println("UPC is valid");
			}
			else
			{
					System.out.println("UPC is not valid");
			}
			
				
		}
		

	}

}
