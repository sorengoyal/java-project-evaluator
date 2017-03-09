/* Project05.java
 * 
 * Random integer between 1 and 100 generated. User is prompted
 * to guess the number until they are correct. Hints will be output
 * when user is wrong and comment on how well user did.
 * 
 * @author Nicole Gatt
 * @version 20170215
 */


import java.util.Scanner;
public class Project05 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double gen = (int) (0*100)+1;   //random number 1-100 generated
		
		int guess = -1; //guess is started as not equal to the number generated as it is out of range
		int tries = 0;  //initialize amount of tries to 0
			
		
		while (guess != gen){
			System.out.print("Enter a guess between 1 and 100: ");  //user prompted to enter an integer
			guess = keyboard.nextInt();
			if (guess < 1 | guess > 100){   //guess out of range
				System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
				tries ++;
			}
			else if (guess < gen){     //guess less than answer
				System.out.println("Your guess was too low. Try again.");
				tries ++;
			}
			else if (guess > gen){    //guess greater than answer
				System.out.println("Your guess was too high. Try again.");
				tries ++;
			}
			
			
		}
		
		System.out.println("I had chosen " + guess + " as the target number.");  //reveal answer
		System.out.println("You guessed it in " + (tries + 1) + " tries.");   //user told how many tries it took to get answer
		
		if (tries == 1){    //unique comment depending on how many tries it took
			System.out.println("That was lucky!");
		}
		else if (tries >= 2 && tries <= 4){
			System.out.println("That was amazing!");
		}
		else if (tries >= 5 && tries <= 6){
			System.out.println("That was good.");
		}
		else if (tries == 7){
			System.out.println("That was OK.");
		}
		else if (tries >= 8 && tries <= 9){
			System.out.println("That was not very good.");
		}
		else if (tries >= 10){
			System.out.println("This just isn't your game.");
		}
		
	}
}
