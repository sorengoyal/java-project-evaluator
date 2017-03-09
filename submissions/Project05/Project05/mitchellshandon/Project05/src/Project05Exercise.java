/*
 * Shandon Mitchell
 * 02/13/2017
 * 
 */
import java.util.Scanner;

public class Project05Exercise {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		
		int guess = keyboard.nextInt();		
		int correctInt = (int)(100 * Math.random()) + 1;
		int attempt = 0;
		while (guess != correctInt){
			if (guess < correctInt && guess >= 0) {System.out.println("Your guess was too low. Try again.");}
			else if (guess > correctInt && guess <= 100) {System.out.println("Your guess was too high. Try again.");}
				else {System.out.println("Your guess is out of range. Pick a number between 1 and 100.");}
			attempt = attempt + 1;
			
			System.out.println("");
			System.out.print("Enter a guess between 1 and 100: ");
			guess = keyboard.nextInt();
		}
		System.out.println("");
		System.out.print("Congratulations! Your guess was correct!");
		System.out.println("");
		System.out.println("");
		System.out.println("I had chosen " + correctInt + " as the target number.");
		System.out.println("You guessed it in " + attempt + " tries.");
		if (attempt == 1){System.out.println("That was lucky!");}
		if (attempt >= 2 && attempt <= 4){System.out.println("That was amazing!");}
		if (attempt == 5 || attempt == 6){System.out.println("That was good.");}
		if (attempt == 7){System.out.println("That was OK.");}
		if (attempt == 8 || attempt == 9){System.out.print("That was not very good.");}
		if (attempt >= 10) {System.out.println("This just isn't your game.");}}
		
}


