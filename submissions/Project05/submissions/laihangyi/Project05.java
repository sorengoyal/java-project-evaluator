/*
 * @author Hangyi Lai
 * @date 2017.02.15
 */

import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int guess = in.nextInt();
		int number = (int)(100*0)+1;
		int i = 1;
		while(guess != number){
			if(guess<1||guess>100){
				System.out.println("Your number is out of range. Pick a number between 1 and 100");
			}else if(guess>number){
				System.out.println("Your guess was too high. Try again.");
				i++;
			}else if(guess<number){
				System.out.println("Your guess was too low. Try again.");
				i++;
			}
			System.out.println();
			System.out.print("Enter a guess between 1 and 100: ");
			guess = in.nextInt();
		}
		System.out.println("Congratulations! Your guess was correct!");
		System.out.println();
		System.out.println("I had chosen "+number+" as the target number.");
		System.out.println("You guessed it in "+i+" tries.");
		if(i>=10){
			System.out.println("This just isn't your game.");
		}else if(i>7){
			System.out.println("That was not very good.");
		}else if(i>6){
			System.out.println("That was OK.");
		}else if(i>4){
			System.out.println("That was good");
		}else if(i>1){
			System.out.println("That was amazing!");
		}else{
			System.out.println("That was lucky!");
		}

	}

}
