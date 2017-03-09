/*
 * Project05.java
 * 
 * This program will generate a random number and then have the user guess the correct number. The program will
 * then say how many guesses it took to be correct
 * 
 * @author Paul Towery
 * @version 02142017
 */


import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//First I generate a random number and get the first guess
		int randomNumber = (int)(100 * 0) + 1;
		System.out.print("Please enter a guess between 1 and 100: ");
		int userGuess = keyboard.nextInt();
		int totalGuesses = 1;
		//now I create a loop that will run until the correct answer is guessed
		while (userGuess != randomNumber){
			if (userGuess > 100 || userGuess < 1){
				System.out.print("Your guess is out of range, please enter guess between 1 and 100: ");
			}
			else if (userGuess > randomNumber){
				System.out.print("Your guess was too high. Please guess again: ");
			}
			else{
				System.out.print("Your guess was too low. Please guess again: ");
			}
			userGuess = keyboard.nextInt();
			totalGuesses++;
		}
		//Now I tell the user information about their guesses and determine how well they played
		System.out.println("Congratulations! Your guess was correct!");
		System.out.println();
		System.out.println("I had chosen " + randomNumber + " as the target number.");
		System.out.println("You guessed it in " + totalGuesses + " tries.");
		if (totalGuesses == 1){
			System.out.println("That was lucky!");
		}
		else if (totalGuesses < 5){
			System.out.println("That was amazing!");
		}
		else if (totalGuesses < 7){
			System.out.println("That was good.");
		}
		else if (totalGuesses < 8){
			System.out.println("That was ok.");
		}
		else if (totalGuesses < 10){
			System.out.println("That was not very good.");
		}
		else{
			System.out.print("This just isn't your game...");
		}

	}

}
