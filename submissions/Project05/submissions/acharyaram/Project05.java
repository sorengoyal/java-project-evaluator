import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num = (int) (100 * 0) + 1;
		int count = 0;
		int guess = 0;
		

		while (guess != num) {
			System.out.print("Enter a guess between 1 and 100: ");
			guess = keyboard.nextInt();

			if (guess > 100 || guess < 1) {
				System.out.println("your guess is  out of range. try again. Pick a number between 1 and 100");

				count++;
			} else if (guess > num) {
				System.out.println("Your guess was too high. Try again.");
				count++;
			} else if (guess < num) {
				System.out.println("Your guess was too low. try agian. ");
				count++;
			}

			else if (guess == num) {

				System.out.println("congratulation! Your guess was Correct! " );
				System.out.println("I had chosen " + guess + " as the target number. ");
				System.out.println("You guessed it in " + count + " tries. ");
				count++;
			}
		}
			
				if (guess >= 10) {
					System.out.println("This just isn't your game.");
				} else if (guess == 8 || guess == 9) {
					System.out.println("That was not very good.");
				} else if (guess == 7) {
					System.out.println("That was OK.");
				} else if (guess == 5 || guess == 6) {
					System.out.println("That was good.");
				} else if (guess == 2 || guess == 3 || guess == 4) {
					System.out.println("That was amazing!");
				} else {
					System.out.println("That was lucky!");
				}
			}
		}
	
