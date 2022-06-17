package com.revature.day05;

public class Employee {
int id;
String name;
String dept;
double salary;

// non - parameterized constuctor
public Employee() {
	System.out.println();
}
//parameterized construcotr
public Employee(int id, String name, String dept, double salary) {
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
	System.out.println("para constrctor");
}
 public int add(int x, int y) {
	 return (x + y);
	 
 }
 // Overloading Different parameter but same name
 public int add (int x, int y, int z) {
	 return (x+y+z); 
 }
}
