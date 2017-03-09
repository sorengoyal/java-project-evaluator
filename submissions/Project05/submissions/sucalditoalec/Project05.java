
import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		int tries = 0;
		int rand = (int)(100*0)+1;
		System.out.print("Enter a guess between 1 and 100:");
		int guess = keyboard.nextInt();
		int win = 0;
		while (win==0){
			if ((guess>100)||(guess<1)){ //not in range
				System.out.println("Your guess is out of range. Pick a number between 1 and 100");
				tries = tries +1 ;
				System.out.print("Enter a guess between 1 and 100: ");
				guess = keyboard.nextInt();
						
			}//above actual number
			else if (guess>rand){
				System.out.println("Your guess was too high. Try again. ");
				tries = tries +1;
				System.out.print("Enter a guess between 1 and 100: ");
				guess = keyboard.nextInt();
			}
			else if (guess<rand){
				System.out.println("Your guess was too low. Try again. ");
				tries = tries +1;
				System.out.print("Enter a guess between 1 and 100: ");
				guess = keyboard.nextInt();
		}
			else if (guess==rand){
				System.out.println("Congratulations! Your guess was correct! ");
				tries = tries +1;
				win = win +1;
				
	}

}
		System.out.println("I had chosen " + rand + " as the target number");
		System.out.println("You guessed it in " + tries + " tries");
		if (tries ==1){
			System.out.println("That was lucky!");
		}
		else if (tries <= 4){
			System.out.println("That was amazing!");
		}
		else if(tries <=6){
			System.out.println("That was good");
		}
		else if (tries <= 7){
			System.out.println("That was OK!");
		}
		else if (tries <= 9){
			System.out.println("That was not very good!");
		}
		else {
			System.out.println("This just isn't your game");
		}
}
}
