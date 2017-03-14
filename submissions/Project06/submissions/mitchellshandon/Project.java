/*
 * Shandon Mitchell
 * 02/23/2017
 *
 */

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.print("Enter a UPC (enter a blank line to quit): ");
        String input;
        input = keyboard.nextLine();


        while (input.length() > 0) {

            if (input.length() == 12) {





            int odd = Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(4)) + Character.getNumericValue(input.charAt(6)) + Character.getNumericValue(input.charAt(8)) + Character.getNumericValue(input.charAt(10));
            int even = Character.getNumericValue(input.charAt(1)) + Character.getNumericValue(input.charAt(3)) + Character.getNumericValue(input.charAt(5)) + Character.getNumericValue(input.charAt(7)) + Character.getNumericValue(input.charAt(9));
            int sum = odd * 3 + even;
            int checkdigit = Character.getNumericValue(input.charAt(11));


            if (sum % 10 != 0) {
                int sub = 10 - (sum % 10);


                if (sub == checkdigit) {
                    System.out.print("Check digit should be: " + sub);
                    System.out.println("");
                    System.out.print("Check digit is: " + checkdigit);
                    System.out.println("");
                    System.out.print("UPC is valid");
                    System.out.println("");
                    System.out.println("");
                    System.out.print("Enter a UPC (enter a blank line to quit): ");
                    input = keyboard.nextLine();


                } else {
                    System.out.print("Check digit should be: " + sub);
                    System.out.println("");
                    System.out.print("Check digit is: " + checkdigit);
                    System.out.println("");
                    System.out.print("UPC not valid");
                    System.out.println("");
                    System.out.println("");
                    System.out.print("Enter a UPC (enter a blank line to quit): ");
                    input = keyboard.nextLine();
                }
            }
        }else {


                    System.out.print("ERROR! UPC MUST have exactly 12 digits");
                    System.out.println("");
                    System.out.println("");
                    System.out.print("Enter a UPC (enter a blank line to quit): ");
                    input = keyboard.nextLine();
                }
            }


        if (input.length() == 0) {
            System.out.println("Goodbye");
        }


    }
}