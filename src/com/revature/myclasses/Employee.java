package com.revature.myclasses;

public class Employee {
 String name;
 int id;
 String department;
 int salary;
 
 public void createEmployee(int id, String name, int salary, String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department= department;
		
		}
 public void displayEmployee() {
		System.out.println("\n ID : "+this.id  +"\t Name :" 
	            +this.name+ "\t Salary : $ "+
				this.salary + "\t Department : "+ this.department);
	}
}
 