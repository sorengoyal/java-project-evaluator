/*
 * Project06
 * This project tells the user if a UPC is valid using the check digit.
 * 
 * @author Jessica Yates
 * @version 20172022
 * 
 */

package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a UPC (enter a blank line to quit): ");
        String upc = in.nextLine(); 
        
        while (upc.length()==12) {
            int odd= Character.getNumericValue(upc.charAt(0))+Character.getNumericValue(upc.charAt(2))+Character.getNumericValue(upc.charAt(4))+Character.getNumericValue(upc.charAt(6))+Character.getNumericValue(upc.charAt(8))+Character.getNumericValue(upc.charAt(10));
            int even= Character.getNumericValue(upc.charAt(1))+Character.getNumericValue(upc.charAt(3))+Character.getNumericValue(upc.charAt(5))+Character.getNumericValue(upc.charAt(7))+Character.getNumericValue(upc.charAt(9));
            int sum= odd*3+even;
            int checkDigit= Character.getNumericValue(upc.charAt(11));

            if (sum%10 !=0) {
                int sub= 10-(sum%10);
                if (sub==checkDigit) {
                    System.out.println("Check digit should be: " +sub);
                    System.out.println("Check digit is: "+ checkDigit);
                    System.out.println("valid");
                    System.out.println("Enter a UPC (enter a blank line to quit): ");
                    upc= in.nextLine();
                }
                else {
                    System.out.println("Check digit should be: " +sub);
                    System.out.println("Check digit is: "+ checkDigit);
                    System.out.println("not valid");
                    System.out.println("Enter a UPC (enter a blank line to quit): ");
                    upc= in.nextLine();
                }
            }
            }
	
            if (upc.length()==0){
            	System.out.println("Goodbye!");
            }
            else if(upc.length()<12 || upc.length()>12){
            	System.out.println("Error! UPC must have exactly 12 digit.");
            in.close();
        }
	}

}
