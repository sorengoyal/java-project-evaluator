
import java.util.Scanner;

public class Project05 {	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int num = (int)(0*100+1);
		int i = 0;
		int count = 0;
		
		while(i!=1){
			System.out.print("Enter a guess between 1 and 100: ");
			int guess = keyboard.nextInt();
			if (guess<100 && guess>0){
				if (guess==num)
					i=1;
				else if (guess>num)
					System.out.println("Your guess was too high.  Try again.");
				else if (guess<num)
					System.out.println("Your guess was too low.  Try again");
				count=count+1;
				
				}
		}
			System.out.println("I had chosen " + num + " as the target number.");
			System.out.println("You guessed it in " + count + " tries.");
			
			if (count == 1)
				System.out.println("That was lucky!");
			else if (count <= 4)
				System.out.println("That was amazing.");
			else if (count <= 6)
				System.out.println("That was good.");
			else if (count == 7)
				System.out.println("That was OK.");
			else if (count <= 9)
				System.out.println("That was not very good");
			else
				System.out.println("This just isn't your game.");
				
				
			}
			
		
		

}
