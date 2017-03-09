import java.util.Scanner;

/*
 * Project05a.java
 * 
 * @author: Melissa Liang
 * @version: 02152017
 * 
 */
public class Project05a {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int guess = 0;
		int randomValue = (int)(100 * Math.random())+1;
		int tries = 0;	
		boolean stop = true;
				while (stop) {
					System.out.println("Enter a guess between 1 and 100: ");
					guess = Keyboard.nextInt();
					tries = tries + 1;
				
						if (guess > 100 || guess < 1)
						{
							System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
							stop = true;
						}
						else if	(guess > randomValue)
						{
							System.out.println("Your guess was too high. Try again.");
							stop = true;
						}
						else if (guess < randomValue)
						{
							System.out.println("Your guess was too low. Try again.");
							stop = true;
						}
						else 
						{
							System.out.println("Congratulations! Your guess was correct!");
							stop = false;
							System.out.println("I had chosen " + randomValue + " as the target number.");
							System.out.println("You guessed it in " + tries + " tries.");
								if (tries >= 10)
								{
									System.out.println("This just isn't your game.");
								}
								else if (tries > 7 && tries < 10)
								{
									System.out.println("That was not very good.");
								}
								else if (tries != 7)
								{
									System.out.println("That was OK.");
								}
								else if (tries > 4 && tries < 7)
								{
									System.out.println("That was good.");
								}
								else if (tries < 5 && tries > 1)
								{
									System.out.println("That was amazing!");
								}
								else
								{
									System.out.println("That was lucky!");
								}
						}	
						
				}			
				
	}
}
