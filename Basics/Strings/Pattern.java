package Strings;

public class Pattern {

	public static void main(String args[]) {
		
		int rows = 6;
	     
	     for (int i = 1; i <= rows; ++i) {     // for printing rows - 6
	    	 // Print spaces before the stars
	    	 for (int j = 1; j <= rows - i; ++j) { // for printing spaces
	    		 System.out.print(" ");
	    	 }
	    	
	    	 // Print stars for the current row
	    	 for (int k = 1; k <= 2 * i - 1; ++k) { // for printing cols
	    		 System.out.print("*"); 
	    	 }
	    	
	    	 // Move to the next line after each row
	    	 System.out.println();
	     }
	}
}

//r - 1 c - 1, s -1
//r - 2 c - 3, s -3
//r - 3 c - 5, s -5
//r - 4 c - 7, s -7


//r- 6, s - 0
//r- 5, s - 1
//r- 4, s - 2
//r- 3, s - 3
//r- 2, s - 4
//r- 1, s - 5



