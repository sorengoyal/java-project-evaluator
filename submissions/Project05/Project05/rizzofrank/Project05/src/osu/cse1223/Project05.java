package osu.cse1223;

import java.util.Scanner;

public class Project05 {
	
	/**
	 * Project05.java
	 * This program takes number guesses for a randomly generated number.
	 * It tells how close the number is.
	 * 
	 * @author Frank Rizzo
	 * 20170214
	 */
	
	public static void main(String []args) {
		int x = (int)(100 * Math.random() + 1); //takes random integer
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int input = in.nextInt();
		int j=0;
		while (x != input){ //starts loop to see if number is higher or lower than randomly generated one
			if ((x>input)&&(input>0)&&(input<100)){
				System.out.println("Your guess was too low. Try again");
			}
			else if ((x<input)&&(input>0)&&(input<100)){
				System.out.println("Your guess was too high. Try again");
			}
			else {
				System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
			}
			System.out.print("Enter a guess between 1 and 100: ");
			input = in.nextInt();
			j=j+1;
		}
		System.out.println("Congratulations! Your guess is correct!" ); //inputs results
		System.out.println("I had " + x + " as the target number.");
		System.out.println("You guessed it in " + j + " tries.");
		if (j==1){ //prints which category the number of guesses falls under
			System.out.println("That was lucky!");
		}
		if ((j>=2)&&(j<=4)){
			System.out.println("That was amazing!");
		}
		if ((j>=5)&&(j<=6)){
			System.out.println("That was good.");
		}
		if (j==7){
			System.out.println("That was OK.");
		}
		if ((j>=8)&&(j<=9)){
			System.out.println("That was not good.");
		}
		if (j>10){
			System.out.println("This is not your game");
		
		
		
		}
		
		
		
				
	}

}
