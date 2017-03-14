/* Project04.java
 * 
 * User enters a 12 digit UPC code. If the UPC is not 12 digits, an error message is output.
 * Using the sums of the even and odd position digits and and multiplying by 3, a number is 
 * calculated. If this number does not match the last number of the UPC (the check digit), the 
 * UPC is not valid. User is prompted to enter more UPCs until and empty line is entered.
 * 
 * @author Nicole Gatt
 * @version 20170221
 */


import java.util.Scanner;
public class Project {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		String upc = keyboard.nextLine();

        while (upc.length() > 0){
			if (upc.length() != 12){
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println("Enter a UPC (enter a blank line to quit): ");
				upc= keyboard.nextLine();
			}
			else {
				int odd= Character.getNumericValue(upc.charAt(0))+Character.getNumericValue(upc.charAt(2))+Character.getNumericValue(upc.charAt(4))+Character.getNumericValue(upc.charAt(6))+Character.getNumericValue(upc.charAt(8))+Character.getNumericValue(upc.charAt(10));
				//sum of all odd-numbered positions
	            int even= Character.getNumericValue(upc.charAt(1))+Character.getNumericValue(upc.charAt(3))+Character.getNumericValue(upc.charAt(5))+Character.getNumericValue(upc.charAt(7))+Character.getNumericValue(upc.charAt(9));
	            //sum of all even-numbered positions
	            int sum = odd*3+even; //number calculated using odd and even-numbered position numbers
	            int checkDigit= Character.getNumericValue(upc.charAt(11)); //check digit is the last number of the UPC

	            if (sum%10 !=0) { //calculating what the check digit should be to make the UPC valid
	                int sub = 10-(sum%10);
	                if (sub==checkDigit) {
	                    System.out.println("Check digit should be: " + sub);
	                    System.out.println("Check digit is: "+ checkDigit);
	                    System.out.println("UPC is valid");
	                    System.out.println("Enter a UPC (enter a blank line to quit): ");
	                    upc= keyboard.nextLine();
	                     }
	                else { //UPC does not meet criteria to be valid
	                    System.out.println("Check digit should be: " + sub);
	                    System.out.println("Check digit is: "+ checkDigit);
	                    System.out.println("UPC is not valid");
	                    System.out.println("Enter a UPC (enter a blank line to quit): ");
	                    upc= keyboard.nextLine();
				         }
		        }
	         }
        }
        System.out.println("Goodbye!"); //empty string entered to end loop
   }
}


