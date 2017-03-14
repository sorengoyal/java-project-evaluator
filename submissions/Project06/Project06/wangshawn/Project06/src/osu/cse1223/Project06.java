package osu.cse1223;

import java.util.Scanner;

public class Project06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a UPC (enter a blank line to quit): ");
        String upc = in.nextLine();
        while (upc.length() > 0) {
            if (upc.length() != 12) {
            	System.out.println("ERROR UPC MUST have exactly 12 digits");
            }
            else{
            	int check = 0;
                int actual = Character.getNumericValue(upc.charAt(upc.length() - 1));
                int odd = 0;
                int even = 0;
                        odd = Character.getNumericValue(upc.charAt(0))+Character.getNumericValue(upc.charAt(2))+Character.getNumericValue(upc.charAt(4))+Character.getNumericValue(upc.charAt(6))+Character.getNumericValue(upc.charAt(8))+Character.getNumericValue(upc.charAt(10));
                        even = Character.getNumericValue(upc.charAt(1))+Character.getNumericValue(upc.charAt(3))+Character.getNumericValue(upc.charAt(5))+Character.getNumericValue(upc.charAt(7))+Character.getNumericValue(upc.charAt(9));
                odd= odd*3;
                int total = odd + even;
                
                
                total = total%10;
                if (total != 0) {
                    check = 10 - total;
                }
                else {
                	check=0;
                }
                System.out.println("Check digit should be: " + check);
                System.out.println("Check digit is: " + actual);
                
                if (check == actual) {
                    System.out.println("UPC is valid");
                }
                else {
                    System.out.println("UPC is not valid");
                }
            	
            	
            }
            System.out.print("Enter a UPC (enter a blank line to quit): ");
            upc = in.nextLine();
        }
        System.out.println("Goodbye!");
    }


}

