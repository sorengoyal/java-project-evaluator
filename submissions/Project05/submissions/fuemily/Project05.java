/*
 * Project 5 - more branching! and learning about math.random function
 * 
 * @author Emily Fu
 * @version due 20170216
 */
import java.util.Scanner;
public class Project05 {
	public static void main(String[] args) {
	int setNumber=(int)(0*100 +1);//sets the number to be "guessed" between 1-100
	Scanner keyboard=new Scanner(System.in);
	System.out.print("Enter a guess between 1 and 100:");
	int guessNumber=keyboard.nextInt();
	int i=1;//set "count" variable
	if (guessNumber >100 || guessNumber <=0 ){
		System.out.println("Your guess is out of range. Pick a number between 1 and 100: " );
		guessNumber=keyboard.nextInt();
		
		while (guessNumber != setNumber){
			if (guessNumber > setNumber){
				System.out.println("Your guess was too high. Try again.");
			}
			else if (guessNumber < setNumber){
				System.out.println("Your guess was too low. Try again.");
			}
		System.out.println("Enter a guess between 1 and 100:");
		guessNumber=keyboard.nextInt();
		i=i+1;
		}
		}
	else {
	
		while (guessNumber != setNumber){
			if (guessNumber > setNumber){
				System.out.println("Your guess was too high. Try again.");
			}
			else if (guessNumber < setNumber){
				System.out.println("Your guess was too low. Try again.");
			}
		System.out.println("Enter a guess between 1 and 100:");
		guessNumber=keyboard.nextInt();
		i=i+1;
		}
		System.out.println("Congratulations! Your guess was correct!");
	}
	System.out.println("I had chosen " + setNumber + " as the target number.");
	System.out.println("You guessed it in " + i + " tries.");
	//set the conditions for number of "guesses" feedback statement
	if (i==1){
		System.out.println("That was lucky!");
	}
	else if (i >=2 && i <=4 ){
		System.out.println("That was amazing!");
	}
	else if (i==5 || i==6){
		System.out.println("That was good.");
	}
	else if (i==7){
		System.out.println("That was OK.");
	}
	else if (i==8 || i==9){
		System.out.println("That was not very good.");
	}
	else if (i >=10){
		System.out.println("This just isn't your game.");
	}
	}

}
