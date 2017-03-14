import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a UPC (enter a blank line to quit):");
		Scanner cc= new Scanner (System.in);
		String a= cc.nextLine();
		int l=a.length();
		int test1=1;
		int test2=0;
		int sum1=0;
		int sum2=0;
		if(l<=0){
			System.out.println("Goodbye!");}
			else if(l<11||l>12){
				System.out.println("ERROR! UPC MUST have exactly 12 digits");}
			else{
		
		while(test1<=10){
			char b=a.charAt(test1);
			int inputa = Character.getNumericValue(b);
			sum1=sum1+inputa;
			test1=test1+2;
			}
		
		while(test2<=10){
			char c=a.charAt(test2);
			int inputb = Character.getNumericValue(c);
			sum2=sum2+inputb;
			test2=test2+2;
		}
		
		char f=a.charAt(11);
		int z=Character.getNumericValue(f);
		int sum3=sum2*3;
		int k=(sum3+sum1)%10;
		if( k!=0){
		k=10-(sum3+sum1)%10;
		}
		System.out.println("Check digit should be: "+k);
		System.out.println("Check digit is: "+z);
		if(z==k){
			System.out.println("UPC is valid");
		}else{
			System.out.println("UPC is not valid");
		}
		}	
	}
}
