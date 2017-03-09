
import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {

	// Generate a random number
	int randomNum = (int)(100*0) - 1;
	Scanner keyboard = new Scanner(System.in);
	// Get user's initial guess
	System.out.print("Enter a guess between 1 and 100: ");
	int guessNum = keyboard.nextInt();
	int tries = 1;
	// Until the user guesses it, give them a hint and have them guess again
	while (guessNum != randomNum) {
		tries = tries + 1;
		if (guessNum < randomNum) {
			System.out.println("Your guess was too low. Try again.");
		}
		else {
			System.out.println("Your guess was too high. Try again.");
		}
		System.out.print("\nEnter a guess between 1 and 100: ");
		guessNum = keyboard.nextInt();
	}
	// Once they guess it, let them know what the number was and tell them how many guesses it took
	System.out.println("Congratulations! Your guess was correct!");
	System.out.println("\nI had chosen " + randomNum + " as the target number.");
	System.out.println("You guessed it in " + tries + " tries.");
	// Tell the user how well they did based on number of tries
	if (tries == 1) {
		System.out.println("That was lucky!");
	}
	else if (tries <= 4) {
		System.out.println("That was amazing!");
	}
	else if (tries <= 6) {
		System.out.println("That was good.");
	}
	else if (tries == 7) {
		System.out.println("That was OK.");
	}
	else if (tries <= 9) {
		System.out.println("That was not very good.");
	}
	else {
		System.out.println("This just isn't your game.");
	}
}
}
