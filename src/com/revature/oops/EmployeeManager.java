package com.revature.oops;

public class EmployeeManager {

	public static void main(String[] args) {
		SalariedEmployee se =new SalariedEmployee(199,"bob",159);
	double saSE = se.calculateSalary(se.getDaysPresent());
	System.out.println("Name : " + se.getName());
	 System.out.println("ID : " + se.getId());
	 System.out.println("Hours Worked : " + se.getDaysPresent());
	 System.out.println("Salary : " + saSE);
	 
		
	 ContractEmployee ce = new ContractEmployee(12, "yup", 111); 
	 double saCE = ce.calculateSalary(ce.getHoursWorked());
	 System.out.println("Name : " + ce.getName());
	 System.out.println("ID : " + ce.getId());
	 System.out.println("Hours Worked : " + ce.getHoursWorked());
	 System.out.println("Salary : " + saCE);
	 
	}

}
	


