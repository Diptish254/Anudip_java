
public class Matrix {
	
	 int[][] multiplication(int[][] x, int[][] y)        // method multiplication of array
	 {
		int[][] z = new int[x.length][x[0].length];      // create third array to store the multiplication 
		
		for(int i = 0; i < x.length; i++)  {              // nested for loop for mulltiplay both array 
			
		     for(int j = 0; j < x[i].length; j++) {
		    	 
			     z[i][j] = x[i][j] * y[i][j];             // formula for multiplication array  
	        
		}}
		     return z;                               // Returning 2D array.
	 }
	
	 
	 
	 
    	 void display(int x[ ][ ])                    // display method 
	   {
	   for(int i = 0; i < x.length; i++)          
	   {
		 for(int j = 0; j < x[i].length; j++)
			System.out.print(x[i][j]+ " ");               
	     	System.out.println();
	   }
	 }  
    	 
    	 
	
	public static void main(String[ ] args)    
	{
     Matrix obj = new Matrix();                         // Create an object of class To dimantional Array. 
	  int[ ][ ] x = {{1, 2}, {3, 4}};
	  int[ ][ ] y = {{5, 6}, {7, 8}};
	  
	  
	  
	 
	  int[ ][ ] z= new int[x.length][x[0].length];       // new array 

	      z = obj.multiplication(x, y);      	         //  call multiplication method	  				 
      
	   System.out.println("Matrix multiplication : ");
	    obj.display(z);                                    //  call display method 
	 }
	}
