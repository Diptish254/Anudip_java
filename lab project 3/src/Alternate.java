

 public class Alternate {
	 
	 
	int[] Alt(int g1[])         //  method sorting of array
    {
	int countt=0;                     
     int  arry[]=new int [g1.length/2];		   // create array to store the sorrting of array
     for(int i=0;i<g1.length;i++)   
     {	
	if(i%2==0)               // condition for alerting no 
	{
		arry[countt]=g1[i];        // copy array 
		countt++;
	}
	
     }
	return arry;                           // return the finall array
	}
	
	
	
	 void display(int x[])                           // Create the array display method
	 {
		 for(int i=0;i<x.length;i++)                  // for loop for increase the array index and print 
		 {
		 	System.out.println(x[i]);
		 }
	 }
	  void addition (int y[])                                   // add the alternating array 
	  {
		  int sum=0;
		  for(int i=0; i< y.length;i++)                       // increase  the array index  and add one by one 
		  {
		  	sum+=y[i];
		  }
		  System.out.print("Addition of array :"+sum);    
	  }
	 
	 
	
	public static void main(String[] args) {
		Alternate a1=new Alternate();                 // create the object 
	    int a[]= {1,2,3,4,5,6,7,8,9,10};               // array  
	    int b[]= a1.Alt(a);                           // store  the aleternating array 
	
	    a1.display(b);                                  // call display method 
        
	    a1.addition(b);                                  // call array addition array 
	    
	  
	} 
}
 

	 