//Author Jiatong Ha//
//version 20170215//
import java.util.*;
public class Project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int x= (int)(100 * Math.random()) + 1;
		System.out.println("Enter a guess between 1 and 100:");
		int y=keyboard.nextInt();
		int n=0;
		while(y!=x){
			if((y>100)||(y<1)){
				System.out.println("Your guess is out of range. Pick a number between 1 and 100");
				y=keyboard.nextInt();
			}
			else{
				if(y<x){
					System.out.println("Your guess is too low. Try again");
					y=keyboard.nextInt();
					n++;
				}
			}
		}
		if(y==x){
			System.out.println("I had chosen "+x+" as the target number");
			System.out.println("You guessed it in "+n+" tries");
			if(n==1){
				System.out.println("That was lucky!");
			}
			if((n>=2)&&(n<=4)){
				System.out.println("That was amazing!");
			}
			else if((n>=5)&&(n<=6)){
				System.out.println("That was good.");
			}
			else if(n==7){
				System.out.println("That was OK.");
			}
			else if((n>=8)&&(n<=9)){
				System.out.println("That was not very good.");
			}
			else if(n>=10){
				System.out.println("This just isn't your game.");
			}
		}
	}

}
