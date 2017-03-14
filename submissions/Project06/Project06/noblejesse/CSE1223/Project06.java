import java.util.Scanner;
public class Project06 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a UPC (enter a blank line to quit): ");
		String UPC=in.nextLine(),out="";
		int spot=0, length=UPC.length(),CD=0,DC=0, sumOdd=0,sumEven=0,Total=0;
		while (UPC.length()!=0) {
			if (UPC.length() != 12){
				System.out.println("ERROR! UPC MUST have exactly 12 digits. Enter a new UPC: ");
				UPC=in.nextLine();
			}
			while (spot<(length-1)){
				 if(spot%2!=0){
					char num=UPC.charAt(spot);
					sumEven=sumEven+Character.getNumericValue(num);
					spot=spot+1;
				}
				else {
					char num=UPC.charAt(spot);
					sumOdd=sumOdd+Character.getNumericValue(num);
					spot=spot+1;
				}
			}
			sumOdd=sumOdd*3;
			Total=sumOdd+sumEven;
			if(Total%10!=0){
				CD=10-(Total%10);
			}
			else {
				CD=0;
			}
			char check=UPC.charAt(UPC.length()-1);
			DC=Character.getNumericValue(check);
			System.out.println("Check digit should be: "+DC);
			System.out.println("Check digit is: "+CD);
			if (CD==DC){
				System.out.println("UPC is valid");
			}
			else {
				System.out.println("UPC is invalid");
			}
			System.out.println("Enter a UPC (enter a blank line to quit): ");
			UPC=in.nextLine();
			
		}
		System.out.println("Goodbye.");
	}

}
