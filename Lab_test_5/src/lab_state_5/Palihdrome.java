package lab_state_5;

import java.util.Scanner;

//Write a program to check whether a given string is palindrome or not.



public class Palihdrome {

	 String user_string;                                              // data type to store user string          
	 boolean check=true;               
	 String rev=""; 
	
	 
	 
	 
	 
	    void  input_string()                                          // crate the method to input the data from user
		{
	    Scanner string1 = new Scanner(System.in);                    // Create a Scanner object
		System.out.println("Enter the string ");

	    user_string =  string1.nextLine();                           // Read user input
		System.out.println("user enter String is: " +user_string);   // Output user input
		}

	    
	    
	    
	    
		void check_palihdrome()                                       // crate the method to check string Palihdrome
		{  
		user_string = user_string.toLowerCase();                      //Converts the given string into lowercase  
	    for(int i =user_string.length()-1; i >=0; i--)               //  for loop to convert the string is revers
	    {    
	    	rev=rev+user_string.charAt(i);           
	    }
		}
	    
		
		
		
	    void display()                                          // crate the method to display string is palindrome or not 
	    {	

	    	if(user_string.equals(rev)) {                                     //if condition to  check given string and revers string is equal or not 
	    		System.out.println("Given string is palindrome");            // it's equal then string is palihdrome
	    	}
	    	 else     
		     System.out.println("Given string is not a palindrome");    
	    } 
	     
	    
	    
	    
		
	public static void main(String[] args) {
	
		Palihdrome p =new Palihdrome();                                  // Create a class  object    
		 
		p. input_string() ;                                              //call input_string method
		p.check_palihdrome() ;                                           //call the  method to check string is palihdrome or not 
		p.display();                                                     // call the display method 

	}

    }
