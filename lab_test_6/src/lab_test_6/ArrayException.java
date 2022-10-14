package lab_test_6;
import java.util.Scanner;
public class ArrayException {
	
	
public static int sum(int[] i,int start,int end) {       //Create method  to add the array  
int sum=0;                     
try {
for(int j=start;j<=end;j++ )                            //    create the  for addition the array element 
{	
sum+=i[j];                                               // add the array element 
}
System.out.println("Addition :"+sum);                 // print the addition 

	
if(sum==0)                                         //   if addition equalto zero then through Exception is Sum is 0
 {
System.out.println("Exception is Sum is 0");
throw new Exception();
}
}
catch(Exception e)
{
}
return sum;                   //return the sum of array 
}

		    public static void main(String[] args) { 
			int n;                                                  // declear the int n to store the size of array 
			Scanner sc=new Scanner(System.in);                       //    scaner for give the input for user 
			System.out.print("Enter the size of array : ");  		
			n=sc.nextInt();                                            // store the array size  and conver string to int 
			
			try {
				if(n==0)                                                         // if array size is zero then through IllegalArgumentException
				{
				System.out.println("IllegalArgumentException is occured.");
				throw new IllegalArgumentException();
				}
				
				
				int[] array = new int[n];                                        // create a new array   and add the array element  to user
				System.out.println("Enter the elements  ");  
				for(int i=0; i<n; i++)  
				{   
				array[i]=sc.nextInt();                                        
				}  
				
				
				if(array == null)                                                    //if user  not enter any element  then through  NullPointerException
				{
				System.out.println("NullPointerException is occured.");
				throw new NullPointerException();
				}
				
				
				
				int start;                                                  // add the sum start point for array 
				System.out.print("Enter the start of array : ");  		
				start=sc.nextInt();  
				
				
				int end;                                                   // add sum end point for array 
				System.out.print("Enter the end of array : ");  		
				end=sc.nextInt(); 
				
				
				if(start>array.length || end>=array.length ) {                          // if found start and end is out of array lenght then through ArrayIndexOutOfBoundsException
				System.out.println("ArrayIndexOutOfBoundsException is occured.");
				throw new ArrayIndexOutOfBoundsException();					
				}
				
				
			    sum(array,start,end);		 	   		                 // call method   	 	
			    }
			    catch(Exception e) {
				System.out.println("Exception is occured.");
			    }
		        }
	            }
