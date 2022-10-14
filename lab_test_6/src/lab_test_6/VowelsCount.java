package lab_test_6;

import java.util.Scanner;

public class VowelsCount {
	
	    public static int countVowels()                       // create a method countVowels
	    {
		Scanner sc=new Scanner(System.in);                                   
		System.out.println("Enter The string :");          
		String s1=sc.next();                             // store the    user value                                               
		char ch[]=s1.toCharArray();                      //   conver the steing into array 
	    int count=0;
	    for(int i=0;i<ch.length;i++)                                  //create loop for array 
	    {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')      //if condition to check  vowels are present or not 
		{
		count++;
	    }
		}
	    
	    
	    try {                                                 //       if   string contain x then through  exception 
	    	if(s1.contains("x"))                       
	    	throw new Exception();
	        }
	    catch(Exception e) 
	        {
	    	System.out.println("String should not conatin x");
	        }
	    return count;                                             // return vowel count 
	       }
	
	public static void main(String[] args) {  
		System.out.println("Number of vowels in the String :"+countVowels());          // enter the string and call the method             
	     }

         }
