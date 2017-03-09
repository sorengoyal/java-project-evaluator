/*
 * Project05.java
 * This program randomly generates a number and a user guesses the number from 1 to 100 until they guess correctly.
 * The user then sees how many attempts it took them to guess correctly along with a message. 
 * @author Peter Bosworth
 * @version 20171402 
 */


import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {

		int actualNum = (int) (0 * 100) + 1;

		Scanner keyboard = new Scanner(System.in);

		int guessNum = -1;

		int attemptNum = 0;

		while (actualNum != guessNum) {

			System.out.print("Enter a guess between 1 and 100: ");

			guessNum = keyboard.nextInt();

			if (actualNum > guessNum) {
				System.out.println("Your guess was too low. Try again. ");
			} else if (actualNum < guessNum) {
				System.out.println("Your guess was too high. Try again. ");
			} else if (actualNum == guessNum) {
				System.out.println("Congratulations! Your guess was correct!");
			}
			attemptNum++;
		}
		
		System.out.println("You guessed it in " + attemptNum + " tries.");

		if (attemptNum == 1) {
			System.out.println("That was lucky!");
		} else if (attemptNum <= 4) {
			System.out.println("That was amazing!");
		} else if (attemptNum <= 6) {
			System.out.println("That was good.");
		} else if (attemptNum == 7) {
			System.out.println("That was OK.");
		} else if (attemptNum <= 9) {
			System.out.println("That was not very good.");
		} else {
			System.out.println("This just isn't your game");
		}
	}

}
