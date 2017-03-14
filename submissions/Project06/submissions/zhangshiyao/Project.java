/*
 * Project07.java
 * 
 *   A program that plays the dice game high/low
 *   Used to practice breaking code up into methods. 
 * 
 * @author Shiyao Zhang
 * 
 */
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int money = 100;
		int bet=1;
		
		while (money > 0 && bet !=0)
		{
			System.out.println("You have "+ money+" dollars");
			bet = getBet(in,money);
			
			if (bet != 0)
			{
			char input = getHighLow(in);
			int die1 = getRoll();
			int die2 = getRoll();
			int total = die1 +die2;
			System.out.println("Die 1 rolls: " + die1);
			System.out.println("Die 2 rolls: " + die2);
			System.out.println("Total of two dice is: " + total);
			int winnings = determineWinnings(input, bet, total);
			if ( winnings <0)
			{System.out.println("You lost! "); }
			if ( winnings >0)
			{System.out.println("You won " + winnings + " dollars!"); }	
			money = winnings + money;
			System.out.println();
			}
		}	
		System.out.println("You have "+ money+" dollars left");
		System.out.println("Goodbye!");
		
		}
	
	
	// Given a Scanner and a current maximum amount of money, prompt the user for
	// an integer representing the number of dollars that they want to bet.  This
	// number must be between 0 and to maximum number of dollars.  If the user enters
	// a number that is out of bounds, display an error message and ask again.
	// Return the bet to the calling program.
	private static int getBet(Scanner inScanner, int currentPool) {
		System.out.print("Enter an amount to bet (0 to quit): ");
		int bet = inScanner.nextInt();
				while (bet <0 || bet > currentPool)
				{
				System.out.println("Your bet MUST be between 0 and " + currentPool + " dollars.");
				System.out.println("You have " + currentPool + " dollars.");
				System.out.print("Enter an amount to bet (0 to quit): ");
				bet = inScanner.nextInt();
				}
		
		return bet;
		}
	
	
	// Given a Scanner, prompt the user for a single character indicating whether they
	// would like to bet High ('H'), Low ('L') or Sevens ('S').  Your code should accept
	// either capital or lowercase answers, but should display an error if the user attempts
	// to enter anything but one of these 3 values and prompt for a valid answer.
	// Return the character to the calling program.
	private static char getHighLow(Scanner inScanner) {
		System.out.print("High, low or sevens (H/L/S): ");
		String highLow = inScanner.nextLine();
		while (!highLow.equals("H") && !highLow.equals("h") && !highLow.equals("L") && !highLow.equals("l") && !highLow.equals("S") && !highLow.equals("s"))
		{
			System.out.print("Error!");
			System.out.print("High, low or sevens (H/L/S): ");
			highLow = inScanner.nextLine();
		}
		char convertHighLow = highLow.charAt(0);
		return convertHighLow;
		// Fill in the body
	}
	
	// Produce a random roll of a single six-sided die and return that value to the calling
	// program
	private static int getRoll() {
		int roll =  (int)(6 * 0) + 1;
		return roll;
		// Fill in the body
	}
	
	// Given the choice of high, low or sevens, the player's bet and the total result of
	// the roll of the dice, determine how much the player has won.  If the player loses
	// the bet then winnings should be negative.  If the player wins, the winnings should
	// be equal to the bet if the choice is High or Low and 4 times the bet if the choice
	// was Sevens.  Return the winnings to the calling program.
	private static int determineWinnings(char highLow, int bet, int roll) {
		int winning = 0;
		if ((roll >=8 && (highLow == 'H' || highLow == 'h')) || (roll <=6 && (highLow == 'L' || highLow == 'l')) || (roll == 7 && (highLow == 'S' || highLow == 's'))  )
		{	if (highLow == 'H' || highLow == 'h' || highLow == 'L' || highLow == 'l')
			{	
			winning = bet;
			}
			if (highLow == 'S' || highLow == 's')
			{
			winning = 4*bet;
			}
		}	
		else
		{winning = 0-bet;}
		
		return winning;
	}

}