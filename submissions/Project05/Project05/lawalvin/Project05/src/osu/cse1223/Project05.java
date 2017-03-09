/* 
 * Project05.java
 * 	A simple program that takes guesses for a random number.
 * 	Continues to prompt for another guess until random number is picked.
 * 
 * 	@author Alvin Law
 * 	@version 20170215
 * 
 */
package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in); //Initializes scanner
		int number=(int)(100 * Math.random())+1; //Generate random number
		System.out.print("Enter a guess between 1 and 100: "); //Prompt initial guess
		int guess=keyboard.nextInt(); //Record input for first guess
		int guesses=0; //Set amount of guesses

		//Loop until the number is guessed correctly
		while (number!=guess){ 
			if(guess<number){ //Result if guess is under number 
				System.out.println("Your guess was too low. Try again.\n"); //Low prompt
				System.out.print("Enter a guess between 1 and 100: "); //Prompt again
				guess=keyboard.nextInt(); //Record new prompt
				guesses=guesses+1; //Add 1 to total of guesses
			}
			else if(guess>number){
				System.out.println("Your guess was too high. Try again.\n");		
				System.out.print("Enter a guess between 1 and 100: ");
				guess=keyboard.nextInt();
				guesses=guesses+1;
			}
		}

		//Outputs when number is guessed correctly
		guesses=guesses+1; //Add 1 to total guesses
		System.out.println("Congratulations! Your guess was correct!\n"); //Congratulations
		System.out.println("I had chosen "+number+" as the target number."); //Print random number
		System.out.println("You guessed it right in "+guesses+" tries."); //Print total guesses
		if(guesses==1){ //Number of guesses 
			System.out.println("That was lucky!"); //Output message for number of guesses
		}
		else if(guesses<=4){
			System.out.println("That was amazing!");
		}
		else if(guesses<=6){
			System.out.println("That was good.");
		}
		else if(guesses==7){
			System.out.println("That was OK.");
		}
		else if(guesses<=9){
			System.out.println("That was not very good.");
		}
		else {
			System.out.println("This just isn't your game.");
		}

	}

}
