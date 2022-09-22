
public class Calculator {
//for addition                   
	int Addition(int... n1)           // method of addition int value 
	{
	int sum=0;
		for(int i=0;i<n1.length;i++)         //for loop for increase array index
		{
			sum+=n1[i];                     // addition of all index
		}
		return sum;                          //return value
	}
	double Addition(double... n1)                // method of addition float  value
	{
		double sum=0;
		for(int i=0;i<n1.length;i++)                //for loop for increase array index
		{
			sum+=n1[i];                               // addition of all index
		}
		return sum;                        //return value
	}
	
	
	
//for subtraction	
	int Subtraction(int...n2)                        // method of Subtraction  int value
	{
		int m=0;
		for(int i=0;i<n2.length;i++)                 //for loop for increase array index
		{
			m=n2[i]-m;                                   // subtraction of all index
		}
		return m;                           //return value
	}
	double Subtraction(double...n2)                     // method of Subtraction  float value
	{
		double m=0;
		for(int i=0;i<n2.length;i++)                     //for loop for increase array index
		{
			m=n2[i]-m;                                       // subtraction of all index
		}
		return m;                           //return value
	}
	
	
	
	
	
//For multiplication
	int Multiplication(int...n1)                      // method of multiplication int value 
	{
		int sum=1;
		for(int i=0;i<n1.length;i++)                    //for loop for increase array index
		{
			sum =sum*n1[i];                                   //Multiplication of all index
		}
		return sum;                              //return value
	}
	double Multiplication(double...n1)                     // method of multiplication float value 
	{
		double sum=1;
		for(int i=0;i<n1.length;i++)                          //for loop for increase array index
		{
			sum =sum*n1[i];                                        //Multiplication of all index
		}
		return sum;                                    //return value
	}
	
	
	
	
	
//for division	
	int Division(int... n1)                              // method of Division int value 
	{
		int sum=n1[0];
		for(int i=1;i<n1.length;i++)                    //for loop for increase array index
		{		
				sum/=n1[i];                               //Division of all index
						
		}
		return sum;                                      //return value            
	}
	
	double Division(double... n1)                              // method of multiplication float value 
	{
		double sum=n1[0];
		for(int i=1;i<n1.length;i++)                        //for loop for increase array index
		{
			sum /=n1[i];                                       //Division of all index
		}
		return sum;                                    //return value
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Calculator add=new Calculator();                                  // Create an  object of  addition method   
		
		System.out.println("Addition 1: "+add.Addition(30,40));                  //  set the  value  addition  
		System.out.println("Addition 2: "+add.Addition(30.9,40.7));                 //set the value addition 
		
		Calculator sub=new Calculator();                                           // Create an  object of  subtraction method   
		System.out.println("Subtraction 1: "+sub.Subtraction(50,30));                  //  set the  value subtraction 
		System.out.println("Subtraction 2: "+sub.Subtraction(50.5,30));                   //  set the  value  subtraction 
	
		Calculator mul=new Calculator();                                            // Create an  object of  multiplication  method   
		System.out.println("Multiplication 1: "+mul.Multiplication(50,5));                    //  set the  value multiplication  
		System.out.println("Multiplication 2: "+mul.Multiplication(50.5,5));                    //  set the  value  multiplication 
     
		Calculator div=new Calculator();                                               // Create an  object of  division method   
		System.out.println("Division 1: "+div.Division(32,8,2,2));                       //  set the  value  division
		System.out.println("Division 2: "+div.Division(20.5,4));                           //  set the  value  division 


	}

}