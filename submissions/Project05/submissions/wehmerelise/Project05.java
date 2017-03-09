/*
 * Project05.java
 * This code does a simple guess the number game. It generates a random number between 1 and 100 and has the user guess. 
 * Once the user gets it right it displays a message depending on how many guesses it took.
 * 
 * @author Elise Wehmer
 * @version 02082017
 */

import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		// set up keyboard for input
		Scanner keyboard = new Scanner(System.in);
		// generate a random number between 1 and 100
		int value = (int)(100 * 0) + 1;
		// set up counter to count number for guesses
		int counter = 1;
		//ask user for initial guess
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = keyboard.nextInt();
		// set up while loop to count number of guess and get new guess
		while (guess != value){
			counter = counter + 1;
			//set up if loop to help with user guessing
			if (guess < value){ // guess is too low
				System.out.println("Your guess is too low. Try again.");
			}
			else if (guess > value){ // guess is too high
				System.out.println("Your guess is too high. Try Again.");
			}
			else if (guess < 1 || guess > 100){ // guess is out of range
				System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
			}
			// get new guess
			System.out.print("Enter a guess between 1 and 100: ");
			guess = keyboard.nextInt();
		}
		// they have guessed correctly
		System.out.println("Congratulations! Your guess was correct!");
		System.out.println("I had chosen " + value + " as the target number.");
		System.out.println("You guessed it in " + counter + " tries.");
		//set up if loop to display message based on how many guesses it took
		if (counter == 1){
			System.out.println("That was lucky!");
		}
		else if (counter >= 2 && counter <= 4){
			System.out.println("That was amazing!");
		}
		else if (counter >= 5 && counter <= 6){
			System.out.println("That was good.");
		}
		else if (counter == 7){
			System.out.println("That was OK.");
		}
		else if (counter >= 8 && counter <= 9){
			System.out.println("That was not very good.");
		}
		else{ //more than 10 guesses
			System.out.println("This just isn't your game.");
		}
	}
}
