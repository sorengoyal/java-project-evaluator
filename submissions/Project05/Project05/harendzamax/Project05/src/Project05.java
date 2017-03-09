import java.util.Scanner;
public class Project05 {
/*
 * This program prompts the user to enter a number between 0 and 100. The program will then 
 * let the user know if their input was too high or too low and ask them to give another 
 * input based on the feedback.
 * 
 * @author Max Harendza
 * @version 02162017
 */
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		int x = (int)(100 * Math.random())+ 1;
		int entries = 0;
		boolean win = false;
		while (win == false){
			System.out.print("Enter a guess between 1 and 100: ");
			int in = input.nextInt(); entries++;
			
		if (x > in ){
			System.out.println("Your guess was too low. Try again");
		}
		else if (x < in){
			System.out.println("Your guess was too high. Try again");
		}
		else if ( x == in){
			System.out.println("Congradulations! Your guess was correct!");
			System.out.println(" ");
			System.out.println("I have chosen " + x + " as the target number.");
			System.out.println("You guessed it in " + entries + " tries.");
			if (entries == 1){
				System.out.println("That was lucky!");
			}
			else if (entries == 2 || entries == 3 || entries == 4){
				System.out.println("That was amazing!");
			}
			else if (entries == 5 || entries == 6){
				System.out.println("That was good.");
			}
			else if (entries == 7){
				System.out.println("That was OK.");
			}
			else if (entries == 8 || entries == 9){
				System.out.println("That was not very good");
			}
			else{
				System.out.println("This just isn't your game.");
			}
		}
		}

	}

}
