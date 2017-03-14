/*
 * Project 6, more loops and learning how to change characters to integers
 * 
 * @author Emily Fu
 * @versiondatedue 20170223
 */
package osu.cse1223;
import java.util.Scanner;
public class Project06a {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int i=0;
		
		while (i==0){
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		String upcEnter=keyboard.nextLine();
		if (upcEnter.length()==12){
			int int1=Character.getNumericValue(upcEnter.charAt(0));
			int int2=Character.getNumericValue(upcEnter.charAt(1));
			int int3=Character.getNumericValue(upcEnter.charAt(2));
			int int4=Character.getNumericValue(upcEnter.charAt(3));
			int int5=Character.getNumericValue(upcEnter.charAt(4));
			int int6=Character.getNumericValue(upcEnter.charAt(5));
			int int7=Character.getNumericValue(upcEnter.charAt(6));
			int int8=Character.getNumericValue(upcEnter.charAt(7));
			int int9=Character.getNumericValue(upcEnter.charAt(8));
			int int10=Character.getNumericValue(upcEnter.charAt(9));
			int int11=Character.getNumericValue(upcEnter.charAt(10));
			int int12=Character.getNumericValue(upcEnter.charAt(11));
			
			int stepOne=(int1+int3+int5+int7+int9+int11)*3;
			int stepTwo=stepOne+int2+int4+int6+int8+int10;
			System.out.println("Check digit should be: " + int12);
			int checkDigit=0;
			if(stepTwo%10 != 0){
				checkDigit=10-(stepTwo%10);
				System.out.println("Check digit is: " + checkDigit);
			}
			else{
				System.out.println("Check digit is: " + checkDigit);
			}
			if (checkDigit == int12){
			System.out.println("UPC is valid");
			}
			else{
				System.out.println("UPC is not valid");
			}
		}
		else if (upcEnter.length()< 12 && upcEnter.length()>0){
			System.out.println("ERROR! UPC MUST have exactly 12 digits");
		}
		else if(upcEnter.length() == 0){
			i=i+1;
			System.out.println("Goodbye!");
		}
		}
	}

}
