package osu.cse1223;

import java.util.Scanner;

public class Project06 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String str = " ";
		
		while (str.length()!=0){
			System.out.print("Enter a UPC (enter a blank line to quit): ");
			str = keyboard.nextLine();
			
			
				int i = 1;
				int k = 0;
				int n = 0;
				
				if (str.length() !=12 && str.length() != 0)
					System.out.println("ERROR! UPC MUST have exactly 12 digits.");
				
				else{
		
					while (i<str.length()){
						char ch = str.charAt(i-1);
						char ch1 = str.charAt(i);
						
						if (i<=11){
							int j = Character.getNumericValue(ch);
							k=k+j;
						}
						
						if (i<11){
							int m = Character.getNumericValue(ch1);
							n=n+m;
						}
						i=i+2;
					}
					k=k*3;
				}
				if (str.length()==12){
					k=k+n;
					if (k%10==0){
						System.out.println("Check digit is should be: 0 ");
					}
					else{
						k=10-(k%10);
						System.out.println("Check digit should be: " + k);
					}
					System.out.println("Check digit is: " + str.charAt(11) );
				int p = str.charAt(11);
				int q = Character.getNumericValue(p);
				if (k==q)
					System.out.println("UPC is valid");
				else
					System.out.println("UPC is not valid.");
			}
				System.out.println("");	
		}	
	System.out.println("Goodbye!");
	}
}