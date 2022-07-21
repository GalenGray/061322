package com.revature.day05;

public class EmployeeManager {
public static void main(String[] args) {
 //Create an object of emp clas
	
	//Constuctor
	
 Employee e1 = new Employee();
 
 // create obj emp using parameterized emp
 Employee e2 = new Employee(020,"jas", "jas", 00d);
 
  int x;
   double y = 2000;
   //casting - converting one data type to another
   x = (int)y;
   // Above is upcasting and below is downcasting. 
   //if you are upcsting you must maually convert
   y= x;
}

}
