/*
 * This code is a royal pain in the ass
 * 
 * Author @nickeifel
 * version 20170223
 * 
 */


import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);

		System.out.println("Enter a UPC (enter a blank line to quit):");
		String barcode=keyboard.nextLine();
		int i=0;
		int j=1;
		int oddTotal=0;
		int evenTotal=0;
		
		if (barcode.length()!=12){
			System.out.println("Error! UPC MUST have exactly 12 digits");
		}
			while (i<12){
			char oddL=barcode.charAt(i);
			int oddNum=Character.getNumericValue(oddL);
			oddTotal=oddTotal+oddNum;
			i=i+2;
			} 
			int grandTotalOdd=oddTotal*3;
		
			while (j<12){
			char evenL=barcode.charAt(j);
			int evenNum=Character.getNumericValue(evenL);
			evenTotal=evenTotal+evenNum;
			j=j+2;
			}
			int totalSum=grandTotalOdd+evenTotal;
			int checkDigit=totalSum%10;
			System.out.println("Check digit should be "+checkDigit);
			
		System.out.println("Check digit is "+barcode.charAt(11));
		char oddL=barcode.charAt(11);
		int oddNum=Character.getNumericValue(oddL);
		
		if (checkDigit==oddNum){
			System.out.println("UPC is valid");
		}
		else {
			System.out.println("UPC is not valid");
		}
	}
}