package com.member;

public class Employee extends Member{          // employee class to extend Members
	private String spe;           // set the employee specialization
	
	
	public Employee() {        //default constructor 
		super();
	}

	public Employee(String name, int age, String mobileNo, String address, String salary) {      //parameterized constructor
		super(name, age, mobileNo, address, salary);
		this.spe = spe;
	}

	public String getSpe() {                 //getter method to get the value 
		return spe;
	}

	public void setSpe(String spe) {              //setter the method to set the value 
		this.spe = spe;
	}

	@Override
	public void printSalary() {         // override the salary method 
		System.out.println(salary);        //print the salary
	} 
	
    
    
    
}
 