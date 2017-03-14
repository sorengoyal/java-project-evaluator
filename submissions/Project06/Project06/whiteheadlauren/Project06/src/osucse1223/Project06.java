/*
 * @author Lauren Whitehead
 * @version 20170222
 */
package osucse1223;
import java.util.Scanner;
import java.util.*;
public class Project06 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	final long maxupc = 999999999999L;
	
	System.out.println("Enter a UPC (enter a blank line to quit): "); // enter UPC code
	long upc = keyboard.nextLong();
	long digit = upc;
	
	if ((upc > maxupc || (upc < 0))) { // UPC code is not 12 digits
		System.out.println("ERROR! UPC MUST have exactly 12 digits");
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		upc = keyboard.nextLong();
	}
	
	else if (upc <= 0) {
			System.out.println("Goodbye!");
	}
	
	else { // listing digits of UPC code
	int n12 = (int) (upc % 10);
	upc /= 10;
	int n11 = (int) (upc % 10);
	upc /= 10;
	int n10 = (int) (upc % 10);
	upc /= 10;
	int n9 = (int) (upc % 10);
	upc /= 10;
	int n8 = (int) (upc % 10);
	upc /= 10;
	int n7 = (int) (upc % 10);
	upc /= 10;
	int n6 = (int) (upc % 10);
	upc /= 10;
	int n5 = (int) (upc % 10);
	upc /= 10;
	int n4 = (int) (upc % 10);
	upc /= 10;
	int n3 = (int) (upc % 10);
	upc /= 10;
	int n2 = (int) (upc % 10);
	upc /= 10;
	int n1 = (int) (upc % 10);
	upc /= 10;
	
	int even = n2 + n4 + n6 + n8 + n10; //even digits
	int odd = n1 + n3 + n5 + n7 + n9 + n11; //odd digits

	int cd = (odd*3) + even; // calculate actual cd
	int actualcd = 10 - (cd%10);
	if (cd%10 == 0) {
		System.out.println("Check digit should be: 0");
	}
	else {
		System.out.println("Check digit should be: " + actualcd);
	}
	
	System.out.println("Check digit is: " + n12); // what the check digit is
	
	if (actualcd == n12)	{ //valid or invalid??
		System.out.println("UPC is valid");
	}
	else {
		System.out.println("UPC is not valid");
	}
	
	
	}
	}
}



