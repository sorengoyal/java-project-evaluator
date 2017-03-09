/**
 * 
 * @author zhaoqi
 *@version Feb 16 2017
 */
import java.util.Scanner;
public class project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int) (100*Math.random()+1);
		Scanner cc = new Scanner(System.in);
		System.out.print("Enter a guess between 1 and 100: ");
		int player = cc.nextInt();
		int count = 1;
	
	while (player != random)
	{
		if (player > random)
		{
			System.out.println("Your guess was too high.  Try again.");
			System.out.print("Enter a guess between 1 and 100: ");
			player = cc.nextInt();
			count = count +1;
		}
		else
		{
			System.out.println("Your guess was too low.  Try again.");
			System.out.print("Enter a guess between 1 and 100: ");
			player = cc.nextInt();
			count = count +1;
		}
	}
	System.out.println("Congratulations!  Your guess was correct!");
	if (count == 1)
	{
		System.out.println("That was lucky!");
	}
	else if (2 <= count && count <= 4)
	{
		System.out.println("That was amazing!");
	}
	else if (5 <= count && count <= 6)
	{
		System.out.println("That was good.");
	}
	else if (count == 7)
	{
		System.out.println("That was OK.");
	}
	else if (8 <= count && count <= 9)
	{
		System.out.println("That was not very good.");
	}
	else if (10 <= count)
	{
		System.out.println("This just isn't your game.");
	}
}
}
