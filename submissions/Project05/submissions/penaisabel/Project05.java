/*
 * Project05.java
 * Program that plays Guess The Number game.
 * Used to practice loops.
 * 
 * @author Isabel Pena
 * @version 20170216
 * 
 */


import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int actual = (int)(100 * 0) + 1; // actual randomly generated number
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = keyboard.nextInt(); // user's guess for number
		int count = 0; // how many guesses it takes to get correct
		while (guess != actual) {
				if (guess < 0 || guess > 100) {
					System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
					count++;
					System.out.println();
				}
				else if (guess < actual) {
					System.out.println("Your guess was too low. Try again.");
					count++;
					System.out.println();
				}
				else {
					System.out.println("Your guess was too high. Try again.");
					count++;
					System.out.println();
				}
				System.out.print("Enter a guess between 1 and 100: ");
				guess = keyboard.nextInt();
			}
		if (guess == actual) {
			System.out.println("Congratulations! Your guess was correct!");
			count++;
			System.out.println();
		}
		System.out.println("I had chosen " + actual + " as the target number.");
		System.out.println("You guessed it in " + count + " tries.");
		String message = "";
		if (count == 1) {
			message = "That was lucky!";
		}
		else if (count >= 2 && count <= 4) {
			message = "That was amazing!";
		}
		else if (count == 5 || count == 6) {
			message = "That was good.";
		}
		else if (count == 7) {
			message = "That was OK.";
		}
		else if (count == 8 || count == 9) {
			message = "That was not very good.";
		}
		else {
			message = "This just isn't your game.";
		}
		System.out.println(message);
	}

}
