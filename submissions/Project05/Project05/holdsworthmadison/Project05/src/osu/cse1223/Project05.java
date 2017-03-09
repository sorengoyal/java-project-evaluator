package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner user_input = new Scanner(System.in);

		
		int x =  (int)(100 * Math.random()) + 1;
		int tries = 0;
		boolean win = false;
		while ( win == false ){
		System.out.print("Enter a guess between 1 and 100: ");
		   int in = user_input.nextInt();
		   tries++;
		   
		if ( x > in ) {
		System.out.println("Your guess was too low. Try again.");
		}
		else if ( x < in ) {
		System.out.println("Your guess was too high. Try again.");
		}
		
		else if (in == x ) {
		System.out.println("Congratulations! Your guess was correct!");
		System.out.println(" ");
		System.out.println("I had chosen " + x + " as the target number.");
		System.out.println("You guessed it in " + tries + " tries.");
		if (tries == 1) {
		System.out.println("That was lucky!");
		}
		else if (tries == 2 || tries == 3 || tries == 4 ) {
		System.out.println("That was amazing!");
		}
		else if (tries == 5 || tries == 6 ) {
		System.out.println("That was good.");
		}
		else if (tries == 7 ) {
		System.out.println("That was OK.");
		}
		else if (tries == 8 || tries == 9 ) {
		System.out.println("That was not very good.");
		}
		else {
		System.out.println("This just just isn't your game.");
		}
		} 
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}


