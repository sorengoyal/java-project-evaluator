/*CSE 1223 Project 05
 * Jason Huang 
 * 20170213
 */

import java.util.Scanner;
public class Project05 {	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int x = (int)(100*0) + 1 ;
		int y = keyboard.nextInt();
		int z = 1;
	
		//Hints for the number 
		while (x != y){
			if (y > 100 || y <= 0){
				System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
			}
			else if (y > x){
				System.out.println("Your guess was too high.  Try again.");
			}
			else if (y < x){
				System.out.println("Your guess was too low.  Try again.");
			}
			z = z + 1;
			System.out.println(" ");
			System.out.print("Enter a guess between 1 and 100: ");
			y = keyboard.nextInt();
		}
	
		
		//Scoring the user
				if (y == x){
					System.out.println("Congratulations!  Your guess was correct!");
					System.out.println(" ");
					System.out.println("I had chosen " + x + " as the target number");
					// If user was lucky
					if (z == 1){
					System.out.println("You had guessed it in 1 try.");
					System.out.println("That was lucky!");
					}
					// If user had to work
					else if (z > 1) {	
						System.out.println("You had guessed it in " + z + " tries.");
						if (z >=2 && z <= 4){
							System.out.println("That was amazing!");
						}
						else if (z == 5 || z == 6){
							System.out.println("That was good.");
						}
						else if (z == 7){
							System.out.println("That was OK.");
						}
						else if (z == 8 || z == 9){
							System.out.println("That was not very good.");
						}
						else {
							System.out.println("This just isn't your game.");
					}
					
					}
				}
	}
}



	


