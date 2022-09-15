
public class PrimeNumbers {
       void  Pnumber  (int b)    // method of prime number 
	{
		  for (int i = 1; i <= b; i++)   //  increase the value 1 to 20 using for loops 
		  {
		 int count = 0;		
		       for (int j = 2; j <= i / 2; j++)  //increase the value of 2 to  i/2
		       {
		        if (i % j == 0) {                // check the number  prime or not prime
		       	count++;
		         break;
		         }
		         }
		       
		     if (count == 0) {                    // condition statement 
		    System.out.println(i);                // print the value is prime or 
		   }
		  }	
		}		
	public static void main(String[] args)
	{		
		PrimeNumbers Number =new PrimeNumbers();     
		Number.Pnumber(20);                         // set the value to check the prime no start from 1 
	}
	}
	
		
			
		
	


