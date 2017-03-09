/*
 * Project 5
 * Guessing game
 * 
 * @author Nick Eifel
 * @version 20170216
 */
package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int i=0, guessNum = 0, randomValue =0;
		randomValue=  (int)(100 * Math.random()) + 1;
		
	while (randomValue != guessNum){
		i++;
		
		System.out.println("Enter a guess between 1 and 100");
		guessNum=keyboard.nextInt();
		
		
		if (guessNum<randomValue){
			System.out.println("Your guess was too low. Try again");
		}
			else if(guessNum>randomValue){
			System.out.println("Your guess was too high. Try again");
		}
			else if (guessNum==randomValue){
				System.out.println("Congratulations! Your guess was correct!");
			
		
				System.out.println("I had chosen "+randomValue+" as the target number.");
				System.out.println("You guessed it in "+i+" tries.");
		

				if (i==1){
					System.out.println("That was lucky!");
				}
				else if (i<=4){
				System.out.println("That was amazing!");
				}
				else if (i<=6){
				System.out.println("That was good.");
				}
				else if (i==7){
				System.out.println("That was OK.");
				}
				else if (i<9){
				System.out.println("That was not very good.");
				}
				else {
				System.out.println("This just isn't your game");
			}
		}
	}	
}
}