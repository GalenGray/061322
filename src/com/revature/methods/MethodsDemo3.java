package com.revature.methods;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
     sum(10,12);
	}

	public static void sum(int x, int y) {
		
		int add = x+y;
		System.out.println("The addition of "+ x + " and " + y + " equals " + add);
		
	}

public static void subtract(int x, int y) {
		
		int sub = x-y;
		System.out.println("The difference of "+ x + " and " + y + " equals " + sub);
		
	}
public static void multiple(int x, int y) {
	
	int mull = x*y;
	System.out.println("The multiple of "+ x + " and " + y + " equals " + mull);
	
}
public static void divide(int x, int y) {
	
	int div = x/y;
	System.out.println("The dividend of "+ x + " and " + y + " equals " + div);
	
}

}
