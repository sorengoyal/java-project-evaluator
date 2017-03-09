

import java.util.Scanner;
public class PJ05 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Guess a number between 1 and 100");
		int x=keyboard.nextInt();
		int y=(int)(100*Math.random()+1);
		int total=0;
		while (x!=y){
			if (x<y&&x>=1){
				System.out.println("Your guess was too low. Try again");
				total=total+1;
			}
			if (x>y&&x<=100){
				System.out.println("Your guess was too high. Try again");
				total=total+1;
			}
			if (x<1||x>100){
				System.out.println("Your guess is out of range. Pick a number between 1 and 100.");
				total=total+1;
			}
			x=keyboard.nextInt();
		}
		if (x==y){
			System.out.println("Congratulations! Your guess was correct!");
			total=total+1;
		}
		System.out.println("I had chosen "+y+" as the target number");
		System.out.println("You guessed it in "+total+" tries");
		if (total==1){
			System.out.println("That was lucky!");
		}
		if (total<=4&&total>2){
			System.out.println("That was amazing!");
		}
		if (total<=6&&total>5){
			System.out.println("That was good.");
		}
		if (total==7){
			System.out.println("That was OK.");
		}
		if (total<=9&&total>7){
			System.out.println("That was not very good.");
		}
		if (total>=10){
			System.out.println("This just isn't your game.");
		}
		}
	}


