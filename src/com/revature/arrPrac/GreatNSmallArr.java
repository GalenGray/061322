package com.revature.arrPrac;

import java.util.Arrays;

public class GreatNSmallArr {

	/*
	 * ASSIGNMENT DUE ON MONDAY (06202022)
	Write a java program to create an array of 11 elements, In the array, do the following:
	1.	Assign value to individual array elements ? random values  - Done 
	2.	Display the array using the enhanced for loop  - Done 
	3.	Calculate and display the sum of the elements of the array - Done
	4.	Display all the even numbers in the array
	5.	Display all the odd numbers in the array
	6.	Calculate and display the sum of even and odd numbers
	7.	Sort the array in descending and ascending order
	8.	Find the average of the array
	9.	Display the 3 greatest and smallest number

	 */
	
	public static void main(String[] args) {
		int arr[] = {12,10,17,2,1,8,15,19,13,20,7};

		 Arrays.sort(arr);
		 //Smallest 1, 2, 7
		
		 for(int i = 0; i<3; i++ ) {
			 System.out.println(arr[i]);
		 }
		
	
		
		 // Largest 20,19,17
		 int x = arr.length;
	
		 
		 System.out.println(arr[x-1]);
		 System.out.println(arr[x-2]);
		 System.out.println(arr[x-3]);
			}
		}
		
	
	

