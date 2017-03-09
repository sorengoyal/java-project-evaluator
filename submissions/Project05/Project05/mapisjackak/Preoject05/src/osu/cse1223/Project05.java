/*
 * This program will pick a random number between 1 and 100 and ask the user to	guess the value.  
 * it will keep prompting the user for the right number, giving hints such as too high or too low. 
 * Finally if the user gets it right, it will congratulate him/her and tell the user the number it chose 
 * Based on the number of tries it takes the user to guess the number, the program will advise him/her whether this their game or not.
 * 
 * @author Jackak Mapis
 * @version 2/13/17
 */


package osu.cse1223;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
        int Rand = (int) (100*Math.random())+1;
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        int userChoice;  
        boolean win = false;        
        while (win == false ){
            System.out.print("Enter a guess between 1 and 100: ");
            userChoice = keyboard.nextInt();
            count++;
            if(userChoice < 1 ||userChoice > 100){
                System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
                System.out.println();
            }
            else if (userChoice == Rand){
                win = true;
                System.out.println("Congratulations!  Your answer was correct! ");
            }       
            else if (userChoice < Rand){
                System.out.println("Your guess was too low.  Try again. ");
                System.out.println();
            }
            else if (userChoice > Rand){
                System.out.println("Your guess was too high.  Try again. ");
                System.out.println();
            }

        }
        if(count == 1){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("That was lucky!");
        }
        else if (count > 2 && count <= 4){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("That was amazing!");
        }
        else if (count > 5 && count <= 6){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("That was good.");
        }
        else if (count == 7){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("That was OK.");
        }               
        else if (count > 8 && count <= 9){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("That was not very good.");
        }
        else if (count > 10){
            System.out.println();
            System.out.println("I had chosen " + Rand + " as the target number.");
            System.out.println("You guessed it in " + count + " tries.");
            System.out.println("This just isn't your game.");


	}
  }
}
