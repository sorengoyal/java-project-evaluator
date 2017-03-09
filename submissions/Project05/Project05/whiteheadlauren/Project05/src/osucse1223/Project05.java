/*
 * @author Lauren Whitehead
 * @version 20170215
 */
package osucse1223;
import java.util.Scanner;
public class Project05 {

	public static void main(String[] args) {
	
	int number;
	number = (int) (Math.random() * 99 + 1);
	
	Scanner keyboard = new Scanner(System.in);
	int guess;
	int count =0;
	
	do {
	System.out.print("Enter a guess (1-100): ");
	guess = keyboard.nextInt();
	count++;
	
	if (guess == number) {
		System.out.println("Congratulations! Your guess was correct");
	}
	else if (guess < number) {
		System.out.println("Your guess was too low. Try again.");
	}
	else if (guess > number) {
		System.out.println("Your guess was too high. Try again.");
	}
	} while (guess != number);
		
	System.out.println("I had chosen " + number + " as the target number.");
	System.out.println("You guessed it in " + count + " tries.");
	
	if (count == 1) {
		System.out.println("That was lucky!");
	}
	else if (count > 1 && count <= 4) {
		System.out.println("That was amazing!");
	}
	else if (count > 4 && count <= 6) {
		System.out.println("That was good.");
	}
	else if (count == 7) {
		System.out.println("That was OK");
	}
	else if (count > 7 && count <= 9) {
		System.out.println("That was not very good.");
	}
	else if (count >= 10) {
		System.out.println("This just isnt your game.");
	}
		
	}

}
