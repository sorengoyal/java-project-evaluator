/*
 * Project05.java
 *The purpose of this project is to play a game with the user where the user has to enter a 
 *number between 1 and 100. The computer will randomly pick a number between 1 and 100 and will
 *let the user know if the guess is too high or too low until the correct answer is entered.
 *Once the right answer is entered the program will say how many tries the user got it in and 
 *how well they played their game. 
 *
 * @author Ashley Worline
 * @version 20170215
 * 
 */

import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		int number = (int)( 0* 101 + 1);
		int count = 0;
        while (count!=number){
        	System.out.print("Enter a guess between 1 and 100: ");
        	int newGuess = keyboard.nextInt();
    		if (newGuess!=number) {
    			++count;
    			if (newGuess > 100 || newGuess < 1){
    				System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
    			}
    			else if (newGuess >= number){
        		System.out.println("Your guess was too high. Try again.");
    			}
    			else if ( newGuess <= number){
        	System.out.println("Your guess was too low. Try again.");
    			}
    		}	
    		else{
    			int finalCount = count + 1;
    	  System.out.println("Congratulations! Your guess was correct!");  
    	  System.out.println("I had chosen " + number + " as the target number.");
    	  System.out.println("You guessed it in " + finalCount + " tries.");
    	  			if (finalCount == 1){
    	  				System.out.println("That was lucky!");	
    	  			}
    	  			else if (finalCount > 2 && finalCount <= 4){
    	  				System.out.println("That was amazing!");
    	  			}
    	  			else if (finalCount > 4 && finalCount <= 6){
    	  				System.out.println("That was good.");
    	  			}
    	  			else if (finalCount == 7){
    	  				System.out.println("That was OK.");
    	  			}
    	  			else if (finalCount == 8 || finalCount == 9){
    	  				System.out.println("That was not very good.");
    	  			}
    	  			else {
    	  				System.out.println("This just isn't your game!");
    	  			}
	break;
    			}
	}
	}
}
