package osu.cse1223;

import java.util.Scanner;
import java.util.Random;

public class Project05 {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(9)+1;
		int tries = 0; 
		String a ="";
		
		Scanner keyboard = new Scanner(System.in);
		int guess;
		boolean win = false;
		while (win == false) {
			System.out.print("Enter a guess between 1 and 100: ");
			guess = keyboard.nextInt();
			tries++;
				
				if(guess >= 100){
				System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
				}
				else if (guess <=0){
					System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
				}
				else if (guess == number){
						win = true;
					}
				else if (guess < number) {
						System.out.println("Your guess was too low.  Try again.");
						System.out.println("");
					}	
				else if (guess> number){
						System.out.println("Your guess was too high.  Try again.");
						System.out.println("");
					}
				}
				
					
				
				
		if (tries >= 10){
			a ="This just isnt your game.";
		}
		else if (tries >= 8){
			a = "That was not very good.";
		}
		else if (tries >= 7){
			a = "That was ok.";
		}
		else if (tries >= 5){
			a = "That was  good.";
		}
		else if (tries >= 2){
			a = "That was amazing!";
		}
		else if (tries == 1){
			a = "That was lucky!";
		}
		
		System.out.println("Congratulations!  Your guess was correct!");
		System.out.println("");
		System.out.println("I had chosen " + number + " as the target number.");
		System.out.println("You guessed it in " + tries + " tries.");
		System.out.println(a);
			
		
	}

}
