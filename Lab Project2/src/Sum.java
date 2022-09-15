

public class Sum {
	
		  void addNumber(int b,int a)  //static method for add the number of 1to 100
		  {  
		   int i;          
		   int j=0;     
		   
		   for (i=a;i<=b;i++)      // increase the value of i is 1  
		   {
			   j=j+i;            // add the value of i  is previous value 
			
		   }
		   System.out.println("\n Addition of 1 to 100 number = "+j); 
		   }
		   
		  
		public static void main(String[] args)
		{	
			Sum Number =new Sum();     
			Number.addNumber(100,1);      // set the value for addition 
		}}