//Author Jiatong Ha//
//Version 20170215//
public class CloseLab06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NMAX = 10;
		         final double XMAX = 10;
		
	        // Print table header
		
		
		         for(int n = 1; n <= NMAX; n++)
		         {
		        	 System.out.println();
		         }
		        
		
		        // Print table body
		
		         for (double x = 1; x <= XMAX; x++)
		        		 {
		            // Print table row
		
		           for (int n = 1; n <= NMAX; n++)
	            {
		              System.out.printf("%10.0f", x*n);
		           }
		              System.out.println();
		           }
	}
	}


