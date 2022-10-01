package com.member;

public class Manager extends Member {   // manager class to  extended member
	private String department;             //to take department
	
	public Manager() {              // default constructor to set default value
		super();
	}

	public Manager(String name,int age,String mobileNo,String address,String salary,String department) {    // Parameter constructor to set the value 
		super(name, age, mobileNo, address, salary);
		this.department = department;
	}

	public String getDepartment() {         // getter Method  to get  the values
		return department;
	}

	public void setDepartment(String department) {     // setter Method to set the value 
		this.department = department;
	}
	@Override
	public void printSalary() {          // override the salary method 
		System.out.println(salary);          //print the salary 

		
	}

	


}