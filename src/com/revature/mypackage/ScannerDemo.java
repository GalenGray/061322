package com.revature.mypackage;

import java.util.Scanner;
//com.revature.mypackage.ScannerDemo fully qualified class name
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
   System.out.println("Enter Name : ");
		String name =sc.next();
       System.out.println("Hello " +name);
	
/* Command Line Argument 
 * String name = args[0];
 * 	
 */
	}

}
