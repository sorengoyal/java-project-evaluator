/*
 * Project05.java
 * A simple program using a loop that will play a simple Guess The Number game.  
 * The program will randomly generate an integer between 1 and 100 and will enter a loop where it prompt the user for a guess.  
 * If the user has guessed the correct number, the program will end with a message indicating how many guesses it took to get the right answer and a message that is determined by how many guesses it takes them to get the right answer.  
 * If the user guesses incorrectly, the program should respond with a message that the user has guessed either "too high" or "too low" and let them guess again.
 * @author Thomas Huston
 * @version 20170216
 * 
 */
package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		boolean status = false;
		int randomNumber = (int)(100 * Math.random()) + 1; //Generate random number
		int guessCount = 0; //Count the number of guesses
		
		do
		{
			System.out.print("Enter a guess between 1 and 100: ");
			int guess = keyboard.nextInt();
			if (guess < 1)
				System.out.println("Your guess is out of range. Pick a number between 1 and 100");
			else if (guess > 100)
				System.out.println("Your guess is out of range. Pick a number between 1 and 100");
			else if (guess == randomNumber)
			{	
				System.out.println("Congratulations! Your guess was correct!" );
				guessCount ++;
				status = true;
			}
			else
				if (guess > randomNumber)
				{	System.out.println("Your guess was too high. Try again");
					guessCount++;
				}	
				else
				{	
					System.out.println("Your guess was too low. Try again.");
					guessCount++;
				}
		}
		while (status == false);
		
		System.out.println("I had chosen " + randomNumber + " as the target number.");
		System.out.println("You guessed it in " + guessCount + " tries.");
		if (guessCount == 1)
			System.out.println("That was lucky!");
		else if (guessCount <=4)
			System.out.println("That was amazing!");
		else if (guessCount <=6)
			System.out.println("That was good.");
		else if (guessCount == 7)
			System.out.println("That was OK.");
		else if (guessCount <=9)
			System.out.println("That was not very good.");
		else
			System.out.println("This just isn't your game.");

	}

}
