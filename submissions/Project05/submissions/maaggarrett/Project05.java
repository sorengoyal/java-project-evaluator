
/* This code will generate a number between 1 & 100, then have the user guess it.
 * Once guessed correctly, it was provide a variety of feedback and a message based
 * on the number of attempts made.
 * 
 * @author Garrett Maag
 * @version 20170213
 */

import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		int x = (int)(100 * 0) + 1;
		int y = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int i = keyboard.nextInt();
		while (i < 0 || i > 100) {
			System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
			System.out.println();
			System.out.print("Enter a guess between 1 and 100: ");
			i = keyboard.nextInt();
			y = y + 1;
		}
		while (i != x) {
			 if(i < x) {
				 System.out.println("Your guess was too low. Try again.");
				 System.out.println();
				 System.out.print("Enter a guess between 1 and 100: ");
				 i = keyboard.nextInt();
				 y = y + 1;
			 }
			 else {
				 System.out.println("Your guess was too high. Try again.");
				 System.out.println();
				 System.out.print("Enter a guess between 1 and 100: ");
				 i = keyboard.nextInt();
				 y = y + 1;
			 }
		}
		System.out.println("Congratulations! Your guess was correct!");
		System.out.println();
		System.out.println("I had chosen " + x + " as the target number");
		y = y + 1;
		if(y == 1) {
			System.out.println("You guessed it in 1 try.");
		}
		else {
			System.out.println("You guessed it in " + y + " tries.");
		}
		if (y == 1) {
			System.out.println("That was lucky!");
		}
		else if (y >= 2 && y <= 4) {
			System.out.println("That was amazing!");
		}
		else if (y >= 5 && y <= 6) {
			System.out.println("That was good.");
		}
		else if (y == 7) {
			System.out.println("That was OK.");
		}
		else if (y == 8 || y == 9) {
			System.out.println("That was not very good.");
		}
		else {
			System.out.println("This just isn't your game.");
		}
	}

}
