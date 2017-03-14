/*
 * code test UPC code to see if it is valid or not
 * runs until blank is entered
 * must be at least 12 numbers long or error is reported
 * 
 * @author Niko Yuschak
 * @version 02222012
 */


package osu.cse1223;
import java.util.Scanner;
public class Project06 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String next = keyboard.nextLine();
		
		while (next.length()>0){
			if(next.length()==12){
				int odd = Character.getNumericValue(next.charAt(0)) + Character.getNumericValue(next.charAt(2)) + Character.getNumericValue(next.charAt(4)) + Character.getNumericValue(next.charAt(6)) +Character.getNumericValue(next.charAt(8)) + Character.getNumericValue(next.charAt(10));
				int even =Character.getNumericValue(next.charAt(1)) + Character.getNumericValue(next.charAt(3)) + Character.getNumericValue(next.charAt(5)) + Character.getNumericValue(next.charAt(7)) +Character.getNumericValue(next.charAt(9));
				int sum =odd*3+even ;
				int check = Character.getNumericValue(next.charAt(11));
			
				if (sum%10 != 0) {
					int sub = 10 - (sum%10);
					if (sub == check) {
						System.out.println("Check digit should be:" + sub);
						System.out.println("Check digit is:" + check);
						System.out.println("UPC is valid");
						System.out.print("Enter a UPC (enter a blank line to quit): ");
						next = keyboard.nextLine();
					}
					else {
						System.out.println("Check digit should be:" + sub);
						System.out.println("Check digit is:" + check);
						System.out.println("UPC is not valid");
						System.out.print("Enter a UPC (enter a blank line to quit): ");
						next = keyboard.nextLine();
					}	
				}
			}
			else{
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println("Enter a UPC (enter a blank line to quit): ");
				next = keyboard.nextLine();
			}
			
		}
		
		if (next.length()==0){
			System.out.println("Goodbye!");
		}
	}
}

			
			
	





