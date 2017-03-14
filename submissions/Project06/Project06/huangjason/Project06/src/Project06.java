import java.util.Scanner;
public class Project06 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String barcode = in.nextLine();
		while (barcode.length() != 0 ) {
			while (barcode.length() == 12){
				
				//(step 1) Determining odd spaces on barcode 
				int check = 0;
				int x = 0;
				while (x < 12){
					char s = barcode.charAt(x);
					int intS = Character.getNumericValue(s);
					check = check + intS;
					x = x + 2;	
				}
				check = check*3;
		
				//(step 2) Determining even spaces on barcode
				int even = 0;
				int y = 1;
				while (y < 11){
					char s = barcode.charAt(y);
					int intS = Character.getNumericValue(s);
					check = check + intS;
					y = y + 2;
				}
			
				//(step 3) computing the remainder 
				check = (check % 10) ;
				if (check == 0){
					System.out.println("Check digit should be: 0");
				}
				else {
					check = (10 - check);
					System.out.println("Check digit should be: " + check);
				}
			
				// Determining the match and repeating 
				int confirm = Character.getNumericValue(barcode.charAt(11));
				System.out.println("Check digit is: "+ confirm);
				if (confirm == check){
					System.out.println("UPC is valid");
				}
				else {
					System.out.println("UPC is not valid");
				}
				System.out.println("");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				barcode = in.nextLine();
				}
		
			//If barcode can't be read 
			if ((barcode.length() != 12)&&(barcode.length() != 0)){
				System.out.println("ERROR! UPC MUST have exactly 12 digits");
				System.out.println("");
				System.out.print("Enter a UPC (enter a blank line to quit): ");
				barcode = in.nextLine();
			}
		}
		//Quiting 
		if (barcode.length() == 0){
			System.out.print("Goodbye!");
		}
	}

	
}