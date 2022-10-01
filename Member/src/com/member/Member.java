package com.member;

public class Member {

	private String name;       // data type for store   the name 
	private int age;          //   data type for store the age
	private String mobileNo;   //   data type for store the mobile no
	private String address;    //   data type for store the address
	protected String salary;    //   data type for store the Salary
	
	public Member() {              //default Constructor  to set default value
		super();
   	}

	public Member(String name, int age, String mobileNo, String address, String salary) {     // parameterized constructor to set the value 
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {        // getter Method  to get  the values
		return name;
	}

	public void setName(String name) {        // setter Method to set the value 
		this.name = name;
	}

	public int getAge() {        // getter Method  to get  the values
		return age;
	}

	public void setAge(int age) {        // setter Method to set the value 
		this.age = age;
	}

	public String getMobileNo() {         // getter Method  to get  the values
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {        // setter Method to set the value 
		this.mobileNo = mobileNo;
	}

	public String getAddress() {                   // getter Method  to get  the values
		return address;
	}

	public void setAddress(String address) {            // setter Method to set the value 
		this.address = address;
	}

	public String getSalary() {               // getter Method  to get  the values
		return salary;
	}

	public void setSalary(String salary) {                    // setter Method to set the value 
		this.salary = salary;
	}
	
	public void printSalary() {                            // method to print the Salary
		System.out.println(salary);       // sop to print the salary
	}  
	

}