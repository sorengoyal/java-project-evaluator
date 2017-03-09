import java.util.Scanner;
public class RightProject06 {

	public static void main(String[] args)	{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter a UPC (enter a blank line to quit): ");
		String str = keyboard.nextLine();
		
		int x = str.length();
		int check = 0;
		
	

	while (x != 0)	{
		
		
	if (x < 12 || x > 12)	{
		System.out.println("ERROR! UPC MUST have exactly 12 digits");
		System.out.print("\nEnter a UPC (enter a blankline to quit): ");
		str = keyboard.nextLine();
		x = str.length();
	}
	
	while (x == 12)	{
		
		int odd1 = Character.getNumericValue(str.charAt(0));
		int odd2 = Character.getNumericValue(str.charAt(2));
		int odd3 = Character.getNumericValue(str.charAt(4));
		int odd4 = Character.getNumericValue(str.charAt(6));
		int odd5 = Character.getNumericValue(str.charAt(8));
		int odd6 = Character.getNumericValue(str.charAt(10));
		
		int even1 = Character.getNumericValue(str.charAt(1));
		int even2 = Character.getNumericValue(str.charAt(3));
		int even3 = Character.getNumericValue(str.charAt(5));
		int even4 = Character.getNumericValue(str.charAt(7));
		int even5 = Character.getNumericValue(str.charAt(9));
		int even6 = Character.getNumericValue(str.charAt(11));
		
		int addOdd = (odd1 + odd2 + odd3 + odd4 + odd5 + odd6)*3;
		int addEven = even1 + even2 + even3 + even4 + even5 + addOdd;
		int mod = addEven % 10;
		
		
	
		
	if (mod != 0)		{
		
			check = 10 - mod;
		
	}
	else if (mod == 0) {
			
			check = 0;
	}
		

	
	if (even6 == check)	{
		System.out.println("Check digit should be: "+ check);
		System.out.println("Check digit is: "+ even6);
		System.out.println("UPC is valid");
		
	}
	else if (even6 != check)	{
		System.out.println("Check digit should be: "+ check);
		System.out.println("Check digit is: "+even6);
		System.out.println("UPC is not valid");
	}
	System.out.print("\nEnter a UPC (enter a blankline to quit): ");
	str = keyboard.nextLine();
	x = str.length();
	
	}
		}
	
	System.out.println("Goodbye!");
		
	
	}
}

