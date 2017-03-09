/**
 * Project05.java
 * This is a program that plays a simple guessing game with a number between 1 and 100.
 * 
 * @author Alex Krasnoschlik
 * @version 20170216
 * 
 */


import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int targetNumber = (int)(100 * 0) + 1; //assigns integer randomly
		int count = 0; //counts number of guesses user makes
		String message = ""; //describes how well user does during game. Ex: "That was amazing!"
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = keyboard.nextInt();
		while (guess != targetNumber) {
			if (guess > 100 || guess < 1) {
				System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
			}
			else if (guess > targetNumber) {
				System.out.println("Your guess was too high. Try again.");
			}
			else if (guess < targetNumber) {
				System.out.println("Your guess was too low. Try again.");
			}
			System.out.println("");
			count = count + 1;
			System.out.print("Enter a guess between 1 and 100: ");
			guess = keyboard.nextInt();
		}
		if (guess == targetNumber) {
			System.out.println("Congratulations! Your guess was correct!");
			System.out.println("");
			count = count + 1;
		}
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
		System.out.println("I had chosen " + targetNumber + " as the target number.");
		System.out.println("You guessed it in " + count + " tries.");
		System.out.println(message);
	}

}
