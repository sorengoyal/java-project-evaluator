/*
 * This program is a simple guess the number game
 * 
 * @author Zach Kingery
 * @version 201702215
 */
import java.util.Scanner;

public class Project05 {public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int RandomNumber = (int)(100 * 0) + 1;
	int UserGuesses = 0;
	int Guess;
	boolean win = false;
	
	while (win == false) {
	System.out.print("Please enter a guess between 1 and 100: ");
	Guess = keyboard.nextInt();
	UserGuesses++;
	if (Guess == RandomNumber){
		System.out.println("Congratulations! Your guess was correct. ");
		win = true;}
	else if (Guess < RandomNumber){
		System.out.println("That guess was too low. Try again. ");}
	else if (Guess > RandomNumber){
		System.out.println("That guess was too high. Try again. ");}
	}
	System.out.println("The number to guess was " + RandomNumber);
	
	
	if (UserGuesses == 1){
		System.out.println("You guessed it in 1 try");
		System.out.println("That was lucky!");}
	else if (UserGuesses == 2 || UserGuesses == 3 || UserGuesses == 4){
		System.out.println("You guessed it in " + UserGuesses + " try.");
		System.out.println("That was amazing!");}
	else if (UserGuesses == 5 || UserGuesses == 6){
		System.out.println("You guessed it in " + UserGuesses + " tries.");
		System.out.println("That was good");}
	else if (UserGuesses == 7){
		System.out.println("You guessed it in " + UserGuesses + " tries.");
		System.out.println("That was OK");}
	else if (UserGuesses == 8 || UserGuesses == 9){
		System.out.println("You guessed it in " + UserGuesses + " tries.");
		System.out.println("That was not very good");}
	else{
		System.out.println("You guessed it in " + UserGuesses + " tries.");
		System.out.println("This just isn't your game.");}
	}}




