/*
 * Project05
 * This project will play a simple guessing game with the user.
 * 
 * @author Jessica Yates
 * @version 20170213
 * 
 */

package osu.cse1223;

import java.util.Scanner;
import java.util.Random;

public class Project05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean win = false;
		int userGuesses = 0;
		Random compNumber = new Random();
		int compNumberToGuess = compNumber.nextInt(100);
		System.out.println("Let's play a game!");

		while (win == false) {

			System.out.print("Please enter a number between 1 - 100: ");
			int userGuess = in.nextInt();
			userGuesses++;

			if (userGuess == compNumberToGuess) {
				win = true;
			} else if (userGuess > compNumberToGuess) {
				System.out.println("Your number is too high.");
				System.out.print("Try again. ");
			} else if (userGuess < compNumberToGuess) {
				System.out.println("Your number is too low.");
				System.out.print("Try again. ");
			}
		}
		System.out.println("Your guess is correct!");
		System.out.println("The number to guess was: " + compNumberToGuess);
		System.out.println("It took you " + userGuesses + " guesses.");

		if (userGuesses == 1) {
			System.out.println("That was lucky!");
		} else if (userGuesses >= 2 && userGuesses <= 4) {
			System.out.println("That was amazing!");
		} else if (userGuesses >= 5 && userGuesses <= 6) {
			System.out.println("That was good!");
		} else if (userGuesses == 7) {
			System.out.println("That was OK.");
		} else if (userGuesses >= 8 && userGuesses <= 9) {
			System.out.println("That was not very good.");
		} else if (userGuesses >= 10) {
			System.out.println("This just isn't your game.");
		}

		in.close();
	}
}