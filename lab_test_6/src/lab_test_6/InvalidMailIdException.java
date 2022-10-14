package lab_test_6;

import java.util.Scanner;

public class InvalidMailIdException {

	public static void main(String[] args) {                                
		Scanner sc=new Scanner(System.in);            //  create scanner  to give  user input  
		System.out.println("Enter Emain Id :");             
		String id=sc.next();                        //store the  email id
		try {
		boolean b= (id.contains(".") && id.contains("@") && id.endsWith("com")     // check the email id formate 
					|| id.contains(" "));
		if(b==false)                                               // through IllegalArgumentException 
		throw new IllegalArgumentException();
		System.out.println("Valid Email.");
		}
		catch(Exception iae) {
		System.out.println("InValid Email.");
		}
	    }
	    }
