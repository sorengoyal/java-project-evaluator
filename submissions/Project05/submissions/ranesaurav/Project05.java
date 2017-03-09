/*
 * @author Saurav Rane
 */

import java.util.Scanner;

public class Project05 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		int a,b,c=0;
		b=(int)(0*100+1);
				for(a=0;a<=100;a++){
			System.out.println("Enter a guess between 1 and 100");
			int num1=str.nextInt();
		
			c=c+1;
						if(num1==b){
							System.out.println("Congratulations! Your guess was correct!");
				System.out.println("I had chosen "+b+" as the target number.");
				System.out.println("You guessed it in "+c+" tries.");
				if(c==1){
					System.out.println("That was lucky!");
				
				}
				else if(c>1&&c<=4){
					System.out.println("That was amazing!");}
				else if(c>4&&c<=6){
					System.out.println("That was good.");
	}
				else if(c==7){
					System.out.println("That was OK.");
				}
				else if(c>7&&c<=9){
					System.out.println("That was not very good.");
				}
				else{
					System.out.println("This just isn't your game.");
					
				}
					break;
						}
				else if(num1>b){
					System.out.println("Your guess was too high.Try again.");
					
				}
				else if(num1<b){
					System.out.println("Your guess was too low.Try again.");
					
				}
				else{
					System.out.println("Your guess is out of range. Pick a number between 1 and 100");
					
				}
		}
	}

}
