import java.util.Scanner;

/*
 * Project06.java
 * 
 * @author Peter Bosworth
 * @version 20172202
 *
 */
public class Project06 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String upc = keyboard.nextLine();
		
		if (upc.length() > 0 && upc.length() != 12){
			System.out.println("ERROR! UPC MUST have exactly 12 digits");
		}
		
		if (upc.length() == 0){
			System.out.println("Goodbye!");
		}
		else{
			while (upc.length() ==12){
				int evenDigit = (Character.getNumericValue(upc.charAt(0))+Character.getNumericValue(upc.charAt(2))+Character.getNumericValue(upc.charAt(4))+Character.getNumericValue(upc.charAt(6))+Character.getNumericValue(upc.charAt(8))+Character.getNumericValue(upc.charAt(10)));
				int oddDigit = (Character.getNumericValue(upc.charAt(1))+Character.getNumericValue(upc.charAt(3))+Character.getNumericValue(upc.charAt(5))+Character.getNumericValue(upc.charAt(7))+Character.getNumericValue(upc.charAt(9)));
				int sum = 3*evenDigit + oddDigit;
				
				int checkDigit = Character.getNumericValue(upc.charAt(11));
				
				if (sum%10 != 0){
					int value = (10-(sum%10));
				
						if (checkDigit==value){
					         System.out.println("Check digit should be: "+value);
					         System.out.println("Check digit is: "+checkDigit);
					         System.out.println("UPC is valid.");
						}
					    else{
					    	System.out.println("Check digit should be: "+value);
					         System.out.println("Check digit is: "+checkDigit);
					         System.out.println("UPC is not valid.");
					    	
					    }
				}
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				upc = keyboard.nextLine();
			}
			
		}
		
		
	

	}

}
