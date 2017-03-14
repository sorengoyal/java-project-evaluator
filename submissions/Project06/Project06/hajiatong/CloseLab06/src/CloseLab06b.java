//Author Jiatong Ha//
//Version 20170215//
import java.util.Scanner;

public class CloseLab06b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=keyboard.nextLine();
		int count=0;
		boolean c;
		while (!str.equals("")) {
			c=true;
			count=0;
			while (count< (str.length())/2) {
				if(str.charAt(count)!=str.length()-1-count) {
					c=false;
				}
				count=count+1;
			}
			if(c==true){
				System.out.println(str+" is a palindorme");
			}
			else {
				System.out.println(str+" is NOT a palindrome");
			}
			System.out.println();
			System.out.print("Enter a string: ");
			str=keyboard.nextLine();
}
		System.out.print("Empty line read - Goodbye!");
	}

}
