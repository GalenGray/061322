package com.revature.myclasses;

public class EmployeeManager {

public static void main(String[] args) {
	
	Employee [] arr = new Employee[5];
	arr[0] = new Employee();
	arr[1] = new Employee();
	arr[2] = new Employee();
	arr[3] = new Employee();
	arr[4] = new Employee();
	
	arr[0] = new Employee();
	arr[0].createEmployee(1015814, "John", 4700, "Home Appliances");

   arr[1] = new Employee();
   arr[1].createEmployee(14113, "Adam", 3300, "Gardening");

     arr[2] = new Employee();
     arr[2].createEmployee(51920518, "Ester", 5000, "Comestics");

      arr[3] = new Employee();
      arr[3].createEmployee(19524,"Alex", 1900, "Sporting Goods");

      arr[4] = new Employee();
      arr[4].createEmployee(2152,"Bob", 3200, "Customer Service");	
	
	
      arr[0].displayEmployee();
      arr[1].displayEmployee();
      arr[2].displayEmployee();
      arr[3].displayEmployee();
      arr[4].displayEmployee();
	

	
}

}