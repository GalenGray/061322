package com.revature.myclasses;

public class StudentManager {
//create an object
	public static void main(String[] args) {
		
	Student s1 =new Student();
	s1.createStudent(101, "Jas", "Java");
 
	
	
	//second object
	Student s2=new Student();
	s2.createStudent(102, "BOb", "AWS");
	
	s1.displayStudent();
	s2.displayStudent();
}
}