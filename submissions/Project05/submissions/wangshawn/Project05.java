
import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		  	//set up, generate random number
			Scanner in = new Scanner(System.in);
		  	int number = (int)(0 * 100 + 1);
	        int count = 1;
	       //get user input
	        System.out.print("Enter a guess between 1 and 100: ");
	        int input = in.nextInt();
	       //compare
	        while (input != number) {
	            if (input <= 100 && input >= 1) {
	            	if(input > number){
	                System.out.println("Your guess was too high.  Try again.");
	                count ++;
	            	}
	            	else {
	                System.out.println("Your guess was too low.  Try again.");
	                count ++;
	            	}}
	            else {
	                System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
	            }
	            System.out.print("Enter a guess between 1 and 100: ");
		        input = in.nextInt();
	         }
	       
	            System.out.println("You guessed it in " + count + " tries.");
	        //generate message
	        if (count == 1) {
	            System.out.println("That was lukcy!");
	        }
	        else if (count <= 4) {
	            System.out.println("That was amazing!");
	        }
	        else if (count <= 6) {
	            System.out.println("That was good.");
	        }
	        else if (count == 7) {
	            System.out.println("That was OK.");
	        }
	        else if (count <= 9) {
	            System.out.println("That was not very good.");
	        }
	        else {
	            System.out.println("This just isn't your game.");
	        }
	    }
	}