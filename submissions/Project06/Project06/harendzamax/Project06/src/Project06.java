import java.util.*;
public class Project06 {
	

		/*
		 * This program takes UPC number entered by the user and lets the user know if its a valid UPC
		 * 
		 * @author Max Harendza
		 * @version 02222017
		 */

		public static void main(String[] args) {
			String upc;
			char c;
			int checkUpc;
			int currentUpc;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a UPC (Blank line to quit): ");
			upc = in.nextLine();
			while (upc.length()!=0){
				if (upc.length()!=12)
					System.out.println("Must be 12 Characters");
				
					else{
						checkUpc=0;
						for (int i=0 ; i<12; i+=2)
							checkUpc = checkUpc + upc.charAt(i)-'0';
							checkUpc*=3;
							for(int i=1;i<11;i+=2)
								checkUpc=checkUpc+upc.charAt(i)-'0';
								checkUpc%=10;
							
					
						if(checkUpc!=10)
							checkUpc=10-checkUpc;
							currentUpc=upc.charAt(11)-'0';
							if(currentUpc==checkUpc)
							System.out.println("Check digit is correct");
						
						else
						{
							System.out.println("Check digit should be: " + checkUpc);
							System.out.println("Check digit is: " + currentUpc);
							System.out.println("UPC is not valid" );
						}
				}
				System.out.print("Enter a UPC - blank line to quit: ");
				upc=in.nextLine();
			}
			}
		}



