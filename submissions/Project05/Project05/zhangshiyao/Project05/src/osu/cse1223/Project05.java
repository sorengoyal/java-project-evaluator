/* 
 * Project05.java
 * A Java program using a loop that will play a simple Guess The Number game
 * The program will randomly generate an integer between 1 and 100 and will enter a loop where it prompt the user for a guess.
 * @author Shiyao Zhang
 * @version 20170216
 */

package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int generated =  (int)(100 * Math.random()) + 1;
		
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = in.nextInt();
		int numberOftries = 1;
		String compare="";
		String outcome="";
		while (guess != generated )
		{
			while (guess < 1 || guess >100)
			{
				System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
				System.out.println();
				System.out.print("Enter a guess between 1 and 100: ");
				guess = in.nextInt();
				numberOftries++;
			}
			if (guess > generated)
			{compare = "high";}
			if (guess < generated)
			{compare = "low";}
			System.out.println("Your guess was too " + compare + ". Try again.");
			System.out.println();
			System.out.print("Enter a guess between 1 and 100: ");
			guess = in.nextInt();
			
			numberOftries++;
		}
		
		System.out.println("Congratulations!  Your guess was correct!");
		System.out.println();
		System.out.println("I had chosen " + generated + " as the target number.");
		System.out.println("You guessed it in " + numberOftries + " tries.");
		if (numberOftries >= 10)
		{outcome = "This just isn't your game.";}
		else if (numberOftries >= 8)
		{outcome = "That was not very good.";}
		else if (numberOftries ==7 )
		{outcome = "That was OK.";}
		else if (numberOftries >= 5)
		{outcome = "That was good.";}
		else if (numberOftries >= 2)
		{outcome = "That was amazing!";}
		else
		{outcome = "That was lucky!";}
		System.out.println(outcome);

	}

}
