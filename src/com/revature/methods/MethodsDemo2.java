package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo2 {
	public static void main(String [] args) {
		
        sum(); // method call
        subtract();
        multiply();
        divide();
    }
    // method definition
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();
        int result = n1 + n2;
        System.out.println("Sum of " + n1 + " and " + n2 + " = " + result);
    }
    public static void subtract() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();
        int result = n1 - n2;
        System.out.println("Difference of " + n1 + " and " + n2 + " = " + result);
    }


     public static void multiply() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    int n1 = sc.nextInt();
    System.out.print("Enter Number 2 : ");
    int n2 = sc.nextInt();
    int result = n1 * n2;
    System.out.println("Multiple of " + n1 + " and " + n2 + " = " + result);
}


      public static void divide() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number 1 : ");
    int n1 = sc.nextInt();
    System.out.print("Enter Number 2 : ");
    int n2 = sc.nextInt();
    int result = n1 / n2;
    System.out.println("Dividend of " + n1 + " and " + n2 + " = " + result);
  }
    
}
