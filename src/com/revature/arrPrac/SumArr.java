package com.revature.arrPrac;

public class SumArr {
	/*
	 * ASSIGNMENT DUE ON MONDAY (06202022)
	Write a java program to create an array of 11 elements, In the array, do the following:
	1.	Assign value to individual array elements – random values
	2.	Display the array using the enhanced for loop
	3.	Calculate and display the sum of the elements of the array
	4.	Display all the even numbers in the array
	5.	Display all the odd numbers in the array
	6.	Calculate and display the sum of even and odd numbers
	7.	Sort the array in descending and ascending order
	8.	Find the average of the array
	9.	Display the 3 greatest and smallest number

	 */
	public static void main(String[] args) {
		
		int arr[] = new int[11];
		arr[0] = 12;
		arr[1] = 10;
		arr[2] = 17;
		arr[3] = 2;
		arr[4] = 1;
		arr[5] = 8;
		arr[6] = 15;
		arr[7] = 19;
		arr[8] = 13;
		arr[9] = 20;
		arr[10] = 7;
		
		
		//#3 
				int sum = 0; 
		    for(int wsum : arr) {
		    	sum+=wsum;
		    System.out.println(sum);	
		    
		   
		    }
		   
		
	}
}
