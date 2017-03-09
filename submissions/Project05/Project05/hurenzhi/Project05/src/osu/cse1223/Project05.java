/*
 * @author Renzhi Hu
 * @version 02162017
 */
package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		int random = (int)(100 * Math.random());
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int user = in.nextInt();
		//
		int i = 1;
		while (user != random){
			if (user > random){
				System.out.println("Your guess was too high. Try again.");
			}
			else{
				System.out.println("Your guess was too low. Try again.");
			}
			i++;
			System.out.print("Enter a guess between 1 and 100: ");
			user = in.nextInt();
		}
		//
		if (user == random){
			System.out.println("Congratulations! Your guess was correct!");
		}
		//
		String result = "That was lucky!";
		if (i >= 10){
			result = "This just isn't your game.";
		}
		else if (i >= 8){
			result = "That was not very good.";
		}
		else if (i == 7){
			result = "That was OK.";
		}
		else if (i >= 5){
			result = "That was good.";
		}
		else if (i >= 2){
			result = "That was amazing!";
		}
		//
		System.out.println("I had chosen " + random + " as the target number.");
		System.out.println("You guessed it in " + i + " tries.");
		System.out.print(result);
	}

}
