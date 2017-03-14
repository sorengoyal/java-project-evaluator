import java.util.Scanner;
/* Project06a.java
 * 
 * A program that checks if a UPC string is a valid UPC code
 * 
 * @author christianmorales
 * @date 20170222
 */
public class Project {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String UPC;
		int odd, even, main, check, index;
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		UPC = keyboard.nextLine();
		while (UPC.length()!=0) {
			if (UPC.length()!=12) {
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println();
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();
			} else {
				index = 0;
				main = 0;
				while (index <= 11) {
					odd = Character.getNumericValue(UPC.charAt(index));
					main = main + odd;
					index = index + 2;
				}
				main = main*3;
				index = 1;
				while (index <= 10) {
					even = Character.getNumericValue(UPC.charAt(index));
					main = main + even;
					index = index + 2;
				}
				main = main % 10;
				if (main == 0) {
					main = 0;
				} else {
					main = 10 - main;
				}
				check = Character.getNumericValue(UPC.charAt(11));
				System.out.println("Check digit should be: "+main);
				System.out.println("Check digit is: "+check);
				if (main == check) {
					System.out.println("UPC is valid");
				} else {
					System.out.println("UPC is not valid");
				}
				System.out.println();
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				UPC = keyboard.nextLine();
			}
		}
		System.out.println("Goodbye!");

	}

}
