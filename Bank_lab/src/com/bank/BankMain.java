package com.bank;

public class BankMain {

	public static void main(String[] args) {
		BankA A=new BankA();                       //object balance of bank A
		System.out.println("Money deposited by boy in Bank A : "+A.getBalance());     // print the balance  of bank A
		
		BankB B=new BankB();                      //object of Bank B 
		System.out.println("Money deposited by boy in Bank B : "+B.getBalance());   //Print the Balance of bank  B

		BankC C=new BankC();                  //object of Bank C
		System.out.println("Money deposited by boy in Bank C : "+C.getBalance());  //print the Balance of bank c

		

	}
}