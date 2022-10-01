package com.member;

public class Membermain {                //main class 

	public static void main(String[] args) {
		System.out.println("Information Of Manager");     // sop  
		Manager m=new Manager();                              //object of manager class
		m.setName("Diptish");                               // set the manager name
		m.setAge(24);                                // set the manager age  
		m.setAddress("Ahmednagar");                  // set the Manager Address
		m.setMobileNo("9503816465");                //Set the manager mobile no
		m.setDepartment("Electronics");              // set the  manager department
		m.setSalary("35k");	                        // set the manager Salary 
		
		System.out.println(" Manager Name is  "+m.getName());                // sop  for print the manager name 
		System.out.println(" Manager age is  "+m.getAge());                  // sop  for print the manager age 
		System.out.println(" Manager Mobile no is  "+m.getMobileNo());              // sop  for print the manager MobileNo
		System.out.println(" Manager Adders is  "+m.getAddress());               // sop  for print the manager Address 
		System.out.println(" Manager Department is  "+m.getDepartment());              // sop  for print the manager Department 
		System.out.print(" manager Salary is :");                    // sop  for print the salary  
		m.printSalary();                                  // call the salary method 
		
		System.out.println("\nInformation Of Employee");
		Employee e=new Employee();                                 //object of employee
		e.setName("ganesh");                                       // set the  employee name
		e.setAge(22);                                              // set the  employee age
		e.setAddress("akole ");                                    // set the  employee Address
		e.setMobileNo("8888888");                                   // set the  employee mobile no
		e.setSpe("Electronics");                                    // set the  employee Spetiolization 

		e.setSalary("23k");	                                        // set the  employee Salary 
		
		System.out.println(" Employee Name is  "+e.getName());                             // sop  for print the Employee name 
		System.out.println(" Employee Age is  "+e.getAge());                              // sop  for print the Employee Age
		System.out.println(" Employee Mobile No is  "+e.getMobileNo());                         // sop  for print the Employee Mobile no
		System.out.println(" Employee Adders is  "+e.getAddress());                          // sop  for print the Employee  Address
		System.out.println(" Employee Spetiolization is  "+e.getSpe());                               //  sop  for print the Employee Spetiolization
		System.out.print(" Salary of Employee :");                               // sop  for print the salary 
		e.printSalary();                                                  // call the salary method 
		

		

	}

}
